package exerciciosUnidade6;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        
        /**Descreva um algoritmo que leia 12 valores
         *  reais e os coloque em um vetor de 12 posições
         *  do tipo real. Em seguida, modifique o vetor de
         *  modo que os valores das posições ímpares sejam
         *  aumentados em 5% e os das posições pares sejam
         *  aumentados em 2%. Imprima o vetor resultante.
         *  Faça um método para ler os valores, outro para
         *  ajustar os valores dentro do vetor e outro para
         *  escrever os valores atualizados do vetor.

 */

        //par = 2%
        //impar = 5%

        Scanner leia = new Scanner(System.in);

        Double[] valores = new Double[6];

        //metodo de ler valores
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe o valor do " +(i+1)+"º valor ");
            valores[i] = leia.nextDouble();
        }

        //metodo de aumentar valor
        for (int i = 0; i < valores.length; i++) {
            
            if(i % 2 == 0){
                System.out.println("so posicoes pares");
                valores[i] += valores[i] * 0.02;
            }else{
                valores[i] += valores[i] * 0.05;
            }

        }
        
        //metodo de imprimir vetor atualizado
        for (int i = 0; i < valores.length; i++) {
            System.out.println("O valor atualizado do " +(i+1)+"º valor é:\n"+valores[i]);
        }

        leia.close();
    }
}
