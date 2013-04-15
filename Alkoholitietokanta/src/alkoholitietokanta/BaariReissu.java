/**
 *
 * Tänne tulee lista ryyppyreissuista. Hashmap jossa on baarilista ja
 * ryyppylista
 */
package alkoholitietokanta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.Id;

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
    private HashMap<Juoma, Integer> juodutJuomatLista;

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

    public void setBaarinNimi(String baarinNimi) {
        this.baarinNimi = baarinNimi;
    }

    public HashMap<Juoma, Integer> getJuodutJuomatLista() {
        return juodutJuomatLista;
    }

    public void setJuodutJuomatLista(HashMap<Juoma, Integer> juodutJuomatLista) {
        this.juodutJuomatLista = juodutJuomatLista;
    }

    public void lisaaJuoma(Juoma j, int maara) throws Exception {

        if (this.juodutJuomatLista == null) {
            this.juodutJuomatLista = new HashMap<Juoma, Integer>();
        }
        if (this.juodutJuomatLista.containsKey(j)) {
            int uusiMaara = this.juodutJuomatLista.get(j) + maara;
            this.juodutJuomatLista.remove(j);
            this.juodutJuomatLista.put(j, maara);
        } else {
            this.juodutJuomatLista.put(j, maara);
        }


    }

    public boolean poistaJuoma(Juoma j) {
        if (this.juodutJuomatLista.containsKey(j)) {
            this.juodutJuomatLista.remove(j);
            return true;
        } else {
            return false;
        }
    }

    public void tulostaJuomat() {
        for (Juoma j : this.juodutJuomatLista.keySet()) {
            System.out.println("Juoma: " + j.getName() + "| Maara: " + this.juodutJuomatLista.get(j));
        }
    }
}
