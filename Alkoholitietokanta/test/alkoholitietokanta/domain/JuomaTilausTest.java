/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta.domain;

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
public class JuomaTilausTest {
    
    public JuomaTilausTest() {
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
     * Test of getId method, of class JuomaTilaus.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        JuomaTilaus instance = new JuomaTilaus();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBaariReissu method, of class JuomaTilaus.
     */
    @Test
    public void testGetBaariReissu() {
        System.out.println("getBaariReissu");
        JuomaTilaus instance = new JuomaTilaus();
        BaariReissu expResult = null;
        BaariReissu result = instance.getBaariReissu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBaariReissu method, of class JuomaTilaus.
     */
    @Test
    public void testSetBaariReissu() {
        System.out.println("setBaariReissu");
        BaariReissu baariReissu = null;
        JuomaTilaus instance = new JuomaTilaus();
        instance.setBaariReissu(baariReissu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class JuomaTilaus.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        JuomaTilaus instance = new JuomaTilaus();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJuoma method, of class JuomaTilaus.
     */
    @Test
    public void testGetJuoma() {
        System.out.println("getJuoma");
        JuomaTilaus instance = new JuomaTilaus();
        Juoma expResult = null;
        Juoma result = instance.getJuoma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJuoma method, of class JuomaTilaus.
     */
    @Test
    public void testSetJuoma() {
        System.out.println("setJuoma");
        Juoma juoma = null;
        JuomaTilaus instance = new JuomaTilaus();
        instance.setJuoma(juoma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaara method, of class JuomaTilaus.
     */
    @Test
    public void testGetMaara() {
        System.out.println("getMaara");
        JuomaTilaus instance = new JuomaTilaus();
        Integer expResult = null;
        Integer result = instance.getMaara();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaara method, of class JuomaTilaus.
     */
    @Test
    public void testSetMaara() {
        System.out.println("setMaara");
        Integer maara = null;
        JuomaTilaus instance = new JuomaTilaus();
        instance.setMaara(maara);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class JuomaTilaus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        JuomaTilaus instance = new JuomaTilaus();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}