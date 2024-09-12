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
    
    private static final double limitador = 0.01;
   
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
    
    @Test
    public void teste06_calcularIrpf() {
     Funcionario funcionario = new Funcionario("Maria",1903.99);
        assertEquals(0.00 ,funcionario.calcularIrpf(), limitador);
        
    }
    
    @Test
    public void teste07_identificarFaixaIrpfSegunda(){
         Funcionario funcionario = new Funcionario("Maria",2000.00);
        assertTrue(funcionario.identificarFaixaIrpf() == FaixaIrpf.SEGUNDA);
    }
    
    @Test
    public void teste08_calcularIrpf() {
     Funcionario funcionario = new Funcionario("Maria",2000.00);
        assertEquals(7.20 ,funcionario.calcularIrpf(),limitador);
        
    }
    
    @Test
     public void teste09_identificarFaixaIrpfSegunda(){
         Funcionario funcionario = new Funcionario("Maria",2826.65);
        assertEquals(FaixaIrpf.SEGUNDA ,funcionario.identificarFaixaIrpf());
    }
    
     @Test
     public void teste10_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",2826.65);
        assertEquals(69.20 ,funcionario.calcularIrpf(),limitador);
    }
     
     @Test
     public void teste11_identificarFaixaIrpfTerceira(){
         Funcionario funcionario = new Funcionario("Maria",2826.66);
        assertEquals(FaixaIrpf.TERCEIRA ,funcionario.identificarFaixaIrpf());
    }
     
     @Test
     public void teste12_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",2826.66);
        assertEquals(69.20 ,funcionario.calcularIrpf(),limitador);
    }
     
    @Test
     public void teste13_identificarFaixaIrpfTerceira(){
         Funcionario funcionario = new Funcionario("Maria",3000.00);
       assertEquals(FaixaIrpf.TERCEIRA ,funcionario.identificarFaixaIrpf());
    }
    
     @Test
     public void teste14_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",3000.00);
        assertEquals(95.20 ,funcionario.calcularIrpf(),limitador);
    }
    
     @Test
     public void teste15_identificarFaixaIrpfTerceira(){
         Funcionario funcionario = new Funcionario("Maria",3751.05);
       assertEquals(FaixaIrpf.TERCEIRA ,funcionario.identificarFaixaIrpf());
    }
     
    @Test
     public void teste16_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",3751.05);
        assertEquals(207.86 ,funcionario.calcularIrpf(),limitador);
    }
    
    @Test
     public void teste17_identificarFaixaIrpfQuarta(){
         Funcionario funcionario = new Funcionario("Maria",3751.06);
       assertEquals(FaixaIrpf.QUARTA ,funcionario.identificarFaixaIrpf());
    }
     
     @Test
     public void teste18_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",3751.06);
        assertEquals(207.86 ,funcionario.calcularIrpf(),limitador);
    }
     
    @Test
     public void teste19_identificarFaixaIrpfQuarta(){
         Funcionario funcionario = new Funcionario("Maria",4000.00);
       assertEquals(FaixaIrpf.QUARTA ,funcionario.identificarFaixaIrpf());
    }
     
    @Test
     public void teste20_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",4000.00);
        assertEquals(263.87 ,funcionario.calcularIrpf(),limitador);
    }
     
    @Test
     public void teste21_identificarFaixaIrpfQuarta(){
         Funcionario funcionario = new Funcionario("Maria",4664.68);
       assertEquals(FaixaIrpf.QUARTA ,funcionario.identificarFaixaIrpf());
    }
     
     @Test
     public void teste22_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",4664.68);
        assertEquals(413.42 ,funcionario.calcularIrpf(),limitador);
    }
     
    @Test
     public void teste23_identificarFaixaIrpfQuinta(){
         Funcionario funcionario = new Funcionario("Maria",4664.69);
       assertEquals(FaixaIrpf.QUINTA ,funcionario.identificarFaixaIrpf());
    }
     
    @Test
     public void teste24_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",4664.69);
        assertEquals(413.42 ,funcionario.calcularIrpf(),limitador);
    }
     
    @Test
     public void teste25_identificarFaixaIrpfQuinta(){
         Funcionario funcionario = new Funcionario("Maria",5000.00);
       assertEquals(FaixaIrpf.QUINTA ,funcionario.identificarFaixaIrpf());
    }
     
    @Test
     public void teste26_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria",5000.00);
        assertEquals(505.64 ,funcionario.calcularIrpf(),limitador);
    }
     
     @Test(expected = IllegalArgumentException.class)
     public void teste27_calcularIrpf(){
         Funcionario funcionario = new Funcionario("Maria", 0.00);
         funcionario.setSalario(-100.00);
    }
     
}
