package exerciciosUnidade5;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        
        //Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.

        Scanner leia = new Scanner(System.in);

        
        
        System.out.println("Informe a quantidade de numeros");
        int nums = leia.nextInt();
        double numero=0.0;
        double maior=0.0,menor=Integer.MAX_VALUE; // para saber o maior e menor, é necessario setar com o mair valor possivel e 
                                                  // com o menor valor possivel

                                                  
        for (int i = 0; i < nums; i++) {
            
            System.out.printf("Informe o %dª número\n", i+1);
            numero = leia.nextDouble();

            if(numero > maior){
                maior = numero;
            }

            
            if(numero < menor){
                menor = numero;
            }

        }

        System.out.println("o maior numero foi "+maior);
        System.out.println("o menor numero foi "+menor);
        
        leia.close();
    }
}
