package eiKaytossa;

import alkoholitietokanta.Baari;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author katu
 *
 * Aiemmin tekstilistoilla toimineen version koodeja, jossa niputettiin baareja
 * listoihin. Listat olisi myöhemmin yhdistetty Ryyppyreissuihin juomalistoilla.
 *
 *
 */
public class XEiKaytossaBaarilista {

    private ArrayList<Baari> baarilista;
    private String tiedosto;
    private Scanner lukija;

    public XEiKaytossaBaarilista(String tiedosto) {
        this.tiedosto = tiedosto;
        this.baarilista = new ArrayList<>();
    }

    public boolean lisaaBaari(Baari baari) {
        if (loytyykoBaariListasta(baari.getNimi()) == false) {
            this.baarilista.add(baari);
            return true;
        }
        return false;
    }

    public boolean poistaBaari(String baari) {
        if (loytyykoBaariListasta(baari) == true) {
            this.baarilista.remove(haeBaariNimella(baari));
            return true;
        }
        return false;
    }

    public boolean loytyykoBaariListasta(String baari) {
        for (Baari b : this.baarilista) {
            if (b.getNimi().equalsIgnoreCase(baari)) {
                return true;
            }
        }
        return false;
    }

    public String tulostetaanKaikkiBaaritNimella() {
        StringBuilder sb = new StringBuilder();
        for (Baari b : this.baarilista) {
            sb.append(b.getNimi()).append("\n");
        }
        return sb.toString();
    }

    public String tulostetaanKaikkiTiedot() {
        StringBuilder sb = new StringBuilder();
        for (Baari b : this.baarilista) {
            sb.append(b.getNimi()).append("\n");
        }
        return sb.toString();
    }

    public void talleta() throws IOException {
        File kaikkiBaarit = new File(tiedosto);
        try (FileWriter kirjoittaja = new FileWriter(kaikkiBaarit)) {
            for (Baari b : this.baarilista) {
                kirjoittaja.write(b.toString());
                kirjoittaja.write("\n");
            }
        }
    }

    public void lataa() throws IOException {
        File kaikkiBaarit = new File(tiedosto);
        if (!kaikkiBaarit.exists()) {
            kaikkiBaarit.createNewFile();
        }

        this.lukija = new Scanner(kaikkiBaarit);
        String rivi;
        String baarinNimi;
        String baarinKuvaus;

        while (this.lukija.hasNextLine()) {
            rivi = this.lukija.nextLine();
            Scanner luettuRivi = new Scanner(rivi);
            String delimitterit = "[|]";
            try {
                String[] osat = rivi.split(delimitterit);
                baarinNimi = osat[0].replaceAll("\\s", "");
                baarinKuvaus = osat[1].replaceAll("^[\\s\\t]+", "");
                Baari luettuBaari = new Baari(baarinNimi, baarinKuvaus);
                this.baarilista.add(luettuBaari);
            } catch (Exception e) {
                System.out.println("Tiedostoa ei löydy.");
            }
        }

    }

    public Baari haeBaariNimella(String baari) {
        for (Baari b : this.baarilista) {
            if (b.getNimi().equalsIgnoreCase(baari)) {
                return b;
            }
        }
        return null;
    }
}
