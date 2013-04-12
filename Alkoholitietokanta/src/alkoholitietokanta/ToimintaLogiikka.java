package alkoholitietokanta;

import com.avaje.ebean.EbeanServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author katu
 *
 * ToimintaLogiikka-luokassa järjestelmään onnistuneesti kirjautunut käyttäjä
 * pääsee ylläpitämään omia juomiskokemuksiaan. Tämän luokan kautta käyttäjä
 * lisää ja poistaa juomiaan, sekä baareja. Myöskin juomakertojen
 * (ryyppyreissujen) lisäily onnistuu sekä TOP-5 asioiden listaukset.
 *
 * Lisäilyt kirjataan kirjautuneen käyttäjän mukaan.
 *
 *
 */
public class ToimintaLogiikka {

    private String tunnus;
    private Kayttaja kirjautunutKayttaja;
    private EbeanServer serveri;

    public ToimintaLogiikka(Kayttaja kayttaja, EbeanServer serveri) throws IOException {

        this.tunnus = "kakkanapa";
        this.serveri = serveri;
        this.kirjautunutKayttaja = kayttaja;
        XEiKaytossaJuomalista kaikkiJuomat = new XEiKaytossaJuomalista("src/juomat.txt");
        XEiKaytossaBaarilista kaikkiBaarit = new XEiKaytossaBaarilista("src/baarit.txt");
        //BaariHallinta hallinta = new baariHallinta("src/paikat/"+tunnus+".txt");
        JuomaHallinta juomaHallinta = new JuomaHallinta("src/juomat/" + tunnus + ".txt");

        kaikkiJuomat.lataa();
        kaikkiBaarit.lataa();
        juomaHallinta.lataa();

        Scanner lukija = new Scanner(System.in);
        BufferedReader multiLukija = new BufferedReader(new InputStreamReader(System.in));
        int valinta = 0;

        while (valinta != 9) {
            System.out.println("---------------------");
            System.out.println("Olet kirjautunut sisään käyttäjänä: " + this.tunnus);
            System.out.println("---------------------");
            System.out.println("1. Lisää juoma");
            System.out.println("2. Poista juoma");
            System.out.println("3. Listaa juomat");
            System.out.println("4. Lisää baari");
            System.out.println("5. Poista baari");
            System.out.println("6. Top 5 juoduimmat");
            System.out.println("7. Top 5 paras alkoholi/hinta ");
            System.out.println("8. Top 5 paras kokemus/hinta");
            System.out.println("9. Palaa kirjautumisvalikkoon");
            System.out.println("---------------------");
            System.out.println("Anna valintanumero: ");
            valinta = lukija.nextInt();

            if (valinta == 1) {
                lisataanJuoma(multiLukija, lukija, kaikkiJuomat);
            }
            if (valinta == 2) {
                poistetaanJuoma(multiLukija, lukija, kaikkiJuomat);
            }

            if (valinta == 3) {
                tulostetaanJuomat(kaikkiJuomat);
            }

            if (valinta == 4) {
                baarinLisays(multiLukija, kaikkiBaarit);
            }

            if (valinta == 5) {
                baarinPoisto(multiLukija, kaikkiBaarit);
            }
            if (valinta < 1 || valinta > 9) {
                System.out.println("Ole hyvä ja valitse 1-9 väliltä.\n");
            }
        }
    }

    public void tulostetaanJuomat(XEiKaytossaJuomalista kaikkiJuomat) {
        System.out.println("---------------------");
        List<Juoma> tulostettavatJuomat = serveri.find(Juoma.class).findList();
        for (Juoma j : tulostettavatJuomat) {
            System.out.println(j);
        }
        System.out.println("---------------------");
        Scanner odotetaanEnteria = new Scanner(System.in);
        System.out.println("Paina enteriä jatkaaksesi.");
        odotetaanEnteria.nextLine();
    }

    public void lisataanJuoma(BufferedReader multiLukija, Scanner lukija, XEiKaytossaJuomalista kaikkiJuomat) throws IOException {
        System.out.println("Anna juoman nimi:");
        String juomanNimi = multiLukija.readLine();
        System.out.println("Anna juoman kuvaus");
        String juomanKuvaus = multiLukija.readLine();
        System.out.println("Anna juoman alkoholiprosentit (muotoesimerkki 4.7)");
        Double juomanProsentit = lukija.nextDouble();
        Juoma lisattavaJuoma = new Juoma(juomanNimi, juomanKuvaus, juomanProsentit);
        //lisattavaJuoma.setLisaaja(this.kirjautunutKayttaja);


        if (kaikkiJuomat.loytyykoJuomaListalta(juomanNimi) == false) {
            this.serveri.save(lisattavaJuoma);
        } else {
            System.out.println("Juoman lisäys epäonnistui");
        }
    }

    public void poistetaanJuoma(BufferedReader multiLukija, Scanner lukija, XEiKaytossaJuomalista kaikkiJuomat) throws IOException {
        System.out.println("Anna juoman nimi:");
        String juomanNimi = multiLukija.readLine();


        if (kaikkiJuomat.loytyykoJuomaListalta(juomanNimi) == true) {
            kaikkiJuomat.poistaJuomalistastaJuoma(juomanNimi);
            kaikkiJuomat.talleta();
            System.out.println("Juoman poisto onnistui");
        } else {
            System.out.println("Juoman poisto epäonnistui");
        }
    }

    public void baarinLisays(BufferedReader multiLukija, XEiKaytossaBaarilista kaikkiBaarit) throws IOException {
        System.out.println("Anna baarin nimi:");
        String baarinNimi = multiLukija.readLine();
        System.out.println("Anna baarin kuvaus");
        String baarinKuvaus = multiLukija.readLine();
        Baari bb = new Baari(baarinNimi, baarinKuvaus);
        if (kaikkiBaarit.loytyykoBaariListasta(baarinNimi) == false) {
            kaikkiBaarit.lisaaBaari(bb);
            kaikkiBaarit.talleta();
        } else {
            System.out.println("Lisäys epäonnistui.");
        }
    }

    public void baarinPoisto(BufferedReader multiLukija, XEiKaytossaBaarilista kaikkiBaarit) throws IOException {
        System.out.println("Anna baarin nimi:");
        String baarinNimi = multiLukija.readLine();
        if (kaikkiBaarit.loytyykoBaariListasta(baarinNimi) == true) {
            kaikkiBaarit.poistaBaari(baarinNimi);
            kaikkiBaarit.talleta();
        }
    }
}
