/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prova.Questao1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author esgirardi
 */
public class EstadiaTest {
    
       @Test
    public void test1(){
        Estadia estadia = new Estadia(Periodo.ALTA_TEMPORADA, 8);
        assertTrue(estadia.precoPagar() == 1411.20f);
    }
    
    @Test
    public void test2(){
        Estadia estadia = new Estadia(Periodo.MEDIA_TEMPORADA, 1);
        assertTrue(estadia.precoPagar() == 157.50f);
    }
    
    @Test
    public void test3(){
        Estadia estadia = new Estadia(Periodo.BAIXA_TEMPORADA, 5);
        assertTrue(estadia.precoPagar() == 525.00f);
    }
    
    @Test
    public void test4(){
        Estadia estadia = new Estadia(Periodo.BAIXA_TEMPORADA, 1);
        assertTrue(estadia.precoPagar() == 110.25f);
    }
    
    @Test
    public void test5(){
        Estadia estadia = new Estadia(Periodo.MEDIA_TEMPORADA, 3);
        assertTrue(estadia.precoPagar() == 450.00f);
    }
    
}
