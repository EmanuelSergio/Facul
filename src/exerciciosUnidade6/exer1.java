package exerciciosUnidade6;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        
        /*Descreva um algoritmo que leia 10 números inteiros
         e os coloque em um vetor de 10 posições do tipo inteiro.
          Escreva na ordem inversa em que foram lidos. Faça um
           método para ler e outro para escrever. */

        Scanner leia = new Scanner(System.in);

        int vetores[] = new int[10];

        
        
            
        

        for (int i = 0; i < vetores.length; i++) {
            System.out.printf("informe o %dº valor\n",i+1);
            vetores[i] = leia.nextInt();
            
        }

        System.out.println();

        
        for (int j = vetores.length; j > 0; j--) {
            System.out.println(vetores[j-1]);
        }



        

        

        leia.close();
    }
}
