package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        
        /*Dados 3 valores lado1, lado2, lado3, que representam os 
        comprimentos dos lados de um triângulo, descreva um algoritmo 
        que verifique se os mesmos podem ser os comprimentos dos lados 
        de um triângulo. Em caso afirmativo, verifique e informe se é 
        "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno". 
        Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

        o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados
        um triângulo equilátero tem três lados iguais
        um triângulo isóscele tem dois lados iguais e um diferente
        um triângulo escaleno tem três lados diferentes

 */

         Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o comprimento do lado 1 do triângulo:");
        double lado1 = leia.nextDouble();
        
        System.out.println("Digite o comprimento do lado 2 do triângulo:");
        double lado2 = leia.nextDouble();
        
        System.out.println("Digite o comprimento do lado 3 do triângulo:");
        double lado3 = leia.nextDouble();
        
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os comprimentos dados não formam um triângulo.");
        }



        leia.close();
    }
}
