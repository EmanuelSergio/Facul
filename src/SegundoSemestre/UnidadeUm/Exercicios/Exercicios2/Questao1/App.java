package SegundoSemestre.UnidadeUm.Exercicios.Exercicios2.Questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        Pessoa pessoas[] = new Pessoa[3];
        

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.println("Informe o Nome da "+(i+1) +"ª pessoa");
            pessoas[i].setNome(leia.next());
            
            System.out.println("Informe o altura da "+(i+1) +"ª pessoa");
            pessoas[i].setAltura(leia.nextDouble());
            
            System.out.println("Informe o peso da "+(i+1) +"ª pessoa");
            pessoas[i].setPeso(leia.nextDouble());
        }

        for (int i = 2; i >= 0; i--) {
            System.out.println(pessoas[i].getNome()+":\n");
            System.out.printf("IMC: %.2f\n", pessoas[i].calcularImc());
            System.out.println();
        }

        leia.close();
    }   
}
