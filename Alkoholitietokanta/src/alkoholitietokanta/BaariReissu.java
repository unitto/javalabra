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
        this.juodutJuomatLista = new HashMap<Juoma, Integer>();
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

    public HashMap<Juoma, Integer> getJuodutJuomatLista() {
        return juodutJuomatLista;
    }

    public void setJuodutJuomatLista(HashMap<Juoma, Integer> juodutJuomatLista) {
        this.juodutJuomatLista = juodutJuomatLista;
    }

    public void lisaaJuoma(Juoma j, int maara) throws Exception {
        if (this.juodutJuomatLista.containsKey(j)) {
            int uusiMaara = this.juodutJuomatLista.get(j) + maara;
            this.juodutJuomatLista.remove(j);
            this.juodutJuomatLista.put(j, maara);
            System.out.println("***Lisätään vanhan päälle");
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

    @Override
    public String toString() {
        return "BaariReissu{" + "juodutJuomatLista=" + this.juodutJuomatLista + '}';
    }

    public void tulostaJuomat() {
         Iterator<Juoma> iteraattori = this.juodutJuomatLista.keySet().iterator();
        while (iteraattori.hasNext()) {
            Juoma j = (Juoma) iteraattori.next();
            Integer maara = (Integer) this.juodutJuomatLista.get(j);
            System.out.println("Juoma: " + j.getName() + "| Maara: " + maara);
        }
    }
}
