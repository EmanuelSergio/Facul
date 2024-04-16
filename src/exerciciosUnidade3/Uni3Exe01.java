package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe01 {

	public static void main(String[] args) {
		// Uma imobiliária vende apenas terrenos retangulares. 
		//Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.

		
		Scanner leia = new Scanner(System.in);

		System.out.println("Informes os lados:");
		double ladoA=leia.nextDouble(),
				ladoB=leia.nextDouble();
		
		System.out.println("A AREA DO RETANGULO É: " + (ladoA*ladoB));
		
		leia.close();
				


	}

}
