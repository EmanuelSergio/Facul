package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe06 {

	public static void main(String[] args) {
		/*Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
		 * Escreva um programa que leia o peso do prato montado pelo cliente 
		 * (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.

		 */ 
		Scanner leia = new Scanner(System.in);

		
		double precoKg = 25.00;
		System.out.println("informe o peso do prato em kg\nExemplo: 1,750");
		double pesoPrato = leia.nextDouble();
		double tot = (pesoPrato - 0.750) * precoKg;
		
		System.out.println("Valor total: R$"+ tot);
		
		
		leia.close();
	}

}
