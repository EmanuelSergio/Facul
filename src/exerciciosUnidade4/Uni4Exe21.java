package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        
        /*O índice de massa corporal (IMC) é uma medida internacional 
        usada para calcular se uma pessoa está no peso ideal. O IMC é 
        determinado pela divisão da massa do indivíduo pelo quadrado de 
        sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:

 */

         Scanner ler = new Scanner(System.in);
        System.out.print("Escreva sua massa corporal: ");
        double massa = ler.nextDouble();
        System.out.print("Escreva sua altura: ");
        double altura = ler.nextDouble();
        double imc = massa / Math.pow(altura, 2);
        if (imc < 18.5){
            System.out.println("Magreza");
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Saudável");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
        }else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade Grau II (severa)");
        }else if (imc >= 40){
            System.out.println("Obesidade Grau III (móbida)");
        }
        ler.close();

    }
}
