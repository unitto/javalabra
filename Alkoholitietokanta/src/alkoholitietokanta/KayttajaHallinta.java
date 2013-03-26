package alkoholitietokanta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class KayttajaHallinta {

    HashMap<String, String> kayttajatJaSalasanat = new HashMap<>();
    private String tiedosto;
    private Scanner lukija;

    public KayttajaHallinta(String tiedosto) {
        this.tiedosto = tiedosto;
    }

    public boolean lisaa(String tunnus, String salasana) {
        for (String s : this.kayttajatJaSalasanat.keySet()) {
            if (s.equalsIgnoreCase(tunnus)) {
                return false;
            }
        }
        this.kayttajatJaSalasanat.put(tunnus, salasana);
        return true;
    }

    public boolean poista(String tunnus, String salasana) {
        if (Loytyyko(tunnus, salasana) == true) {
            this.kayttajatJaSalasanat.remove(tunnus);
            return true;
        } else {
            return false;
        }
    }

    public void lataa() throws IOException {
        File tunnuksetSalasanoineen = new File(tiedosto);
        if (!tunnuksetSalasanoineen.exists()) {
            tunnuksetSalasanoineen.createNewFile();
        }

        try {
            this.lukija = new Scanner(tunnuksetSalasanoineen);
            String tunnus;
            String salasana;
            while (lukija.hasNext()) {
                tunnus = this.lukija.next();
                salasana = this.lukija.next();
                lisaa(tunnus, salasana);
            }
        } catch (Exception e) {
            System.out.println("Tiedostoa ei löydy.");
        }
    }

    public void talleta() throws IOException {
        File tunnuksetSalasanoineen = new File(tiedosto);
        try (FileWriter kirjoittaja = new FileWriter(tunnuksetSalasanoineen)) {
            for (String s : this.kayttajatJaSalasanat.keySet()) {
                kirjoittaja.write(s + " " + this.kayttajatJaSalasanat.get(s));
                kirjoittaja.write("\n");
            }
        }
    }

    public HashMap<String, String> getLista() {
        return this.kayttajatJaSalasanat;
    }

    public boolean Loytyyko(String tunnus, String salasana) {
        for (String s : this.kayttajatJaSalasanat.keySet()) {
            if (s.equalsIgnoreCase(tunnus) && this.kayttajatJaSalasanat.get(s).equals(salasana)) {
                return true;
            }
        }
        return false;
    }
}
