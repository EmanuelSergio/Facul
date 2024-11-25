/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Junit.Pessoa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author esgirardi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//isso vai fazer os testes por ordem dos nomes
public class PessoaTest {
    
   
    @Test
    public void testCalcularImcValido() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(100);
        pessoa.setAltura(2);
        double imc = pessoa.calcularImc();
        
        assertEquals(25.0, imc, 0);
     
      
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeCalcularImcInvalido(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(-100);
    }
    
    

}
