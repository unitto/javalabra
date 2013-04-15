package alkoholitietokanta;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Query;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author katu
 *
 * BaariHallinta-luokka suorittaa baarien ylläpidon tietokannassa. Luokasta
 * löytyy lisäämisen, lyötämisen ja poistamiseen liittyvät toiminnallisuudet.
 *
 *
 */
public class BaariHallinta {

    private EbeanServer serveri;
    private Scanner lukija;

    public BaariHallinta(EbeanServer server) {
        this.serveri = server;
    }

    public boolean lisaa(String nimi, String kuvaus) {

        if (Loytyyko(nimi) == true) {
            return false;
        } else {
            Baari b = new Baari(nimi, kuvaus);
            try {
                this.serveri.save(b);
            } catch (Exception e) {
                System.out.println("Jotain meni pahasti pieleen");
            }
            return true;
        }
    }

    public boolean Loytyyko(String baarinNimi) {
        System.out.println("Haetaan baarilla " + baarinNimi);
        List<Baari> tulos = hakuBaarinNimella(baarinNimi);

        if (tulos != null && tulos.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean poista(String baarinNimi) {

        System.out.println("Haetaan baarilla " + baarinNimi);
        List<Baari> tulos = hakuBaarinNimella(baarinNimi);

        if (tulos != null && tulos.size() > 0) {
            Baari poistettava = tulos.get(0);
            this.serveri.delete(poistettava);
            return true;
        } else {
            return false;
        }
    }

    public List<Baari> hakuBaarinNimella(String baarinNimi) {
        String tehtavaHaku =
                " find baari "
                + " where nimi = :pBaari ";
        Query<Baari> query = this.serveri.createQuery(Baari.class, tehtavaHaku);
        query.setParameter("pBaari", baarinNimi);
        List<Baari> tulos = query.findList();
        return tulos;
    }
}
