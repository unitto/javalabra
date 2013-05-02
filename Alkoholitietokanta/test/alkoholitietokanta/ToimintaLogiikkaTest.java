/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import alkoholitietokanta.domain.BaariReissu;
import alkoholitietokanta.hallinta.JuomaHallinta;
import alkoholitietokanta.hallinta.BaariHallinta;
import com.avaje.ebean.EbeanServer;
import java.io.BufferedReader;
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
public class ToimintaLogiikkaTest {
    
    public ToimintaLogiikkaTest() {
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
     * Test of tulostaMenu method, of class ToimintaLogiikka.
     */
    @Test
    public void testTulostaMenu() {
        System.out.println("tulostaMenu");
        ToimintaLogiikka instance = null;
        instance.tulostaMenu();
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostetaanJuomat method, of class ToimintaLogiikka.
     */
    @Test
    public void testTulostetaanJuomat() {
        System.out.println("tulostetaanJuomat");
        ToimintaLogiikka instance = null;
        instance.tulostetaanJuomat();
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostetaanBaariReissut method, of class ToimintaLogiikka.
     */
    @Test
    public void testTulostetaanBaariReissut() {
        System.out.println("tulostetaanBaariReissut");
        ToimintaLogiikka instance = null;
        instance.tulostetaanBaariReissut();
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of LisataanBaariReissu method, of class ToimintaLogiikka.
     */
    @Test
    public void testLisataanBaariReissu() throws Exception {
        System.out.println("LisataanBaariReissu");
        BufferedReader multiLukija = null;
        BaariHallinta baariHallinta = null;
        JuomaHallinta juomaHallinta = null;
        Scanner lukija = null;
        EbeanServer server = null;
        ToimintaLogiikka instance = null;
        instance.LisataanBaariReissu(multiLukija, baariHallinta, juomaHallinta, lukija, server);
        fail("The test case is a prototype.");
    }

    /**
     * Test of aloitetaanLisaysJosBaariLoytyy method, of class ToimintaLogiikka.
     */
    @Test
    public void testAloitetaanLisaysJosBaariLoytyy() throws Exception {
        System.out.println("aloitetaanLisaysJosBaariLoytyy");
        BaariHallinta baariHallinta = null;
        String paikanNimi = "";
        BufferedReader multiLukija = null;
        BaariReissu reissu = null;
        JuomaHallinta juomaHallinta = null;
        Scanner lukija = null;
        ToimintaLogiikka instance = null;
        instance.aloitetaanLisaysJosBaariLoytyy(baariHallinta, paikanNimi, multiLukija, reissu, juomaHallinta, lukija);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of baariRyyppyReissuValinta method, of class ToimintaLogiikka.
     */
    @Test
    public void testBaariRyyppyReissuValinta() throws Exception {
        System.out.println("baariRyyppyReissuValinta");
        Scanner lukija = null;
        BufferedReader multiLukija = null;
        BaariHallinta baariHallinta = null;
        JuomaHallinta juomaHallinta = null;
        EbeanServer serveri = null;
        ToimintaLogiikka instance = null;
        instance.baariRyyppyReissuValinta(lukija, multiLukija, baariHallinta, juomaHallinta, serveri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valintaLogiikka method, of class ToimintaLogiikka.
     */
    @Test
    public void testValintaLogiikka() throws Exception {
        System.out.println("valintaLogiikka");
        int valinta = 0;
        Scanner lukija = null;
        BufferedReader multiLukija = null;
        JuomaHallinta juomaHallinta = null;
        BaariHallinta baariHallinta = null;
        EbeanServer serveri = null;
        ToimintaLogiikka instance = null;
        instance.valintaLogiikka(valinta, lukija, multiLukija, juomaHallinta, baariHallinta, serveri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaaBaarireissut method, of class ToimintaLogiikka.
     */
    @Test
    public void testListaaBaarireissut() {
        System.out.println("listaaBaarireissut");
        EbeanServer serveri = null;
        ToimintaLogiikka instance = null;
        instance.listaaBaarireissut(serveri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}