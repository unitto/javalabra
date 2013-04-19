/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unit
 */
public class JuomaHallintaTest {
    
    public JuomaHallintaTest() {
    }

    /**
     * Test of lisaa method, of class JuomaHallinta.
     */
    @Test
    public void testLisaa() {
        System.out.println("lisaa");
        String juoma = "";
        String kuvaus = "";
        double alkoholiprosentti = 0.0;
        String lisaaja = "";
        JuomaHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.lisaa(juoma, kuvaus, alkoholiprosentti, lisaaja);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of Loytyyko method, of class JuomaHallinta.
     */
    @Test
    public void testLoytyyko() {
        System.out.println("Loytyyko");
        String juomanNimi = "";
        JuomaHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.Loytyyko(juomanNimi);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of poista method, of class JuomaHallinta.
     */
    @Test
    public void testPoista() {
        System.out.println("poista");
        String juomanNimi = "";
        JuomaHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.poista(juomanNimi);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hakuJuomanNimella method, of class JuomaHallinta.
     */
    @Test
    public void testHakuJuomanNimella() {
        System.out.println("hakuJuomanNimella");
        String juomanNimi = "";
        JuomaHallinta instance = null;
        List expResult = null;
        List result = instance.hakuJuomanNimella(juomanNimi);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoytyykoJuomaNimellaPalautetaanJuoma method, of class JuomaHallinta.
     */
    @Test
    public void testLoytyykoJuomaNimellaPalautetaanJuoma() {
        System.out.println("LoytyykoJuomaNimellaPalautetaanJuoma");
        String juomanNimi = "";
        JuomaHallinta instance = null;
        Juoma expResult = null;
        Juoma result = instance.LoytyykoJuomaNimellaPalautetaanJuoma(juomanNimi);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}