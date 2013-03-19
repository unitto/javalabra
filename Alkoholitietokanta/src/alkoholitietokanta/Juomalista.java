/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;


import java.util.HashMap;


public class Juomalista {
    private HashMap<Juoma, Integer> juomalista = new HashMap<>();
    
    public Juomalista() {
    }

    public void lisaaJuomalistaanJuoma(Juoma juoma) {
        for (Juoma j : this.juomalista.keySet())
        {
            if (j.equals(juoma))
            {
                int maara=this.juomalista.get(j);
                maara++;
                this.juomalista.remove(j);
                this.juomalista.put(j, maara);
                return;
            }
        }
       this.juomalista.put(juoma,1);

        
    }
}
