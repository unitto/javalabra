/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import alkoholitietokanta.domain.Baari;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unit
 */
public class BaariTest {
    
    public BaariTest() {
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
        fail("The test case is a prototype.");
    }
}