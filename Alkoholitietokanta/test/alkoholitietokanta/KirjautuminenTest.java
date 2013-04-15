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
public class KirjautuminenTest {
    
    public KirjautuminenTest() {
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
     * Test of ohjelmanAloitus method, of class Kirjautuminen.
     */
    @Test
    public void testOhjelmanAloitus() throws Exception {
        System.out.println("ohjelmanAloitus");
        boolean uusiTietokanta = false;
        Kirjautuminen instance = null;
        instance.ohjelmanAloitus(uusiTietokanta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}