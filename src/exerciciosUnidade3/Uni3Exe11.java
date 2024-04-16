package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe11 {

	public static void main(String[] args) {
		/*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

		°F = (9/5) °C + 32

		 */ 

	  	Scanner leia = new Scanner(System.in);

	  	System.out.println("Informe a temperatura em Cº");
	  	double celsius = leia.nextDouble();
	  	double f = (9/5) * celsius + 32;
	  	
	  	System.out.println("temperatura em Fº " +f);
	  	
	  	leia.close();
		
	}

}
