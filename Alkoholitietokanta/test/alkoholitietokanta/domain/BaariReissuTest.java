/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta.domain;

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
     * Test of getJuomaLista method, of class BaariReissu.
     */
    @Test
    public void testGetJuomaLista() {
        System.out.println("getJuomaLista");
        BaariReissu instance = new BaariReissu();
        List expResult = null;
        List result = instance.getJuomaLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJuomaLista method, of class BaariReissu.
     */
    @Test
    public void testSetJuomaLista() {
        System.out.println("setJuomaLista");
        List<JuomaTilaus> juomaLista = null;
        BaariReissu instance = new BaariReissu();
        instance.setJuomaLista(juomaLista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKuvaus method, of class BaariReissu.
     */
    @Test
    public void testGetKuvaus() {
        System.out.println("getKuvaus");
        BaariReissu instance = new BaariReissu();
        String expResult = "";
        String result = instance.getKuvaus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKuvaus method, of class BaariReissu.
     */
    @Test
    public void testSetKuvaus() {
        System.out.println("setKuvaus");
        String kuvaus = "";
        BaariReissu instance = new BaariReissu();
        instance.setKuvaus(kuvaus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of getBaarinNimi method, of class BaariReissu.
     */
    @Test
    public void testGetBaarinNimi() {
        System.out.println("getBaarinNimi");
        BaariReissu instance = new BaariReissu();
        String expResult = "";
        String result = instance.getBaarinNimi();
        assertEquals(expResult, result);
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
     * Test of lisaaJuoma method, of class BaariReissu.
     */
    @Test
    public void testLisaaJuoma() {
        System.out.println("lisaaJuoma");
        JuomaTilaus jT = null;
        BaariReissu instance = new BaariReissu();
        instance.lisaaJuoma(jT);
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

    /**
     * Test of toString method, of class BaariReissu.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BaariReissu instance = new BaariReissu();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostaJuomat method, of class BaariReissu.
     */
    @Test
    public void testTulostaJuomat() {
        System.out.println("tulostaJuomat");
        BaariReissu instance = new BaariReissu();
        instance.tulostaJuomat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loytyykoJuoma method, of class BaariReissu.
     */
    @Test
    public void testLoytyykoJuoma() {
        System.out.println("loytyykoJuoma");
        Juoma j = null;
        BaariReissu instance = new BaariReissu();
        JuomaTilaus expResult = null;
        JuomaTilaus result = instance.loytyykoJuoma(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}