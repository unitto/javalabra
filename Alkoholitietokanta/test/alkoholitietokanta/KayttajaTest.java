/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import alkoholitietokanta.domain.Kayttaja;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unit
 */
public class KayttajaTest {
    
    public KayttajaTest() {
    }

    /**
     * Test of getTunnus method, of class Kayttaja.
     */
    @Test
    public void testGetTunnus() {
        System.out.println("getTunnus");
        Kayttaja instance = new Kayttaja();
        String expResult = "";
        String result = instance.getTunnus();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTunnus method, of class Kayttaja.
     */
    @Test
    public void testSetTunnus() {
        System.out.println("setTunnus");
        String kayttajanTunnus = "";
        Kayttaja instance = new Kayttaja();
        instance.setTunnus(kayttajanTunnus);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalasana method, of class Kayttaja.
     */
    @Test
    public void testGetSalasana() {
        System.out.println("getSalasana");
        Kayttaja instance = new Kayttaja();
        String expResult = "";
        String result = instance.getSalasana();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalasana method, of class Kayttaja.
     */
    @Test
    public void testSetSalasana() {
        System.out.println("setSalasana");
        String kayttajanSalasana = "";
        Kayttaja instance = new Kayttaja();
        instance.setSalasana(kayttajanSalasana);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Kayttaja.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Kayttaja instance = new Kayttaja();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}