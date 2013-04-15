/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import java.util.HashMap;
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
public class BaariReissuTest {
    
    public BaariReissuTest() {
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
     * Test of getId method, of class BaariReissu.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        BaariReissu instance = new BaariReissu();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class BaariReissu.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        BaariReissu instance = new BaariReissu();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBaarinNimi method, of class BaariReissu.
     */
    @Test
    public void testSetBaarinNimi() {
        System.out.println("setBaarinNimi");
        String baarinNimi = "";
        BaariReissu instance = new BaariReissu();
        instance.setBaarinNimi(baarinNimi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJuodutJuomatLista method, of class BaariReissu.
     */
    @Test
    public void testGetJuodutJuomatLista() {
        System.out.println("getJuodutJuomatLista");
        BaariReissu instance = new BaariReissu();
        HashMap expResult = null;
        HashMap result = instance.getJuodutJuomatLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJuodutJuomatLista method, of class BaariReissu.
     */
    @Test
    public void testSetJuodutJuomatLista() {
        System.out.println("setJuodutJuomatLista");
        HashMap<Juoma, Integer> juodutJuomatLista = null;
        BaariReissu instance = new BaariReissu();
        instance.setJuodutJuomatLista(juodutJuomatLista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaJuoma method, of class BaariReissu.
     */
    @Test
    public void testLisaaJuoma_Juoma() {
        System.out.println("lisaaJuoma");
        Juoma j = null;
        BaariReissu instance = new BaariReissu();
        instance.lisaaJuoma(j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaJuoma method, of class BaariReissu.
     */
    @Test
    public void testLisaaJuoma_Juoma_int() {
        System.out.println("lisaaJuoma");
        Juoma j = null;
        int maara = 0;
        BaariReissu instance = new BaariReissu();
        instance.lisaaJuoma(j, maara);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poistaJuoma method, of class BaariReissu.
     */
    @Test
    public void testPoistaJuoma() {
        System.out.println("poistaJuoma");
        Juoma j = null;
        BaariReissu instance = new BaariReissu();
        boolean expResult = false;
        boolean result = instance.poistaJuoma(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}