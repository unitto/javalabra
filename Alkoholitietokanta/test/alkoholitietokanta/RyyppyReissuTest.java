/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

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
public class RyyppyReissuTest {
    
    public RyyppyReissuTest() {
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
     * Test of getRyyppyReissunNimi method, of class RyyppyReissu.
     */
    @Test
    public void testGetRyyppyReissunNimi() {
        System.out.println("getRyyppyReissunNimi");
        RyyppyReissu instance = new RyyppyReissu();
        String expResult = "";
        String result = instance.getRyyppyReissunNimi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}