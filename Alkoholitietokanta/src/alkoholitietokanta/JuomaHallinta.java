/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author katu
 * 
 * JuomaHallinta-luokka suorittaa juomien ylläpidon tietokannassa. 
 * Luokasta löytyy lisäämisen, lyötämisen ja poistamiseen liittyvät toiminnallisuudet.
 * 
 **/
public class JuomaHallinta {

    HashMap<String, Integer> juontiLista = new HashMap<>();
    private String tiedosto;
    private Scanner lukija;

    public JuomaHallinta(String tiedosto) {
        this.tiedosto = tiedosto;
    }

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
}
