/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio11;

/**
 *
 * @author emanu
 */
public class Teste {

    public static void main(String[] args) {
        
        Contas contas = new Contas();
        ContaAgua contaAgua = new ContaAgua(36, 2.0);
        MensalidadeEnsino mensalidade = new MensalidadeEnsino(20, 100);
        PrevidenciaPrivada investimentos = new PrevidenciaPrivada();
        
        investimentos.setValor(1000);
        investimentos.investir();
        
        contas.incluirConta(contaAgua);
        contas.incluirConta(mensalidade);
        contas.incluirConta(investimentos);
        
        System.out.println(contas.calcularTotalContas());
        
        System.out.println(contaAgua.calcularValorPagavel());
        System.out.println(mensalidade.calcularValorPagavel());
        System.out.println(investimentos.calcularValorPagavel());
        
        
    }
    
}
