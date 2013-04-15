package alkoholitietokanta;

import com.avaje.ebean.EbeanServer;
import java.io.IOException;
import java.util.Scanner;
import javax.persistence.OptimisticLockException;

/**
 *
 * @author katu
 *
 * Kirjautuminen-luokka avaa ensimmäisen menu-ruudun mainilla tuodolla
 * EbeanServerillä sekä boolean-tiedolla, jolla ohjelmalle kerrotaan onko
 * käytössä tyhjä & uusi tietokanta. Mikäli boolean on true, niin
 * alustetaanTietokanta() luo tietokantaan muutaman entryn.
 *
 * Mikäli boolean on false, niin tietokantaan ei kosketa ja sen käyttöä
 * jatketaan normaalistin.
 *
 * Kirjautumisruudussa voidaan lisätä ja poistaa käyttäjiä. Käyttäjät
 * tallentuvat tietokantaan. Lisäksi ruudussa voi myös kirjautua
 * ToimintaLogiikka-luokkaan, sekä poistua ohjelmasta.
 *
 *
 *
 */
public class Kirjautuminen {

    private EbeanServer server;

    public Kirjautuminen(EbeanServer serveri) {
        this.server = serveri;
    }

    public void ohjelmanAloitus(boolean uusiTietokanta) throws IOException, Exception {
        Scanner lukija = new Scanner(System.in);
        KayttajaHallinta hallinta = new KayttajaHallinta(server);
        if (uusiTietokanta == true) {
            alustetaanTietokanta();
        }

        System.out.println("Tervetuloa Alkoholitietokantaan! \nJatka valitsemalla alla olevasta menusta. ");
        int valinta = 0;

        while (valinta != 4) {
            System.out.println("---------------------");
            System.out.println("1. Lisää käyttäjä");
            System.out.println("2. Kirjaudu sisään");
            System.out.println("3. Poista käyttäjä");
            System.out.println("4. Lopeta");
            System.out.println("---------------------");
            System.out.print("Anna valintanumero: ");
            valinta = lukija.nextInt();

            if (valinta == 1) {
                tunnuksenLisays(lukija, hallinta);
            }
            if (valinta == 2) {
                System.out.println("Anna tunnus: ");
                String tun = lukija.next();
                System.out.print("Anna salasana: ");
                String sal = lukija.next();
                if (hallinta.Loytyyko(tun, sal) == true) {
                    ToimintaLogiikka kirjauduttuSisaanToimintalogiikkaan = new ToimintaLogiikka(hallinta.HaeKayttaja(tun, sal), server);
                } else {
                    System.out.println("Kirjautuminen epäonnistui, tarkasta tunnus ja salasana.");
                }
            }
            if (valinta == 3) {
                tunnuksenPoisto(lukija, hallinta);
            }
            if (valinta == 4) {
                System.out.println("Kiitoksia käytöstä & hyvää päivänjatkoa!\n");
                valinta = 4;
            }
            if (valinta < 1 || valinta > 4) {
                System.out.println("Ole hyvä ja valitse 1-4 väliltä.\n");
            }
        }
    }

    private static void tunnuksenLisays(Scanner lukija, KayttajaHallinta hallinta) throws IOException {
        System.out.print("Anna tunnus: ");
        String tun = lukija.next();
        System.out.print("Anna salasana: ");
        String sal = lukija.next();
        if (hallinta.lisaa(tun, sal) == true) {
            System.out.println("Tunnuksen lisäys onnistui, tallennetaan.");
        } else {
            System.out.println("Tunnuksen lisääminen ei onnistunut, kokeile toista tunnusta.");
        }
    }

    private static void tunnuksenPoisto(Scanner lukija, KayttajaHallinta hallinta) throws IOException {
        System.out.print("Anna poistettava tunnus: ");
        String tun = lukija.next();
        System.out.print("Anna poistettavan tunnuksen salasana: ");
        String sal = lukija.next();
        if (hallinta.poista(tun, sal) == true) {
            System.out.println("Tunnuksen poistaminen onnistui.");
        } else {
            System.out.println("Tunnuksen poistaminen ei onnistunut, tarkasta tunnuksen ja salasanan oikeinkirjoitus.");
        }
    }

    private void alustetaanTietokanta() throws OptimisticLockException {
        Kayttaja k1 = new Kayttaja("asd", "222");
        Juoma j1 = new Juoma("Black Rat", "Natural dry apple cider", 4.7, "Matti");
        Baari b1 = new Baari("William K", "Mukava oluthuone");
        BaariReissu br1 = new BaariReissu();
        server.save(k1);
        server.save(j1);
        server.save(b1);
        

    }
}
