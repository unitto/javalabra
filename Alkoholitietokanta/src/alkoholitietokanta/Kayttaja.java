package alkoholitietokanta;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Kayttaja {

    @Id
    private String tunnus;
    private String salasana;
    public Kayttaja() {}
    public Kayttaja(String tunnus, String salasana) {
        this.tunnus = tunnus;
        this.salasana = salasana;
    }
    
    public String getTunnus() {
        return this.tunnus;
    }
    
    public void setTunnus(String kayttajanTunnus) {
        this.tunnus = kayttajanTunnus;
    }
    
    public String getSalasana() {
        return this.salasana;
    }
 
    public void setSalasana(String kayttajanSalasana) {
        this.salasana = kayttajanSalasana;
    }
 
       
    @Override
    public String toString()
    {
        return this.tunnus+" "+this.salasana;
    }
}
