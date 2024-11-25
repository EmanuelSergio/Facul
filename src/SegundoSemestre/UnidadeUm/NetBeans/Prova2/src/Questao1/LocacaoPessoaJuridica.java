/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

import java.util.ArrayList;

/**
 *
 * @author Emanuel Sergio Girardi
 */
public class LocacaoPessoaJuridica extends Locacao {
 
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    
    
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void incluirVeiculo(Veiculo veiculo){
        if(veiculo == null){
            throw  new IllegalArgumentException("Valor para o campo veiculo está incorreto");
        }
        
        veiculos.add(veiculo);
    }
    
    @Override
    public Double getValorTotal() {
        Double temp = 0.0;
        for (Veiculo veiculo : veiculos) {
            temp += getQuantidadeDias() * veiculo.getPrecoDiaria();
        }
        return temp-(temp * 0.1);
    }
    
    @Override
    public String imprimir() {
        return "Valor total: $"+getValorTotal()+" Veiculos"+getVeiculos();
    }
    
}
