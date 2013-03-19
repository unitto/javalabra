/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

/**
 *
 * Täältä löytyy yksittäisten "baarien" tietoja. Eli baari voi olla
 * illanviettopaikka tai vaikkapa kauppa.
 */
public class Baari {

    private String nimi;
    private String kuvaus;
    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Baari(String nimi, String kuvaus) {
        this.nimi = nimi;
        this.kuvaus = kuvaus;
    }

    public void lisaaPvm(int pv, int kk, int v) {
        this.paiva = pv;
        this.kuukausi = kk;
        this.vuosi = v;
    }
}
