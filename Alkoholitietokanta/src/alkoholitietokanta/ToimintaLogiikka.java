package alkoholitietokanta;

import com.avaje.ebean.EbeanServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
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

    public ToimintaLogiikka(Kayttaja kayttaja, EbeanServer serveri) throws IOException, Exception {

        this.tunnus = kayttaja.getTunnus();
        this.serveri = serveri;
        this.kirjautunutKayttaja = kayttaja;
        BaariHallinta baariHallinta = new BaariHallinta(serveri);
        JuomaHallinta juomaHallinta = new JuomaHallinta(serveri);

        Scanner lukija = new Scanner(System.in);
        BufferedReader multiLukija = new BufferedReader(new InputStreamReader(System.in));
        int valinta = 0;

        while (valinta != 9) {
            tulostaMenu();
            valinta = lukija.nextInt();

            if (valinta == 1) {
                lisaykset(lukija, multiLukija, juomaHallinta, baariHallinta);

            }
            if (valinta == 2) {
                poistot(lukija, multiLukija, juomaHallinta, baariHallinta);
            }

            if (valinta == 3) {
                listaukset(lukija);
            }

            if (valinta == 4) {
                System.out.println("1: Lisää baarireissu \n2: Lisää baarireissu ryyppyreissuun");
                int valintaSisalla = lukija.nextInt();
                if (valintaSisalla == 1) {
                    LisataanBaariReissu(multiLukija, baariHallinta, juomaHallinta, lukija, serveri);
                } else if (valintaSisalla == 2) {
                    RyyppyReissu rReissu = new RyyppyReissu();
                    System.out.println("Luodaan uusi Ryyppyreissu. Valitse alla olevasta listasta valmiita baarikeikkoja: ");
                    tulostetaanBaariReissut();



                } else {
                    System.out.println("Huono valinta :(");
                }
            }

            if (valinta == 5) {
                //baarinPoisto(multiLukija, kaikkiBaarit);
            }
            if (valinta < 1 || valinta > 9) {
                System.out.println("Ole hyvä ja valitse 1-9 väliltä.\n");

            }
        }
    }

    public void tulostaMenu() {
        System.out.println("---------------------");
        System.out.println("Olet kirjautunut sisään käyttäjänä: " + this.tunnus);
        System.out.println("---------------------");
        System.out.println("1. Lisää juoma / baari");
        System.out.println("2. Poista juoma / baari");
        System.out.println("3. Listaa juomat / baarit");
        System.out.println("4. Lisää baarireissu / ryyppyreissu");
        System.out.println("6. Top 5 juoduimmat");
        System.out.println("7. Top 5 paras alkoholi/hinta ");
        System.out.println("8. Top 5 paras kokemus/hinta");
        System.out.println("9. Palaa kirjautumisvalikkoon");
        System.out.println("---------------------");
        System.out.println("Anna valintanumero: ");
    }

    public void tulostetaanJuomat() {
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

    public void tulostetaanBaarit() {
        System.out.println("---------------------");
        List<Baari> tulostettavatBaarit = serveri.find(Baari.class).findList();
        for (Baari b : tulostettavatBaarit) {
            System.out.println(b);
        }
        System.out.println("---------------------");
        Scanner odotetaanEnteria = new Scanner(System.in);
        System.out.println("Paina enteriä jatkaaksesi.");
        odotetaanEnteria.nextLine();
    }

    public void tulostetaanBaariReissut() {
        System.out.println("---------------------");
        List<BaariReissu> tulostettavatBaariReissut = serveri.find(BaariReissu.class).findList();
        Iterator<BaariReissu> iteraattori = tulostettavatBaariReissut.iterator();
        while (iteraattori.hasNext()) {
            BaariReissu b = iteraattori.next();
            b.tulostaJuomat();
        }
        System.out.println("---------------------");
        Scanner odotetaanEnteria = new Scanner(System.in);
        System.out.println("Paina enteriä jatkaaksesi.");
        odotetaanEnteria.nextLine();
    }

    public void lisataanJuoma(BufferedReader multiLukija, Scanner lukija, JuomaHallinta juomaHallinta) throws IOException {
        System.out.println("Anna juoman nimi:");
        String juomanNimi = multiLukija.readLine();
        System.out.println("Anna juoman kuvaus");
        String juomanKuvaus = multiLukija.readLine();
        System.out.println("Anna juoman alkoholiprosentit (muotoesimerkki 4.7)");
        Double juomanProsentit = lukija.nextDouble();
        Juoma lisattavaJuoma = new Juoma(juomanNimi, juomanKuvaus, juomanProsentit, this.kirjautunutKayttaja.getTunnus());

        if (juomaHallinta.Loytyyko(juomanNimi) == false) {
            this.serveri.save(lisattavaJuoma);
        } else {
            System.out.println("Juoman lisäys epäonnistui");
        }
    }

    public void poistetaanJuoma(BufferedReader multiLukija, Scanner lukija, JuomaHallinta juomaHallinta) throws IOException {
        System.out.println("Anna juoman nimi:");
        String juomanNimi = multiLukija.readLine();
        if (juomaHallinta.poista(juomanNimi) == true) {
            System.out.println("Juoman poisto onnistui!");
        } else {
            System.out.println("Juoman poisto epäonnistui, tarkasta kirjoitusasu.");
        }

    }

    public void baarinLisays(BufferedReader multiLukija, BaariHallinta baariHallinta) throws IOException {
        System.out.println("Anna baarin nimi:");
        String baarinNimi = multiLukija.readLine();
        System.out.println("Anna baarin kuvaus");
        String baarinKuvaus = multiLukija.readLine();
        Baari lisattavaBaari = new Baari(baarinNimi, baarinKuvaus);

        if (baariHallinta.Loytyyko(baarinNimi) == false) {
            this.serveri.save(lisattavaBaari);
        } else {
            System.out.println("Baarin lisäys epäonnistui");
        }
    }

    public void poistetaanBaari(BufferedReader multiLukija, Scanner lukija, BaariHallinta baariHallinta) throws IOException {
        System.out.println("Anna baarin nimi:");
        String baarinNimi = multiLukija.readLine();
        if (baariHallinta.poista(baarinNimi) == true) {
            System.out.println("Baarin poisto onnistui!");
        } else {
            System.out.println("Baarin poisto epäonnistui, tarkasta kirjoitusasu.");
        }

    }

    public void lisaykset(Scanner lukija, BufferedReader multiLukija, JuomaHallinta juomaHallinta, BaariHallinta baariHallinta) throws IOException {
        System.out.println("1: Lisää Juoma\n2: Lisää baari");
        int valintaSisalla = lukija.nextInt();
        if (valintaSisalla == 1) {
            lisataanJuoma(multiLukija, lukija, juomaHallinta);
        } else if (valintaSisalla == 2) {
            baarinLisays(multiLukija, baariHallinta);
        } else {
            System.out.println("Huono valinta :(");
        }
    }

    public void poistot(Scanner lukija, BufferedReader multiLukija, JuomaHallinta juomaHallinta, BaariHallinta baariHallinta) throws IOException {
        System.out.println("1: Poista Juoma\n2: Poista baari");
        int valintaSisalla = lukija.nextInt();
        if (valintaSisalla == 1) {
            poistetaanJuoma(multiLukija, lukija, juomaHallinta);
        } else if (valintaSisalla == 2) {
            poistetaanBaari(multiLukija, lukija, baariHallinta);
        } else {
            System.out.println("Huono valinta :(");
        }
    }

    public void listaukset(Scanner lukija) {
        System.out.println("1: Listaa juomat\n2: Listaa baarit");
        int valintaSisalla = lukija.nextInt();
        if (valintaSisalla == 1) {
            tulostetaanJuomat();
        } else if (valintaSisalla == 2) {
            tulostetaanBaarit();
        } else {
            System.out.println("Huono valinta :(");
        }
    }

    public void LisataanBaariReissu(BufferedReader multiLukija, BaariHallinta baariHallinta, JuomaHallinta juomaHallinta, Scanner lukija, EbeanServer server) throws Exception, IOException {
        BaariReissu reissu = new BaariReissu();
        System.out.println("Anna baarin / paikan nimi, missä olit juomassa:");
        tulostetaanBaarit();
        System.out.print("Syöte : ");
        String paikanNimi = multiLukija.readLine();
        if (baariHallinta.Loytyyko(paikanNimi)) {
            System.out.println("Annan reissun kuvaus:");
            System.out.print("Syöte : ");
            String kuvaus = multiLukija.readLine();
            reissu.setBaarinNimi(paikanNimi);
            reissu.setKuvaus(kuvaus);
            while (true) {
                System.out.println("\nLisätään paikkaan " + paikanNimi + " juomia. Alla lista juomista. Anna juoman nimi tai anna tyhja lopettaaksesi:\n");
                tulostetaanJuomat();
                System.out.print("Syöte : ");
                String lisattavaJuoma = multiLukija.readLine();
                if (juomaHallinta.Loytyyko(lisattavaJuoma) == true) {
                    System.out.println("Kuinka monta kappaletta joit juomaa " + lisattavaJuoma + "?");
                    System.out.print("Syöte : ");
                    int maara = lukija.nextInt();
                    reissu.lisaaJuoma(juomaHallinta.LoytyykoJuomaNimellaPalautetaanJuoma(lisattavaJuoma), maara);
                    System.out.println("Juoma lisätty baarireissuun.");
                } else if (lisattavaJuoma.equals("")) {
                    this.serveri.save(reissu);
                    break;
                } else {
                    System.out.println("*** Kirjoita syöte tai paina enteriä. ***");
                }
            }
        }
    }
}
