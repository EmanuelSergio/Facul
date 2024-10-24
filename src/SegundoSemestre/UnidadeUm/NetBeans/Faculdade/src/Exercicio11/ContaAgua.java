/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio11;

/**
 *
 * @author emanu
 */
public class ContaAgua implements Pagavel{
    
    private int metrosCubicos;
    private double precoMetroCubico;

    public ContaAgua(int metrosCubicos, double precoMetroCubico) {
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }

    @Override
    public double calcularValorPagavel() {
        return metrosCubicos * precoMetroCubico;
    }
   
    
}
