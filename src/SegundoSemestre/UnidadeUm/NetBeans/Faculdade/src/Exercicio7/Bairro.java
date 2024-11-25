/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;

/**
 *
 * @author emanu
 */
public class Bairro {
    
    private String nome;
    private Double coeficienteIptu;

    public Bairro() {
    }

    public Bairro(String nome, Double coeficienteIptu) {
        this.nome = nome;
        this.coeficienteIptu = coeficienteIptu;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(Double coeficienteIptu) {
        this.coeficienteIptu = coeficienteIptu;
    }
    
    
    
    
    
}
