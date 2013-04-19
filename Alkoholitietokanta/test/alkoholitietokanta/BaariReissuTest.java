/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholitietokanta;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unit
 */
public class BaariReissuTest {
    
    public BaariReissuTest() {
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaJuoma method, of class BaariReissu.
     */
    @Test
    public void testLisaaJuoma() throws Exception {
        System.out.println("lisaaJuoma");
        Juoma j = null;
        int maara = 0;
        BaariReissu instance = new BaariReissu();
        instance.lisaaJuoma(j, maara);
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
        fail("The test case is a prototype.");
    }
}