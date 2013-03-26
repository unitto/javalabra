/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import alkoholitietokanta.Baari;
import alkoholitietokanta.Baarilista;
import alkoholitietokanta.Juoma;
import alkoholitietokanta.Juomalista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unit
 */
public class BaariTestit {

    Baarilista bLista = new Baarilista("tiedosto");

    public BaariTestit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toimiikoBaarinYhdenLisays() {
        Baari b1 = new Baari("Kotibaari", "Kotijuoppola");
        bLista.lisaaBaari(b1);
        assertEquals("Kotibaari\n", bLista.tulostetaanKaikkiBaaritNimella());
    }

    @Test
    public void toimiikoUseanBaarinLisays() {
        Baarilista uusiLista = palautaValmisBaarilista();
        assertEquals("Kotibaari\n" + "Satulinna\n" + "Pinokkio\n", uusiLista.tulostetaanKaikkiBaaritNimella());
    }

    @Test
    public void toimiikoYhdenBaarinPoisto() {
        Baarilista uusiLista = palautaValmisBaarilista();
        uusiLista.poistaBaari("Kotibaari");
        assertEquals("Satulinna\n" + "Pinokkio\n", uusiLista.tulostetaanKaikkiBaaritNimella());
    }

    @Test
    public void toimiikoUseanBaarinPoisto() {
        Baarilista uusiLista = palautaValmisBaarilista();
        uusiLista.poistaBaari("Kotibaari");
        uusiLista.poistaBaari("Pinokkio");
        assertEquals("Satulinna\n", uusiLista.tulostetaanKaikkiBaaritNimella());

    }

    public Baarilista palautaValmisBaarilista() {
        Baari b1 = new Baari("Kotibaari", "Kotijuoppola");
        Baari b2 = new Baari("Satulinna", "Mene vain luotiliivin kera");
        Baari b3 = new Baari("Pinokkio", "Ihme mesta ja vain yksi bilispöytä");
        bLista.lisaaBaari(b1);
        bLista.lisaaBaari(b2);
        bLista.lisaaBaari(b3);
        return bLista;

    }
}