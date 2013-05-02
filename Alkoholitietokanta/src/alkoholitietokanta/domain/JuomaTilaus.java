/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author unit
 */
@Entity
public class JuomaTilaus {

    @Id
    private Integer id;
    @ManyToOne
    private Juoma juoma;
    private Integer maara;
    @ManyToOne
    BaariReissu baariReissu;

    public JuomaTilaus() {
    }

    public JuomaTilaus(Juoma juoma, Integer maara) {
        this.juoma = juoma;
        this.maara = maara;
    }

    public Integer getId() {
        return id;
    }

    public BaariReissu getBaariReissu() {
        return baariReissu;
    }

    public void setBaariReissu(BaariReissu baariReissu) {
        this.baariReissu = baariReissu;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Juoma getJuoma() {
        return juoma;
    }

    public void setJuoma(Juoma juoma) {
        this.juoma = juoma;
    }

    public Integer getMaara() {
        return maara;
    }

    public void setMaara(Integer maara) {
        this.maara = maara;
    }

    @Override
    public String toString() {
        return "Juotu juoma: "+juoma.getName() + " | Määrä: " + maara;
    }
}
