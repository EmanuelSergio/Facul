package exerciciosUnidade5;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        //Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

        Scanner leia = new Scanner(System.in);

        Double mediaAltura=0.0;

        for (int i = 0; i < 20; i++) {
            System.out.printf("Informe a altura da %dª pessoa\n", i+1);
            double peso = leia.nextDouble();

            mediaAltura += peso;
            

        }

        System.err.printf("a média de altura foi de %.2f", mediaAltura/20);

        leia.close();
    }

}
