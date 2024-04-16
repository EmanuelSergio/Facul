package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {
        
        //Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.

        Scanner leia = new Scanner(System.in);



        System.out.println("Informe o numero");
        double numero = leia.nextDouble();

        if(numero > 0 && numero % 1 == 0){
            System.out.println("o numero não possui casas decimais");
        }else{
            System.out.println("o numero possui casas decimais: ");
        }


        leia.close();
    }

}
