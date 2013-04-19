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
public class BaariHallintaTest {
    
    public BaariHallintaTest() {
    }

    /**
     * Test of lisaa method, of class BaariHallinta.
     */
    @Test
    public void testLisaa() {
        System.out.println("lisaa");
        String nimi = "";
        String kuvaus = "";
        BaariHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.lisaa(nimi, kuvaus);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of Loytyyko method, of class BaariHallinta.
     */
    @Test
    public void testLoytyyko() {
        System.out.println("Loytyyko");
        String baarinNimi = "";
        BaariHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.Loytyyko(baarinNimi);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of poista method, of class BaariHallinta.
     */
    @Test
    public void testPoista() {
        System.out.println("poista");
        String baarinNimi = "";
        BaariHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.poista(baarinNimi);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hakuBaarinNimella method, of class BaariHallinta.
     */
    @Test
    public void testHakuBaarinNimella() {
        System.out.println("hakuBaarinNimella");
        String baarinNimi = "";
        BaariHallinta instance = null;
        List expResult = null;
        List result = instance.hakuBaarinNimella(baarinNimi);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}