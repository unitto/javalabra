/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author katu
 *
 * Testiluokka, jolla debugaillaan ja testaillaan juttuja. Ei kovinkaan
 * merkityksellinen.
 *
 *
 */
public class mainTesteri {

    public static void main(String[] args) throws IOException {
        //Juomalista juomaLista = new Juomalista("src/juomat.txt");
        Scanner lukija = new Scanner(System.in);
        //juomaLista.lataa();
        //System.out.println(juomaLista.tulostetaanKaikkiTiedot());
        System.out.println("Anna baarin nimi:");
        String baarinNimi = lukija.nextLine();
        System.out.println("Anna baarin kuvaus");
        String baarinKuvaus = lukija.nextLine();

        Baari bb = new Baari(baarinNimi, baarinKuvaus);
        XEiKaytossaBaarilista bLista = new XEiKaytossaBaarilista("src/baarit.txt");
        bLista.lisaaBaari(bb);
        bLista.talleta();

        //Juoma lisattavaJuoma = new Juoma(juomanNimi, juomanKuvaus, juomanProsentit);
        //System.out.println(lisattavaJuoma.toString());



    }
}
