/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Junit.Pessoa.ImpostoDeRenda;

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
public class FuncionarioTest {
    
   
    @Test
    public void teste01_identificarFaixaIrpfPrimeira() {
       
        Funcionario funcionario = new Funcionario("Maria",850.00);
        assertTrue(funcionario.identificarFaixaIrpf() == FaixaIrpf.PRIMEIRA);
    }

    @Test
    public void teste02_calcularIrpf(){
       Funcionario funcionario = new Funcionario("Maria",850.00);
        assertTrue(funcionario.calcularIrpf() == 0.00);
    }
    
   
    @Test
    public void teste03_identificarFaixaIrpfPrimeira() {
       
     Funcionario funcionario = new Funcionario("Maria",1903.98);
        assertTrue(funcionario.identificarFaixaIrpf() == FaixaIrpf.PRIMEIRA);
        
    }
   
    @Test
    public void teste04_calcularIrpf(){
       Funcionario funcionario = new Funcionario("Maria",1903.98);
        assertTrue(funcionario.calcularIrpf() == 0.00);
    }
    
    
    @Test
    public void teste05_identificarFaixaIrpfSegunda() {
       
     Funcionario funcionario = new Funcionario("Maria",1903.99);
        assertTrue(funcionario.identificarFaixaIrpf() == FaixaIrpf.SEGUNDA);
        
    }
    
}
