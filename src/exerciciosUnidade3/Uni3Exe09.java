package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe09 {

	public static void main(String[] args) {
		//Descreva um programa que calcule o volume de uma lata de óleo. 
		
	  	Scanner leia = new Scanner(System.in);

		System.out.println("Informe a altura da lata");
		double altura=leia.nextDouble();
		System.out.println("informe o raio da lata");
		double raio=leia.nextDouble();
		double volume = 3.14 * (raio*raio) * altura;
		
		System.out.printf("O volume da lata é de: %.2f", volume);
		
			leia.close();

	}

}
