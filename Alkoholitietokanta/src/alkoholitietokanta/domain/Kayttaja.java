package alkoholitietokanta.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author katu
 *
 * Kayttaja-luokka sisältää käyttäjä-olion getterit ja setterit. String tunnus
 * toimii käyttäjän pääavaimena. Kahta samaa tunnusta järjestelmässä ei voi
 * olla.
 *
 *
 */

@Entity
public class Kayttaja {

    private String salasana;
    @Id
    private String tunnus;

    public Kayttaja() {
    }

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
    public String toString() {
        return this.tunnus + " " + this.salasana;
    }
}
