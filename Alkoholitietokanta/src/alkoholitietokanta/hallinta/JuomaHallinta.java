/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta.hallinta;

import alkoholitietokanta.domain.Juoma;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Query;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author katu
 *
 * JuomaHallinta-luokka suorittaa juomien ylläpidon tietokannassa. Luokasta
 * löytyy lisäämisen, lyötämisen ja poistamiseen liittyvät toiminnallisuudet.
 *
 *
 */
public class JuomaHallinta {

    private EbeanServer serveri;
    private Scanner lukija;

    public JuomaHallinta(EbeanServer server) {
        this.serveri = server;
    }

    public boolean lisaa(String juoma, String kuvaus, double alkoholiprosentti, String lisaaja) {

        if (Loytyyko(juoma) == true) {
            return false;
        } else {
            Juoma j = new Juoma(juoma, kuvaus, alkoholiprosentti, lisaaja);
            try {
                this.serveri.save(j);
            } catch (Exception e) {
                System.out.println("Jotain meni pahasti pieleen");
            }
            return true;
        }
    }

    public boolean Loytyyko(String juomanNimi) {

        List<Juoma> tulos = hakuJuomanNimella(juomanNimi);

        if (tulos != null && tulos.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean poista(String juomanNimi) {

        List<Juoma> tulos = hakuJuomanNimella(juomanNimi);

        if (tulos != null && tulos.size() > 0) {
            Juoma poistettava = tulos.get(0);
            this.serveri.delete(poistettava);
            return true;
        } else {
            return false;
        }
    }

    public List<Juoma> hakuJuomanNimella(String juomanNimi) {
        String tehtavaHaku =
                " find juoma "
                + " where name = :pJuoma ";
        Query<Juoma> query = this.serveri.createQuery(Juoma.class, tehtavaHaku);
        query.setParameter("pJuoma", juomanNimi);
        List<Juoma> tulos = query.findList();
        return tulos;
    }

    public Juoma LoytyykoJuomaNimellaPalautetaanJuoma(String juomanNimi) {
        List<Juoma> tulos = hakuJuomanNimella(juomanNimi);

        if (tulos != null && tulos.size() > 0) {

            return tulos.get(0);
        } else {
            return null;
        }
    }
}

/*
 * vanhoja tekstitiedostoihin perustuvia metodeja 
 
public void lataa() throws IOException {
        File kaikkiJuonnit = new File(tiedosto);
        if (!kaikkiJuonnit.exists()) {
            kaikkiJuonnit.createNewFile();
        }

        this.lukija = new Scanner(kaikkiJuonnit);
        String rivi;
        String juomanNimi;
        int juomaKerrat;

        while (this.lukija.hasNextLine()) {
            rivi = this.lukija.nextLine();
            Scanner luettuRivi = new Scanner(rivi);
            String delimitterit = "[|]";
            try {
                String[] osat = rivi.split(delimitterit);
                juomanNimi = osat[0].replaceAll("\\s", "");
                juomaKerrat = Integer.parseInt(osat[1]);

                this.juontiLista.put(juomanNimi, juomaKerrat);
                System.out.println("Read: " + juomanNimi + " times " + juomaKerrat);
            } catch (Exception e) {
                System.out.println("Tiedostoa ei löydy.");
            }
        }
    }

    public void talleta() throws IOException {
        File kaikkiJuonnit = new File(tiedosto);
        try (FileWriter kirjoittaja = new FileWriter(kaikkiJuonnit)) {
            for (String j : this.juontiLista.keySet()) {
                kirjoittaja.write(j + " | " + this.juontiLista.get(j));
                kirjoittaja.write("\n");
            }
        }
    }
*/