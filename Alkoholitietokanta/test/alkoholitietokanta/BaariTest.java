/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

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
public class BaariTest {
    
    public BaariTest() {
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
     * Test of getNimi method, of class Baari.
     */
    @Test
    public void testGetNimi() {
        System.out.println("getNimi");
        Baari instance = new Baari();
        String expResult = "";
        String result = instance.getNimi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNimi method, of class Baari.
     */
    @Test
    public void testSetNimi() {
        System.out.println("setNimi");
        String baarinNimi = "";
        Baari instance = new Baari();
        instance.setNimi(baarinNimi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKuvaus method, of class Baari.
     */
    @Test
    public void testGetKuvaus() {
        System.out.println("getKuvaus");
        Baari instance = new Baari();
        String expResult = "";
        String result = instance.getKuvaus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKuvaus method, of class Baari.
     */
    @Test
    public void testSetKuvaus() {
        System.out.println("setKuvaus");
        String baarinKuvaus = "";
        Baari instance = new Baari();
        instance.setKuvaus(baarinKuvaus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Baari.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Baari instance = new Baari();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}