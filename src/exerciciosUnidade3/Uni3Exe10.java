package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe10 {

	public static void main(String[] args) {
		/*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
*/ 

	  	Scanner leia = new Scanner(System.in);

	  	System.out.println("Informe o valor do primeiro cateto");
	  	double cateto1 = leia.nextDouble();
	  	
	  	System.out.println("Informe o valor do segundo cateto");
	  	double cateto2 = leia.nextDouble();
	  	
	  	double hipotenusa;
		
	  	 hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

	  	System.out.println("Comprimento da hipotenusa: " +hipotenusa);
	  	
	  	leia.close();
	}

}
