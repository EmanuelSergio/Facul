package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe05 {

	public static void main(String[] args) {
		/*Uma granja possui um controle automatizado de cada frango da sua produção. 
		 * No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar 
		 * o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o 
		 * anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

		 */ 

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de frangos na granja");
		int frangos = leia.nextInt();
		double anelChip = 4.00, anelAlimento = 3.5;
		
		double custo = ((anelAlimento * 2) * frangos) + frangos * anelChip;
		
		System.out.println("custo com os frangos: R$" +custo);
		
		
		leia.close();
	}

}
