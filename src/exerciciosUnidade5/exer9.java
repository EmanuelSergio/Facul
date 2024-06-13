package exerciciosUnidade5;

import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        
        /*Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

        escreva os nomes dos alunos que tem 18 anos;
        escreva a quantidade de alunos que tem idade acima de 20 anos. */

        Scanner leia = new Scanner(System.in);

        String nomeAluno;
        int idade;
        int maisVinte=0;

        System.out.println("Informe a quantidade de alunos nas turma");
        int quantidadeAluno = leia.nextInt();

        for (int i = 0; i < quantidadeAluno; i++) {
            System.out.printf("informe o Nome do %dº aluno\n", i+1);
            nomeAluno = leia.next();

            System.out.printf("\ninforme a idade do %dº aluno", i+1);
            idade = leia.nextInt();

            if(idade > 20){
                maisVinte++;
            }
            
            if(idade == 18){
                System.out.println("Aluno tem 18 anos: "+nomeAluno);
            }



        }

        System.out.println("A quantidade de alunos que tem mais de 20 anos é: " +maisVinte);
        
        leia.close();
    }
}

