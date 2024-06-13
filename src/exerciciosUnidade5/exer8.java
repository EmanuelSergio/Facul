package exerciciosUnidade5;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        
        /*Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

        escreva o menor valor negativo;
        escreva a média dos números positivos. */

        Scanner leia = new Scanner(System.in);

        double menorNegativo = Integer.MAX_VALUE; 
        double numero;
        double maiorPositivo=0.0;
        int qntPositivos=0;

        System.out.println("Informe a quantidade de numeros");
        int nums = leia.nextInt();

        for (int i = 0; i < nums; i++) {
            
            System.out.printf("Informe o %dª número\n", i+1);
            numero = leia.nextDouble();

            if(numero < 0 && numero < menorNegativo){
                menorNegativo = numero;
                System.out.println("foi");
            }

            if (numero > 0) {
                maiorPositivo += numero;
                qntPositivos++;
            }

        }

        System.out.println("o menor número foi: "+menorNegativo);
        System.out.println("a media entre os números positivos foi de: "+ maiorPositivo/qntPositivos);

        leia.close();
    }
}
