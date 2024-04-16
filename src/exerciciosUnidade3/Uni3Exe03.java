package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe03 {

	public static void main(String[] args) {
		/*Um motorista deseja abastecer seu tanque de combustível.
		 *Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento 
		 *e exibir quantos litros ele conseguiu colocar no tanque.

		 */ 

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor do litro");
		double valorLitro = leia.nextDouble();
		System.out.println("Informe o valor que foi pago");
		double valorPagamento = leia.nextDouble();
		double litros = valorPagamento / valorLitro;
		
		System.out.printf("Litros: %.2f" ,litros);
		
		
		
		leia.close();
		
	}

}
