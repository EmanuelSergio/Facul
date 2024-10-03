/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao8;

import java.util.ArrayList;

/**
 *
 * @author esgirardi
 */
public class App {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(10, "emanuk", 10);
        Aluno aluno2 = new Aluno(12, "carlo", 9);
        Aluno aluno3 = new Aluno(14, "lucas", 8);
        
        Turma turma = new Turma();
        
        turma.incluirAluno(aluno1);
        turma.incluirAluno(aluno2);
        turma.incluirAluno(aluno3);
        
       // ArrayList<Aluno> alunos = new ArrayList<>();
        //alunos.add(aluno1);
        //alunos.add(aluno2);
        //alunos.add(aluno3);
        
        //Turma turma2 = new Turma("disdas", null, Turno.NOTURNO, alunos);
        
        
        System.out.println("opa");
        
        
        System.out.println(turma.getAlunos().toString());
        System.out.println(turma.obterAlunoMelhorNotaEnem());
        
    }
}
