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
public class Empresa {
    
    private String nome;

    ArrayList<Funcionario> funcionarios = new ArrayList();
    
    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void incluirFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }
    
    public double calcularCustosSalarios(){
        double custo=0;
        for (Funcionario funcionario : funcionarios) {
            custo += funcionario.calcularSalario();
        }
        return custo;
    }
    
    
}
