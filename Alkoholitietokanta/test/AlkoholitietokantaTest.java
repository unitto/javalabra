/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import alkoholitietokanta.Juoma;
import eiKaytossa.XEiKaytossaJuomalista;
import alkoholitietokanta.KayttajaHallinta;
import java.io.IOException;
import java.util.HashMap;
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
public class AlkoholitietokantaTest {

    private int valinta;
    //KayttajaHallinta hallinta = new KayttajaHallinta("src/tunnuksetSalasanoineen.txt");

    @Before
    public void setUp() throws IOException {

        //hallinta.lataa();
    }

    @After
//    public void tearDown() {
//    }
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    // @Test
//    // public void hello() {}
//
//    @Test
//    public void testataanToimiikoLisays() {
//        hallinta.lisaa("hatti", "watti");
//        if (testataanLoytyykoTunnus("hatti") == true) {
//            assert true;
//        } else {
//            assert false;
//        }
//    }
//
//    @Test
//    public void testataanToimiikoPoisto() {
//        hallinta.lisaa("hatti", "watti");
//        hallinta.poista("hatti", "watti");
//        if (testataanLoytyykoTunnus("hatti") == false) {
//            assert true;
//        } else {
//            assert false;
//        }
//    }
//
//    @Test
//    public void testataanToimiikoPoistoVaarallaSalasanalla() {
//        hallinta.lisaa("hatti", "watti");
//        hallinta.poista("hatti", "w4tti");
//        if (testataanLoytyykoTunnus("hatti") == false) {
//            assert false;
//        } else {
//            assert true;
//        }
//    }
//
//    public boolean testataanLoytyykoTunnus(String X) {
//        HashMap<String, String> haettuHashMap = new HashMap<>();
//        haettuHashMap = hallinta.getLista();
//        for (String s : haettuHashMap.keySet()) {
//            if (s.equalsIgnoreCase(X)) {
//                return true;
//            }
//        }
//        return false;
//    }

    @Test
    public void tyhja() {
    }
}
