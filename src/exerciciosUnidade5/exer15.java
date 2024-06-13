package exerciciosUnidade5;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        
        /*Dada uma turma de alunos, contendo seu nome e nota de duas provas
         descreva um algoritmo para informar a média de cada aluno. Considere
          que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”. */

        Scanner leia = new Scanner(System.in);


          do {
            


            System.out.println("Informe o nome do primeiro aluno ou digite fim para sair");
            String aluno1 = leia.next();

            if(aluno1.equalsIgnoreCase("fim")){
                break;
            }

            System.out.println("Informe a primeira nota do " + aluno1);
            double nota1 = leia.nextDouble();

            System.out.println("Informe a segunda nota do " + aluno1);
            double nota2 = leia.nextDouble();

           

            double mediaAluno1 = (nota1 + nota2) / 2;
        

            System.out.println("O aluno " +aluno1 + " teve a média: " + mediaAluno1);
        

          } while (true);

          System.out.println("finalizado");



          leia.close();

    }
}
