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
public class JuomaTest {
    
    public JuomaTest() {
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
     * Test of getLisaaja method, of class Juoma.
     */
    @Test
    public void testGetLisaaja() {
        System.out.println("getLisaaja");
        Juoma instance = new Juoma();
        String expResult = "";
        String result = instance.getLisaaja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLisaaja method, of class Juoma.
     */
    @Test
    public void testSetLisaaja() {
        System.out.println("setLisaaja");
        String lisaaja = "";
        Juoma instance = new Juoma();
        instance.setLisaaja(lisaaja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Juoma.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Juoma instance = new Juoma();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Juoma.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Juoma instance = new Juoma();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Juoma.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Juoma instance = new Juoma();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Juoma.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Juoma instance = new Juoma();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJuomanKuvaus method, of class Juoma.
     */
    @Test
    public void testSetJuomanKuvaus() {
        System.out.println("setJuomanKuvaus");
        String juomanKuvaus = "";
        Juoma instance = new Juoma();
        instance.setJuomanKuvaus(juomanKuvaus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJuomanKuvaus method, of class Juoma.
     */
    @Test
    public void testGetJuomanKuvaus() {
        System.out.println("getJuomanKuvaus");
        Juoma instance = new Juoma();
        String expResult = "";
        String result = instance.getJuomanKuvaus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJuomanAlkoholiprosentti method, of class Juoma.
     */
    @Test
    public void testSetJuomanAlkoholiprosentti() {
        System.out.println("setJuomanAlkoholiprosentti");
        double juomanAlkoholiprosentti = 0.0;
        Juoma instance = new Juoma();
        instance.setJuomanAlkoholiprosentti(juomanAlkoholiprosentti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJuomanAlkoholiprosentti method, of class Juoma.
     */
    @Test
    public void testGetJuomanAlkoholiprosentti() {
        System.out.println("getJuomanAlkoholiprosentti");
        Juoma instance = new Juoma();
        double expResult = 0.0;
        double result = instance.getJuomanAlkoholiprosentti();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Juoma.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Juoma instance = new Juoma();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}