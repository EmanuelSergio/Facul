/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10.Questao2;

/**
 *
 * @author esgirardi
 */
public class Funcionario {
 
    private String nome;
    private Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario(){
        return salarioBase;
    }

    @Override
    public String toString() {
        return  "Nome"+ getNome() +" Salario:" + calcularSalario();
    }
    
    
    
}
