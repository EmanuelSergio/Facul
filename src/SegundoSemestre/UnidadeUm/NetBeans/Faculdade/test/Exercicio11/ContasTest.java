/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Exercicio11;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emanu
 */
public class ContasTest {
    
    public ContasTest() {
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
     * Test of incluirConta method, of class Contas.
     */
    @Test
    public void testIncluirConta() {
        System.out.println("incluirConta");
        Pagavel conta = null;
        Contas instance = new Contas();
        instance.incluirConta(conta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContas method, of class Contas.
     */
    @Test
    public void testGetContas() {
        System.out.println("getContas");
        Contas instance = new Contas();
        ArrayList<Pagavel> expResult = null;
        ArrayList<Pagavel> result = instance.getContas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalContas method, of class Contas.
     */
    @Test
    public void testCalcularTotalContas() {
        System.out.println("calcularTotalContas");
        Contas instance = new Contas();
        double expResult = 0.0;
        double result = instance.calcularTotalContas();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
