/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Junit.Pessoa;

/**
 *
 * @author esgirardi
 */
public class Pessoa {
    
        private double peso;
    private double altura;
    private String nome;

public double calcularImc(){
    return getPeso()/(Math.pow(getAltura(), 2));
}

public double getPeso() {
    return peso;
    
}

public void setPeso(double peso) {
    if (peso < 0) {
        throw new IllegalArgumentException("Peso da Pessoa Inválido");
    }
    this.peso = peso;
    
}

public double getAltura() {
    return altura;
    
}

public void setAltura(double altura) {
    if (altura > 3) {
        throw new IllegalArgumentException("Altura da Pessoa Inválida");
    }
    this.altura = altura;
    
}

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

    
}
