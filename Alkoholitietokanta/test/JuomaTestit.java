/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import alkoholitietokanta.Juoma;
import eiKaytossa.XEiKaytossaJuomalista;
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
public class JuomaTestit {

    XEiKaytossaJuomalista juomaLista = new XEiKaytossaJuomalista("juomat");

    public JuomaTestit() {
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
    public void toimiikoJuomanYhdenLisays() {
        Juoma siideri1 = new Juoma("Crowmoor", "Kuiva omenasiideri", 4.7);
        juomaLista.lisaaJuomalistaanJuoma(siideri1);
        assertEquals("Crowmoor\n", juomaLista.tulostetaanKaikkiJuomatNimella());
    }

    @Test
    public void toimiikoUseanJuomanLisays() {
        XEiKaytossaJuomalista uusiLista = palautaValmisJuomalista();
        assertEquals("Halpasiideri1\n" + "Koff3\n" + "Crowmoor\n", uusiLista.tulostetaanKaikkiJuomatNimella());
    }

    @Test
    public void toimiikoYhdenJuomanPoisto() {
        XEiKaytossaJuomalista uusiLista = palautaValmisJuomalista();
        uusiLista.poistaJuomalistastaJuoma("Halpasiideri1");
        assertEquals("Koff3\n" + "Crowmoor\n", uusiLista.tulostetaanKaikkiJuomatNimella());
    }

    @Test
    public void toimiikoUseanJuomanPoisto() {
        XEiKaytossaJuomalista uusiLista = palautaValmisJuomalista();
        uusiLista.poistaJuomalistastaJuoma("Halpasiideri1");
        uusiLista.poistaJuomalistastaJuoma("Crowmoor");
        assertEquals("Koff3\n", uusiLista.tulostetaanKaikkiJuomatNimella());
    }

    public XEiKaytossaJuomalista palautaValmisJuomalista() {
        Juoma siideri1 = new Juoma("Halpasiideri1", "Lidlistä saatava perhanan halpa ja paha sidukka", 4.4);
        Juoma olut1 = new Juoma("Koff3", "Koffin normikolmonen", 4.7);
        Juoma siideri2 = new Juoma("Crowmoor", "Kuiva omenasiideri", 4.7);
        juomaLista.lisaaJuomalistaanJuoma(siideri1);
        juomaLista.lisaaJuomalistaanJuoma(olut1);
        juomaLista.lisaaJuomalistaanJuoma(siideri2);
        return juomaLista;
    }
}