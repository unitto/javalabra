/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta.hallinta;

import alkoholitietokanta.domain.Kayttaja;
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
public class KayttajaHallintaTest {
    
    public KayttajaHallintaTest() {
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
     * Test of lisaa method, of class KayttajaHallinta.
     */
    @Test
    public void testLisaa() {
        System.out.println("lisaa");
        String tunnus = "";
        String salasana = "";
        KayttajaHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.lisaa(tunnus, salasana);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poista method, of class KayttajaHallinta.
     */
    @Test
    public void testPoista() {
        System.out.println("poista");
        String tunnus = "";
        String salasana = "";
        KayttajaHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.poista(tunnus, salasana);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Loytyyko method, of class KayttajaHallinta.
     */
    @Test
    public void testLoytyyko_String() {
        System.out.println("Loytyyko");
        String tunnus = "";
        KayttajaHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.Loytyyko(tunnus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Loytyyko method, of class KayttajaHallinta.
     */
    @Test
    public void testLoytyyko_String_String() {
        System.out.println("Loytyyko");
        String tunnus = "";
        String salasana = "";
        KayttajaHallinta instance = null;
        boolean expResult = false;
        boolean result = instance.Loytyyko(tunnus, salasana);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HaeKayttaja method, of class KayttajaHallinta.
     */
    @Test
    public void testHaeKayttaja() {
        System.out.println("HaeKayttaja");
        String tunnus = "";
        String salasana = "";
        KayttajaHallinta instance = null;
        Kayttaja expResult = null;
        Kayttaja result = instance.HaeKayttaja(tunnus, salasana);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}