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
public class Programador extends Funcionario {

    ArrayList<String> linguagens = new ArrayList();
    
    
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
    
    public void incluirLinguagem(String linguagem){
        linguagens.add(linguagem.toUpperCase());
    }
        
    public void removerLinguagem(String linguagem){
        linguagens.remove(linguagem);
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    @Override
    public double calcularSalario() {
        for (String linguagen : linguagens) {
            if(linguagen.equalsIgnoreCase("java")){
                return getSalarioBase() * 0.2;
            }      
        }
        return getSalarioBase();
    }
}
