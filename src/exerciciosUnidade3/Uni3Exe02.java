package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe02 {

	public static void main(String[] args) {
		/*Uma loja de calçados está concedendo 12% de desconto nos produtos. 
		 * Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e
		 *  quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. 
		 *  Como resultado, o programa deverá exibir as seguintes mensagens:

		O valor do desconto é de R$ xxx
		O preço do par de sapatos com desconto é R$ xxx*/
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o valor do sapato: ");
		double precoSapato = leia.nextDouble();
		double desconto = precoSapato * 0.12;
		double tot = precoSapato - desconto;
		
		System.out.println("O valor do desconto é de R$" +desconto +"\nO preço do par de sapatos com desconto é R$" +tot);
		
		
		leia.close();

	}

}
