package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {
        
        //Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

        Scanner leia = new Scanner(System.in);

        int numero1=0, numero2=0, maior=0;

        System.out.println("Informe o primeiro numero");
        numero1 = leia.nextInt();

        System.out.println("Informe o segundo numero");
        numero2 = leia.nextInt();

        if(numero1 > numero2){
            maior = numero1;
            System.out.println("o numero 1 é maior: "+maior);
        }else{
            maior = numero2;
            System.out.println("o numero 2 é maior: "+maior);
        }





        leia.close();
    }

}
