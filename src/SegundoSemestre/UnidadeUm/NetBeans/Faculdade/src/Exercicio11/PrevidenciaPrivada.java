/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio11;

/**
 *
 * @author emanu
 */
public class PrevidenciaPrivada extends Investimento {
    
    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void investir(){
        setSaldo(getSaldo() + valor);
    }
    
    @Override
    public double calcularValorPagavel() {
        return valor;
    }    
    
}
