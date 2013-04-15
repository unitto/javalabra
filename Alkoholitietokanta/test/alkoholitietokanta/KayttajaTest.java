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
public class KayttajaTest {
    
    public KayttajaTest() {
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
     * Test of getTunnus method, of class Kayttaja.
     */
    @Test
    public void testGetTunnus() {
        System.out.println("getTunnus");
        Kayttaja instance = new Kayttaja();
        String expResult = "";
        String result = instance.getTunnus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}