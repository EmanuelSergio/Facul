/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Exercicio7;

import Junit.Pessoa.ImpostoDeRenda.FaixaIrpf;
import Junit.Pessoa.Pessoa;
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
public class ImovelTest {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testAreaNegativa() {
        Imovel imovel = new Imovel();
        imovel.setArea(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testbairro() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 1.0);
        imovel.setBairro(bairro);
        imovel.calcularIptu();
    }
    
      @Test(expected = IllegalArgumentException.class)
    public void testFinalidade() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 1.0);
        imovel.setBairro(bairro);
        imovel.setArea(250);
        imovel.calcularIptu();
    }
    
         @Test(expected = IllegalArgumentException.class)
    public void testSemBairro() {
        Imovel imovel = new Imovel();
        imovel.setArea(400);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.calcularIptu();
    }
    
       @Test
    public void testCalculo1() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 1.0);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setBairro(bairro);
        imovel.setArea(400);

           assertTrue(imovel.calcularIptu() == 400);
    }
    
          @Test
    public void testCalculo2() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 1.0);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);
        imovel.setArea(80);

           assertTrue(imovel.calcularIptu() == 500);
    }
    
        
          @Test
    public void testCalculo3() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 1.0);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);
        imovel.setArea(250);

           assertTrue(imovel.calcularIptu() == 1000);
    }
    
            @Test
    public void testCalculo4() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 1.0);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);
        imovel.setArea(500);

           assertTrue(imovel.calcularIptu() == 1275);
    }
    
    @Test
    public void testCalculo5() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 1.0);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setBairro(bairro);
        imovel.setArea(2000);

           assertTrue(imovel.calcularIptu() == 1000);
    }
    
     
    @Test
    public void testCalculo6() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 1.0);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setBairro(bairro);
        imovel.setArea(3000);
           assertTrue(imovel.calcularIptu() == 1650.00);
    }
    
     @Test
    public void testCalculo7() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro("centro", 2.5);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setBairro(bairro);
        imovel.setArea(500);

           assertTrue(imovel.calcularIptu() == 1250);
    }
    
    
}
