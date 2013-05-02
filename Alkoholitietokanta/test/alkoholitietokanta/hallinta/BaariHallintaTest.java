/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta.hallinta;

import java.util.List;
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
public class BaariHallintaTest {
    
    public BaariHallintaTest() {
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}