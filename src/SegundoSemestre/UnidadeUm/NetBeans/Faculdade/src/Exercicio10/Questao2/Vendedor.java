/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10.Questao2;

import java.util.ArrayList;

/**
 *
 * @author esgirardi
 */
public class Vendedor extends Funcionario {
    
    private double percentualComissao;
    ArrayList<Venda> vendas = new ArrayList();

    public Vendedor(double percentualComissao, String nome, Double salarioBase) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public void incluirVenda(Venda venda){
        vendas.add(venda);
    }

    @Override
    public double calcularSalario() {
       
        double valoresVendas=0;
        for (Venda venda : vendas) {
            valoresVendas += venda.getVenda() * (percentualComissao/100);
        }
        return getSalarioBase() + valoresVendas;
    }
    
    
}
