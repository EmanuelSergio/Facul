package exerciciosUnidade5;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        
        //Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

        Scanner leia = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            
            System.out.println("Informe o numero "+(i+1));
            int num = leia.nextInt();

            if(num % 2 == 0){
                System.out.println(num + " é par");
            }else{
                System.out.println(num + " é ímpar");
            }

        }

        leia.close();

    }
}
