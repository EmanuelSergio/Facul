package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        
        /**
         * Dada uma pergunta, “a cor é azul?”, 
         * faça um programa que leia uma variável 
         * lógica com a resposta e responda “Sim”, 
         * caso a resposta seja true, ou “Não”, caso seja false.
         * 
         */


         Scanner leia = new Scanner(System.in);



        System.out.println("a cor é azul");
        String resposta = leia.nextLine();

        if (resposta.toUpperCase().charAt(0) == 'S') {
            System.out.println("a cor é azul");
        }else if (resposta.toUpperCase().charAt(0) == 'N'){
            System.out.println("A cor não é azul");
        }else{
            System.out.println("informe sim ou não");
        }





        leia.close();
    }
}
