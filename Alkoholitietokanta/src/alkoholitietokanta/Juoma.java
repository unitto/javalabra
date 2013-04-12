package alkoholitietokanta;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author katu
 *
 * Juoma-luokka sisältää juoma-olion getterit ja setterit. Integer id-toimii
 * Juoma-luokan pääavaimena, joka on juokseva luku. Kahta samaa juomaa ei saa
 * samalla avaimella olla.
 *
 *
 */
@Entity
public class Juoma {

    private String name;
    private String juomanKuvaus;
    private double juomanAlkoholiprosentti;
    @Id
    private Integer id;

    public Juoma() {
    }

    public Juoma(String juomanNimi, String juomanKuvaus, double juomanAlkoholiProsentti) {
        this.name = juomanNimi;
        this.juomanKuvaus = juomanKuvaus;
        this.juomanAlkoholiprosentti = juomanAlkoholiProsentti;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setJuomanKuvaus(String juomanKuvaus) {
        this.juomanKuvaus = juomanKuvaus;
    }

    public String getJuomanKuvaus() {
        return this.juomanKuvaus;
    }

    public void setJuomanAlkoholiprosentti(double juomanAlkoholiprosentti) {
        this.juomanAlkoholiprosentti = juomanAlkoholiprosentti;
    }

    public double getJuomanAlkoholiprosentti() {
        return this.juomanAlkoholiprosentti;
    }

    @Override
    public String toString() {
        return this.name + " | " + this.juomanKuvaus + " | " + this.juomanAlkoholiprosentti;
    }
}
