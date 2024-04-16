package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe08 {

	public static void main(String[] args) {
		/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
		 * Para isto ela entregou um valor em dólares para o atendente. 
		 * Considerando que o atendente tem a cotação do dólar, 
		 * descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.

		 */ 

	  	Scanner leia = new Scanner(System.in);

	  	System.out.println("informe a quantidade de dolares");
		double dolar = leia.nextDouble();
		double cotacao = 5.06;
	  	double reais = dolar * cotacao;
	  	
	  	System.out.printf("O valor total em reais: R$%.2f" ,reais);
	  	
	  	leia.close();
	}

}
