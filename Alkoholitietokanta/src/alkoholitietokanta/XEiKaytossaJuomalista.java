/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author katu
 *
 * Aiemmin tekstilistoilla toimineen version koodeja, jossa niputettiin juomia
 * listoihin. Listat olisi myöhemmin yhdistetty Ryyppyreissuihin baarilistoilla.
 *
 *
 */
public class XEiKaytossaJuomalista {

    private ArrayList<Juoma> juomalista;
    private String tiedosto;
    private Scanner lukija;

    public XEiKaytossaJuomalista(String tiedosto) {
        this.tiedosto = tiedosto;
        this.juomalista = new ArrayList<>();
    }
    /*
     public Juomalista(String tiedosto) {
     this.tiedosto = tiedosto;
     }
     */

    public boolean lisaaJuomalistaanJuoma(Juoma juoma) {
        for (Juoma j : this.juomalista) {
            if (j.equals(juoma)) {
                return false;
            }
        }
        this.juomalista.add(juoma);
        return true;
    }

    public boolean poistaJuomalistastaJuoma(String juoma) {
        for (Juoma j : this.juomalista) {
            if (j.getName().equalsIgnoreCase(juoma)) {
                this.juomalista.remove(j);
                return true;
            }
        }
        return false;
    }

    public String tulostetaanKaikkiJuomatNimella() {
        StringBuilder sb = new StringBuilder();
        for (Juoma j : this.juomalista) {
            sb.append(j.getName()).append("\n");
        }
        return sb.toString();
    }

    public String tulostetaanKaikkiTiedot() {
        StringBuilder sb = new StringBuilder();
        for (Juoma j : this.juomalista) {
            sb.append(j.toString()).append("\n");
        }
        return sb.toString();
    }

    public void talleta() throws IOException {
        File kaikkiJuomat = new File(tiedosto);
        try (FileWriter kirjoittaja = new FileWriter(kaikkiJuomat)) {
            for (Juoma j : this.juomalista) {
                kirjoittaja.write(j.toString());
                kirjoittaja.write("\n");
            }
        }
    }

    public void lataa() throws IOException {
        File kaikkiJuomat = new File(tiedosto);

        this.lukija = new Scanner(kaikkiJuomat);
        String rivi;
        String juomanNimi;
        String juomanKuvaus;
        Double juomanProsentit;
        while (this.lukija.hasNextLine()) {
            rivi = this.lukija.nextLine();
            Scanner luettuRivi = new Scanner(rivi);
            String delimitterit = "[|]";
            try {
                String[] osat = rivi.split(delimitterit);
                juomanNimi = osat[0].replaceAll("\\s", "");
                juomanKuvaus = osat[1].replaceAll("^[\\s\\t]+", "");
                juomanProsentit = Double.parseDouble(osat[2].replaceAll("\\s", ""));
                //Juoma luettuJuoma = new Juoma(juomanNimi, juomanKuvaus, juomanProsentit);
               // this.juomalista.add(luettuJuoma);
            } catch (Exception e) {
                System.out.println("Tiedostoa ei löydy.");
            }
        }

    }

    public boolean loytyykoJuomaListalta(String juoma) {
        for (Juoma j : this.juomalista) {
            if (j.getName().equalsIgnoreCase(juoma)) {
                return true;
            }
        }
        return false;
    }
}
