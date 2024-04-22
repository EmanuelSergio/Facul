package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        
    /*Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.

 */

    Scanner leia = new Scanner(System.in);

    System.out.println("Informe o primeiro número");
    Double num1 = leia.nextDouble();

    System.out.println("Informe o segundo número");
    Double num2 = leia.nextDouble();

    if(num1 % num2 == 0){
        System.out.println("o número 1 é um multiplo do número 2");
    }else{
        System.out.println("o número 1 não é um multiplo do número 2");
    }



    leia.close();

    }
}
