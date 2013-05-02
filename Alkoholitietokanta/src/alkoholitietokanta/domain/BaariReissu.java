/**
 *
 * Tänne tulee lista ryyppyreissuista. Hashmap jossa on baarilista ja
 * ryyppylista
 */
package alkoholitietokanta.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author unit
 *
 * Tämä luokka hoitaa yksittäisten baarireissujen sisällön. BaariReissu sisältää
 * hashmapin, johon lisätään baari ja siellä juodut juomat lukumäärineen
 *
 *
 */
@Entity
public class BaariReissu {

    @Id
    private Integer id;
    private String baarinNimi;
    private String kuvaus;
    @OneToMany(cascade = CascadeType.ALL)
    private List<JuomaTilaus> juomaLista;

    public List<JuomaTilaus> getJuomaLista() {
        return juomaLista;
    }

    public void setJuomaLista(List<JuomaTilaus> juomaLista) {
        this.juomaLista = juomaLista;
    }

    public BaariReissu() {
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBaarinNimi() {
        return baarinNimi;
    }

    public void setBaarinNimi(String baarinNimi) {
        this.baarinNimi = baarinNimi;
    }

    public void lisaaJuoma(JuomaTilaus jT) {
        if (juomaLista == null) {
            juomaLista = new ArrayList<JuomaTilaus>();
        }
        juomaLista.add(jT);
    }

    public boolean poistaJuoma(Juoma j) {
        if (loytyykoJuoma(j) != null) {
            this.juomaLista.remove(loytyykoJuoma(j));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "BaariReissu{" + "juodutJuomatLista=" + this.juomaLista.toString() + '}';
    }

    public void tulostaJuomat() {
        Iterator<JuomaTilaus> iteraattori = this.juomaLista.iterator();
        System.out.println("Baari jossa käyty: " + this.baarinNimi + " | Baarireissun kuvaus: " + this.kuvaus);
        while (iteraattori.hasNext()) {
            JuomaTilaus j = iteraattori.next();
            System.out.println(j.toString());
        }
    }

    public JuomaTilaus loytyykoJuoma(Juoma j) {
        for (JuomaTilaus jT : this.juomaLista) {
            if (jT.getJuoma().equals(j)) {
                return jT;
            }
        }
        return null;
    }
}
