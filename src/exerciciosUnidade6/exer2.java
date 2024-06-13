package exerciciosUnidade6;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        /* Descreva um algoritmo que leia 12 valores
         reais e os coloque em um vetor de 12 posições
          do tipo real. Imprima quais valores desses informados
           são maiores que a média dos valores. Faça um método para
            ler os valores, outro para calcular a média e outro para
             informar os valores maiores que a média. */


             double valores[] = new double[3];
             double soma=0;
             double media;

            for (int i = 0; i < valores.length; i++) {
                System.out.println("informe o valor de número "+(i+1));
                valores[i] = leia.nextDouble();
                
                soma += valores[i];
            }

            media = soma / valores.length;

            for (int i = 0; i < valores.length; i++) {
                
                if (valores[i] > media) {
                    System.out.println("esse valor é acima da média: " +valores[i]);
                }
            }

            

            leia.close();

    }
}
