package alkoholitietokanta.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author katu
 * 
 * Baari-luokka sisältää Baari-olion getterit ja setterit. 
 * String nimi toimii baarin pääavaimena. Kahta samaa baarin nimeä järjestelmässä ei voi olla.
 * 
 **/
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
