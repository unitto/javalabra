package alkoholitietokanta;

import alkoholitietokanta.hallinta.JuomaHallinta;
import alkoholitietokanta.hallinta.BaariHallinta;
import alkoholitietokanta.domain.Juoma;
import alkoholitietokanta.domain.BaariReissu;
import alkoholitietokanta.domain.Kayttaja;
import alkoholitietokanta.domain.Baari;
import alkoholitietokanta.domain.JuomaTilaus;
import alkoholitietokanta.domain.RyyppyReissu;
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

            String valintaString = lukija.next();
            try {
                valinta = Integer.parseInt(valintaString);
                valintaLogiikka(valinta, lukija, multiLukija, juomaHallinta, baariHallinta, serveri);
            } catch (Exception e) {
                System.out.println("Syötteesi oli virheellinen. Ole kiltti ja yritä uudelleen.");
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
        System.out.println("4. Lisää baarireissu");
        System.out.println("5. Listaa baarireissu");
        System.out.println("6. Top 5 juoduimmat ** Ei toiminnassa **");
        System.out.println("7. Top 5 paras alkoholi/hinta ** Ei toiminnassa **");
        System.out.println("8. Top 5 paras kokemus/hinta ** Ei toiminnassa **");
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
            System.out.println(b.toString());
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
        try {
            if (valintaSisalla == 1) {
                lisataanJuoma(multiLukija, lukija, juomaHallinta);
            } else if (valintaSisalla == 2) {
                baarinLisays(multiLukija, baariHallinta);
            } else {
                System.out.println("Huono valinta :(");
            }
        } catch (Exception e) {
            System.out.println("Virheellinen syöte.");
        }

    }

    public void poistot(Scanner lukija, BufferedReader multiLukija, JuomaHallinta juomaHallinta, BaariHallinta baariHallinta) throws IOException {
        System.out.println("1: Poista Juoma\n2: Poista baari");
        try {
            int valintaSisalla = lukija.nextInt();

            if (valintaSisalla == 1) {
                poistetaanJuoma(multiLukija, lukija, juomaHallinta);
            } else if (valintaSisalla == 2) {
                poistetaanBaari(multiLukija, lukija, baariHallinta);
            } else {
                System.out.println("Huono valinta :(");
            }
        } catch (Exception e) {
            System.out.println("Virheellinen syöte.");
        }

    }

    public void listaukset(Scanner lukija) {
        System.out.println("1: Listaa juomat\n2: Listaa baarit");
        try {
            int valintaSisalla = lukija.nextInt();
            if (valintaSisalla == 1) {
                tulostetaanJuomat();
            } else if (valintaSisalla == 2) {
                tulostetaanBaarit();
            } else {
                System.out.println("Huono valinta :(");
            }
        } catch (Exception e) {
            System.out.println("Virheellinen syöte.");
        }

    }

    public void LisataanBaariReissu(BufferedReader multiLukija, BaariHallinta baariHallinta, JuomaHallinta juomaHallinta, Scanner lukija, EbeanServer server) throws Exception, IOException {
        BaariReissu reissu = new BaariReissu();
        System.out.println("Anna baarin / paikan nimi, missä olit juomassa:");
        tulostetaanBaarit();
        System.out.print("Syöte : ");
        String paikanNimi = multiLukija.readLine();
        aloitetaanLisaysJosBaariLoytyy(baariHallinta, paikanNimi, multiLukija, reissu, juomaHallinta, lukija);
    }

    public void aloitetaanLisaysJosBaariLoytyy(BaariHallinta baariHallinta, String paikanNimi, BufferedReader multiLukija, BaariReissu reissu, JuomaHallinta juomaHallinta, Scanner lukija) throws Exception {
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
                    try {
                        int maara = lukija.nextInt();
                        JuomaTilaus jT = new JuomaTilaus(juomaHallinta.LoytyykoJuomaNimellaPalautetaanJuoma(lisattavaJuoma), maara);
                        reissu.lisaaJuoma(jT);
                        System.out.println("Juoma lisätty baarireissuun.");
                    } catch (Exception E) {
                        System.out.println("Virheellinen syöte.");
                    }
                } else if (lisattavaJuoma.equals("")) {
                    this.serveri.save(reissu);
                    System.out.println("Reissu lisätty tietokantaan.");
                    break;
                } else {
                    System.out.println("*** Kirjoita syöte tai paina enteriä. ***");
                }
            }
        }
    }

    public void baariRyyppyReissuValinta(Scanner lukija, BufferedReader multiLukija, BaariHallinta baariHallinta, JuomaHallinta juomaHallinta, EbeanServer serveri) throws Exception {
        System.out.println("1: Lisää baarireissu \n2: Lisää baarireissu ryyppyreissuun *** Ei toiminnassa ***");
        try {
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
        } catch (Exception e) {
            System.out.println("Virheellinen syöte.");
        }

    }

    public void valintaLogiikka(int valinta, Scanner lukija, BufferedReader multiLukija, JuomaHallinta juomaHallinta, BaariHallinta baariHallinta, EbeanServer serveri) throws Exception, IOException {
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
            baariRyyppyReissuValinta(lukija, multiLukija, baariHallinta, juomaHallinta, serveri);
        }
        if (valinta == 5) {
            listaaBaarireissut(serveri);
        }
        if (valinta < 1 || valinta > 9) {
            System.out.println("Ole hyvä ja valitse 1-9 väliltä.\n");
        }
    }

    public void listaaBaarireissut(EbeanServer serveri) {
        System.out.println("---------------------");
        List<BaariReissu> tulostettavatBaariReissut = serveri.find(BaariReissu.class).findList();
        Iterator<BaariReissu> iteraattori = tulostettavatBaariReissut.iterator();
        int i = 1;
        while (iteraattori.hasNext()) {
            System.out.println(i);
            BaariReissu b = iteraattori.next();
            b.tulostaJuomat();
            i++;
        }

        System.out.println("---------------------");
        Scanner odotetaanEnteria = new Scanner(System.in);
        System.out.println("Paina enteriä jatkaaksesi.");
        odotetaanEnteria.nextLine();
    }
}
