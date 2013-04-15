package alkoholitietokanta;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author katu
 *
 * KayttajaHallinta-luokka sisältää käyttäjien hallinnoimiseen tarvittavat
 * toiminnallisuudet.
 *
 * Loytyyko-luokka toimii kahdella tavalla, joko pelkällä tunnuksella tai sitten
 * tunnuksella ja salasanalla. Tunnuksia haetaan ja verrataan tietokannasta.
 * Lisää ja poista metodit toimivat nimiensä mukaisesti.
 *
 * HaeKaytaja-metodi auttaa Loytyyko-metodeja.
 *
 *
 */
public class KayttajaHallinta {

    private EbeanServer serveri;
    private Scanner lukija;

    public KayttajaHallinta(EbeanServer server) {
        this.serveri = server;
    }

    public boolean lisaa(String tunnus, String salasana) {

        if (Loytyyko(tunnus) == true) {
            return false;
        } else {
            Kayttaja t = new Kayttaja(tunnus, salasana);
            try {
                this.serveri.save(t);
            } catch (Exception e) {
                System.out.println("Jotain meni pahasti pieleen");
            }
            return true;
        }
    }

    public boolean poista(String tunnus, String salasana) {
        Kayttaja poistettava = HaeKayttaja(tunnus, salasana);

        if (poistettava != null) {
            this.serveri.delete(poistettava);
            return true;
        } else {
            return false;
        }
    }

    public boolean Loytyyko(String tunnus) {

        String tehtavaHaku =
                " find kayttaja "
                + " where tunnus = :pTunnus ";

        Query<Kayttaja> query = this.serveri.createQuery(Kayttaja.class, tehtavaHaku);
        query.setParameter("pTunnus", tunnus);
        List<Kayttaja> tulos = query.findList();

        if (tulos != null && tulos.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Loytyyko(String tunnus, String salasana) {
        if (HaeKayttaja(tunnus, salasana) != null) {
            return true;
        } else {
            return false;
        }
    }

    public Kayttaja HaeKayttaja(String tunnus, String salasana) {
        String tehtavaHaku =
                " find kayttaja "
                + " where tunnus = :tunnus AND "
                + "salasana = :salasana";

        Query<Kayttaja> query = this.serveri.createQuery(Kayttaja.class, tehtavaHaku);
        query.setParameter("tunnus", tunnus);
        query.setParameter("salasana", salasana);
        List<Kayttaja> tulos = query.findList();

        if (tulos != null && tulos.size() > 0) {
            return tulos.get(0);
        } else {
            return null;
        }
    }
}
/**
 *
 * Vanhan version tekstitiedostoversion metodeja
 *
 * public void lataa() throws IOException { File tunnuksetSalasanoineen = new
 * File(tiedosto); if (!tunnuksetSalasanoineen.exists()) {
 * tunnuksetSalasanoineen.createNewFile(); }
 *
 * try { this.lukija = new Scanner(tunnuksetSalasanoineen); String tunnus;
 * String salasana; while (lukija.hasNext()) { tunnus = this.lukija.next();
 * salasana = this.lukija.next(); lisaa(tunnus, salasana); } } catch (Exception
 * e) { System.out.println("Tiedostoa ei löydy."); } }
 *
 * public void talleta() throws IOException { File tunnuksetSalasanoineen = new
 * File(tiedosto); try (FileWriter kirjoittaja = new
 * FileWriter(tunnuksetSalasanoineen)) { for (String s :
 * this.kayttajatJaSalasanat.keySet()) { kirjoittaja.write(s + " " +
 * this.kayttajatJaSalasanat.get(s)); kirjoittaja.write("\n"); } } }
 *
 * public boolean Loytyyko(String tunnus, String salasana) { for (String s :
 * this.kayttajatJaSalasanat.keySet()) { if (s.equalsIgnoreCase(tunnus) &&
 * this.kayttajatJaSalasanat.get(s).equals(salasana)) { return true; } } return
 * false; }
 *
 * public HashMap<String, String> getLista() { return this.kayttajatJaSalasanat;
 * }
 *
 */
