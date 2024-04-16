package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe13 {

	public static void main(String[] args) {
		/*Numa loja de materiais de construção, um azulejo 
		 * estampado custa R$ 12,50. Faça um programa para ler o comprimento e 
		 * altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. 
		 * Considere que um metro quadrado é formado por 9 azulejos.

		 */

	  	Scanner leia = new Scanner(System.in);
	  	
	  	double altura, comprimento, mQuadrados;
	  	
	  	System.out.println("Informe a altura");
	  	altura = leia.nextDouble();
	  	
	  	System.out.println("Informe a largura");
	  	comprimento = leia.nextDouble();
	  	
	  	mQuadrados = comprimento*altura;
	  	int quantidade = (int)mQuadrados * 9;
	  	double tot = quantidade * 12.5;
	  	
	  	System.out.println("valor a se pagar: R$" +tot);
	  	
	  	
	  	leia.close();

		
	}

}
