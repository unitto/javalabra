package alkoholitietokanta;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);
        KayttajaHallinta hallinta = new KayttajaHallinta("src/tunnuksetSalasanoineen.txt");
        hallinta.lataa();


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
                System.out.println("Sisäänkirjautumista ei ole vielä lisätty\n");
            }

            if (valinta == 3) {
                tunnuksenPoisto(lukija, hallinta);
            }

            if (valinta == 4) {
                System.out.println("Kiitoksia käytöstä & hyvää päivänjatkoa!\n");
                valinta = 4;
            }
            if (valinta < 1 || valinta > 4) {
                System.out.println("Ole hyvä ja valitse 1-3 väliltä.\n");
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
            hallinta.talleta();
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
            hallinta.talleta();
        } else {
            System.out.println("Tunnuksen poistaminen ei onnistunut, tarkasta tunnuksen ja salasanan oikeinkirjoitus.");
        }
    }
}
