/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * Täältä löytyy yksittäisten "baarien" tietoja. Eli baari voi olla
 * illanviettopaikka tai vaikkapa kauppa.
 */
@Entity
public class Baari {

    @Id
    private String nimi;
    private String kuvaus;
    public Baari() {} 
    public Baari(String nimi, String kuvaus) {
        this.nimi = nimi;
        this.kuvaus = kuvaus;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String baarinNimi) {
        this.nimi = baarinNimi;
    }
    
    public String getKuvaus() {
        return this.kuvaus;
    }
    
    public void setKuvaus(String baarinKuvaus) {
        this.kuvaus = baarinKuvaus;
    }
    
    
    
    
    @Override
    public String toString() {
        return this.nimi + " | " + this.kuvaus;
    }
}
