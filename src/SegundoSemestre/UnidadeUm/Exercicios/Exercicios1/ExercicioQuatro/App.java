package SegundoSemestre.UnidadeUm.Exercicios.Exercicios1.ExercicioQuatro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        Pessoa pessoas[] = new Pessoa[3];
        

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.println("Informe o Nome da "+(i+1) +"ª pessoa");
            pessoas[i].nome = leia.next();
            
            System.out.println("Informe o altura da "+(i+1) +"ª pessoa");
            pessoas[i].altura = leia.nextDouble();
            
            System.out.println("Informe o peso da "+(i+1) +"ª pessoa");
            pessoas[i].peso = leia.nextDouble();
        }

        for (int i = 2; i >= 0; i--) {
            System.out.println(pessoas[i].nome+":\n");
            System.out.printf("IMC: %.2f\n", pessoas[i].calcularImc());
            System.out.println();
        }

        leia.close();
    }   
}
