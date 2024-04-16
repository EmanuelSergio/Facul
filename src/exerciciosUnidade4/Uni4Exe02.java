package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {
        
        //Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Informe um numero");
        numero = leia.nextInt();

        if(numero % 2 == 0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }



        leia.close();
    }

}
