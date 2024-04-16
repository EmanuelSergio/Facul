package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        
        /* Faça um algoritmo que leia um caractere. 
        Caso seja digitada a letra 'M' escreva “Masculino”.
        Se for digitada a letra 'F' escreva “Feminino”. 
        Se for informado 'I' escreva “Não Informado”.
        Qualquer outra letra digitada escreva “Entrada Incorreta”. 
        Atenção: antes de testar a letra, converta-a para maiúscula.*/

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe M, F ou I");
        String resposta = leia.nextLine();


        if (resposta.equalsIgnoreCase("M")) {
            System.out.println("masculino");
        }else if (resposta.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        }else if (resposta.equalsIgnoreCase("I")){
            System.out.println("Não informado");
        }else{
            System.out.println("entrada incorreta");
        }

        leia.close();
    }
}
