/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10.Questao1;

/**
 *
 * @author esgirardi
 */
public class Circulo extends Figura{
    
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        int r = raio*2;
        return Math.PI * r;
    }
}
