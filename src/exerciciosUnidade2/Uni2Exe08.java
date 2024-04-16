package exerciciosUnidade2;

import java.util.Scanner;

public class Uni2Exe08 {

	@SuppressWarnings("unused") //anotação para parar de reclamar por nao usar a variavel int
	public static void main(String[] args) {
		/*Neste problema, deve-se ler o código de uma peça 1, 
		 * o número de peças 1, o valor unitário de cada peça 1, 
		 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

		 */ 

		 	Scanner leia = new Scanner(System.in);
	        
	        int cod1, cod2, quant1,quant2;
	        double valor1, valor2;
	        
	        cod1 = leia.nextInt();
	        quant1 = leia.nextInt();
	        valor1 = leia.nextDouble();

	        cod2 = leia.nextInt();
	        quant2 = leia.nextInt();
	        valor2 = leia.nextDouble();

	        double soma = (quant1 * valor1) + (quant2 * valor2);

	        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
	        
	        leia.close();
		
		
	}

}
