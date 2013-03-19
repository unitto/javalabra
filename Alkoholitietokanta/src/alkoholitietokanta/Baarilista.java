package alkoholitietokanta;

import java.util.ArrayList;

/**
 *
 * Tänne tulee lista baareista.
 */
public class Baarilista {

    private ArrayList<Baari> baarilista = new ArrayList<>();

    public Baarilista() {
    }

    public boolean lisaaBaari(Baari baari) {
        if (loytyykoBaariListasta(baari) == false) {
            this.baarilista.add(baari);
            return true;
        }
        return false;
    }

    public boolean poistaBaari(Baari baari) {
        if (loytyykoBaariListasta(baari) == true) {
            this.baarilista.remove(baari);
            return true;
        }
        return false;
    }

    public boolean loytyykoBaariListasta(Baari baari) {
        for (Baari b : this.baarilista) {
            if (b.equals(baari)) {
                return true;
            }
        }
        return false;
    }
}
