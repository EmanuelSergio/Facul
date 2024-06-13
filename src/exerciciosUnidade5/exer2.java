package exerciciosUnidade5;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        
        //Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

        Scanner leia = new Scanner(System.in);

        int par=0;
        int impar=0;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Informe o numero "+(i+1));
            int num = leia.nextInt();

            if(num % 2 == 0){
                System.out.println(num + " é par");
                par = par+num;
            }else{
                System.out.println(num + " é ímpar");
                impar = impar+num;
            }

        }


        System.out.println("soma dos pares: " + par);
        System.out.println("soma dos impares: " + impar);


        leia.close();
    }
}
