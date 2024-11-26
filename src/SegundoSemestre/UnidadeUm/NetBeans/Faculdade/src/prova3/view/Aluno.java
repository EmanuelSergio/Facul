/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3.view;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esgirardi
 */
public class Aluno {
    
    private String nome;
    private List<Integer> notas = new ArrayList<>();
    
    
    
    public Aluno() {
    }

    
    public Aluno(String nome, List<Integer> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    
    
    
}
