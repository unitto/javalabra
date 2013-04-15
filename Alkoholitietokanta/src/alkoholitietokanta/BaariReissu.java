/**
 *
 * Tänne tulee lista ryyppyreissuista. Hashmap jossa on baarilista ja
 * ryyppylista
 */
package alkoholitietokanta;

import java.util.HashMap;
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
    private HashMap<Juoma, Integer> juodutJuomatLista;

    public BaariReissu() {
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
}
