/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import alkoholitietokanta.hallinta.KayttajaHallinta;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author unit
 */
public class KirjautuminenTest {
    
    public KirjautuminenTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of kirjautuminen method, of class Kirjautuminen.
     */
    @Test
    public void testKirjautuminen() throws Exception {
        System.out.println("kirjautuminen");
        Scanner lukija = null;
        KayttajaHallinta hallinta = null;
        Kirjautuminen instance = null;
        instance.kirjautuminen(lukija, hallinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostaMenu method, of class Kirjautuminen.
     */
    @Test
    public void testTulostaMenu() {
        System.out.println("tulostaMenu");
        Kirjautuminen instance = null;
        instance.tulostaMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valintaLogiikka method, of class Kirjautuminen.
     */
    @Test
    public void testValintaLogiikka() throws Exception {
        System.out.println("valintaLogiikka");
        int valinta = 0;
        Scanner lukija = null;
        KayttajaHallinta hallinta = null;
        Kirjautuminen instance = null;
        int expResult = 0;
        int result = instance.valintaLogiikka(valinta, lukija, hallinta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}