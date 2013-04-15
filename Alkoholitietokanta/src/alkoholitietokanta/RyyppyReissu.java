/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author unit
 *
 * Tämä luokka sisältää kokonaisen ryyppyreissun.
 *
 */
@Entity
public class RyyppyReissu {

    @Id
    private String RyyppyReissunNimi;
    private List<BaariReissu> listaBaariReissuista;

    public RyyppyReissu() {
    }

    public String getRyyppyReissunNimi() {
        return RyyppyReissunNimi;
    }

    public void setRyyppyReissunNimi(String RyyppyReissunNimi) {
        this.RyyppyReissunNimi = RyyppyReissunNimi;
    }

    public List<BaariReissu> getListaBaariReissuista() {
        return listaBaariReissuista;
    }

    public void setListaBaariReissuista(List<BaariReissu> listaBaariReissuista) {
        this.listaBaariReissuista = listaBaariReissuista;
    }

    public void lisaaBaariReissu(BaariReissu reissu) {
        if (this.listaBaariReissuista.contains(reissu)) {
            System.out.println("Identtinen reissu on jo lisätty.");
        } else {
            this.listaBaariReissuista.add(reissu);
        }
    }

    public boolean poistaBaariReissu(BaariReissu reissu) {
        if (this.listaBaariReissuista.contains(reissu)) {
            this.listaBaariReissuista.remove(reissu);
            return true;
        } else {
            return false;
        }
    }
}
