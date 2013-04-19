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
public class RyyppyReissuTest {
    
    public RyyppyReissuTest() {
    }

    /**
     * Test of getRyyppyReissunNimi method, of class RyyppyReissu.
     */
    @Test
    public void testGetRyyppyReissunNimi() {
        System.out.println("getRyyppyReissunNimi");
        RyyppyReissu instance = new RyyppyReissu();
        String expResult = "";
        String result = instance.getRyyppyReissunNimi();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRyyppyReissunNimi method, of class RyyppyReissu.
     */
    @Test
    public void testSetRyyppyReissunNimi() {
        System.out.println("setRyyppyReissunNimi");
        String RyyppyReissunNimi = "";
        RyyppyReissu instance = new RyyppyReissu();
        instance.setRyyppyReissunNimi(RyyppyReissunNimi);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaBaariReissuista method, of class RyyppyReissu.
     */
    @Test
    public void testGetListaBaariReissuista() {
        System.out.println("getListaBaariReissuista");
        RyyppyReissu instance = new RyyppyReissu();
        List expResult = null;
        List result = instance.getListaBaariReissuista();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaBaariReissuista method, of class RyyppyReissu.
     */
    @Test
    public void testSetListaBaariReissuista() {
        System.out.println("setListaBaariReissuista");
        List<BaariReissu> listaBaariReissuista = null;
        RyyppyReissu instance = new RyyppyReissu();
        instance.setListaBaariReissuista(listaBaariReissuista);
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaBaariReissu method, of class RyyppyReissu.
     */
    @Test
    public void testLisaaBaariReissu() {
        System.out.println("lisaaBaariReissu");
        BaariReissu reissu = null;
        RyyppyReissu instance = new RyyppyReissu();
        instance.lisaaBaariReissu(reissu);
        fail("The test case is a prototype.");
    }

    /**
     * Test of poistaBaariReissu method, of class RyyppyReissu.
     */
    @Test
    public void testPoistaBaariReissu() {
        System.out.println("poistaBaariReissu");
        BaariReissu reissu = null;
        RyyppyReissu instance = new RyyppyReissu();
        boolean expResult = false;
        boolean result = instance.poistaBaariReissu(reissu);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}