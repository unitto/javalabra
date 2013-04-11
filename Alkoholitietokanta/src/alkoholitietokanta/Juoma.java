package alkoholitietokanta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Juoma {

    @Id
    private Integer id;
    private String name;
    private String juomanKuvaus;
    private double juomanAlkoholiprosentti;
    @ManyToOne
    private Kayttaja lisaaja;

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

    public void setLisaaja(Kayttaja lisaaja) {
        this.lisaaja = lisaaja;
    }

    public Kayttaja getLisaaja() {
        return lisaaja;
    }

    public void setjuomanAlkoholiprosentti(double juomanProsentit) {
        this.juomanAlkoholiprosentti = juomanProsentit;
    }

    public double getJuomanAlkoholiprosentti() {
        return this.juomanAlkoholiprosentti;
    }

    @Override
    public String toString() {
        return this.name + " | " + this.juomanKuvaus + " | " + this.juomanAlkoholiprosentti;
    }
}
