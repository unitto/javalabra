/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import java.io.BufferedReader;
import java.util.Scanner;
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
public class ToimintaLogiikkaTest {
    
    public ToimintaLogiikkaTest() {
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
     * Test of tulostetaanJuomat method, of class ToimintaLogiikka.
     */
    @Test
    public void testTulostetaanJuomat() {
        System.out.println("tulostetaanJuomat");
        ToimintaLogiikka instance = null;
        instance.tulostetaanJuomat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostetaanBaarit method, of class ToimintaLogiikka.
     */
    @Test
    public void testTulostetaanBaarit() {
        System.out.println("tulostetaanBaarit");
        ToimintaLogiikka instance = null;
        instance.tulostetaanBaarit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisataanJuoma method, of class ToimintaLogiikka.
     */
    @Test
    public void testLisataanJuoma() throws Exception {
        System.out.println("lisataanJuoma");
        BufferedReader multiLukija = null;
        Scanner lukija = null;
        JuomaHallinta juomaHallinta = null;
        ToimintaLogiikka instance = null;
        instance.lisataanJuoma(multiLukija, lukija, juomaHallinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poistetaanJuoma method, of class ToimintaLogiikka.
     */
    @Test
    public void testPoistetaanJuoma() throws Exception {
        System.out.println("poistetaanJuoma");
        BufferedReader multiLukija = null;
        Scanner lukija = null;
        JuomaHallinta juomaHallinta = null;
        ToimintaLogiikka instance = null;
        instance.poistetaanJuoma(multiLukija, lukija, juomaHallinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of baarinLisays method, of class ToimintaLogiikka.
     */
    @Test
    public void testBaarinLisays() throws Exception {
        System.out.println("baarinLisays");
        BufferedReader multiLukija = null;
        BaariHallinta baariHallinta = null;
        ToimintaLogiikka instance = null;
        instance.baarinLisays(multiLukija, baariHallinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poistetaanBaari method, of class ToimintaLogiikka.
     */
    @Test
    public void testPoistetaanBaari() throws Exception {
        System.out.println("poistetaanBaari");
        BufferedReader multiLukija = null;
        Scanner lukija = null;
        BaariHallinta baariHallinta = null;
        ToimintaLogiikka instance = null;
        instance.poistetaanBaari(multiLukija, lukija, baariHallinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaykset method, of class ToimintaLogiikka.
     */
    @Test
    public void testLisaykset() throws Exception {
        System.out.println("lisaykset");
        Scanner lukija = null;
        BufferedReader multiLukija = null;
        JuomaHallinta juomaHallinta = null;
        BaariHallinta baariHallinta = null;
        ToimintaLogiikka instance = null;
        instance.lisaykset(lukija, multiLukija, juomaHallinta, baariHallinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poistot method, of class ToimintaLogiikka.
     */
    @Test
    public void testPoistot() throws Exception {
        System.out.println("poistot");
        Scanner lukija = null;
        BufferedReader multiLukija = null;
        JuomaHallinta juomaHallinta = null;
        BaariHallinta baariHallinta = null;
        ToimintaLogiikka instance = null;
        instance.poistot(lukija, multiLukija, juomaHallinta, baariHallinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaukset method, of class ToimintaLogiikka.
     */
    @Test
    public void testListaukset() {
        System.out.println("listaukset");
        Scanner lukija = null;
        ToimintaLogiikka instance = null;
        instance.listaukset(lukija);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostaMenu method, of class ToimintaLogiikka.
     */
    @Test
    public void testTulostaMenu() {
        System.out.println("tulostaMenu");
        ToimintaLogiikka instance = null;
        instance.tulostaMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}