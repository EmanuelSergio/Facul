package exerciciosUnidade6;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        
        /**Faça um programa para ler os valores de dois vetores
         *  de inteiros, cada um contendo 10 elementos. Crie um
         *  terceiro vetor em que cada elemento é a soma dos valores
         *  contidos nas posições respectivas dos vetores originais.
         *  Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
         *  Exiba, ao final, os três vetores na tela. Faça três métodos: um
         *  método para ler valores dos vetores, outro para somar e outro para escrever os vetores. */


        Scanner leia = new Scanner(System.in);
        
        int[] valores1 = new int[5];
        int[] valores2 = new int[5];
        int[] valoresSomados = new int[5];

        System.out.println("Valores dos vetores");
        
        
        for (int i = 0; i < valores1.length; i++) {
            System.out.println("vetor 1");
            System.out.println("Informe o valor do " +(i+1)+"º elemento ");
            valores1[i]=leia.nextInt();
           
            System.out.println("Vetor 2");
                System.out.println("Informe o valor do " +(i+1)+"º elemento ");
                valores2[i]=leia.nextInt();

        }

            //soma valores na mesma posição
            for (int i = 0; i < valoresSomados.length; i++) {
                    valoresSomados[i] = valores1[i] + valores2[i];
            }

            for (int i = 0; i < valoresSomados.length; i++) {
                System.out.println(valoresSomados[i]);
            }

        leia.close();
    }
}
