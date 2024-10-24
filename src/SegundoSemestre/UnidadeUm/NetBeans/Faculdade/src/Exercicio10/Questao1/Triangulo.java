/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10.Questao1;

/**
 *
 * @author esgirardi
 */
public class Triangulo extends Figura {

    private int lado1;
    private int lado2;
    private int lado3;
    
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
      int p = (lado1 + lado2 + lado3)/2;
      int subformula = p * (p - lado1) * (p - lado2) * (p - lado3);
      return Math.sqrt(subformula);
    }
    
}
