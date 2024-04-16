package exerciciosUnidade2;

import java.util.Scanner;

public class Uni2Exe07 {

	public static void main(String[] args) {
		/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total 
		 * de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 
		 *15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

		 */ 

		 	Scanner leia = new Scanner(System.in);

	        String nome;
	        double salario, vendas;

	        nome = leia.next();
	        salario = leia.nextDouble();
	        vendas = leia.nextDouble();

	        double sub = salario + (vendas*0.15);

	        System.out.printf(nome+" RECEBEU O VALOR TOTAL DE = R$ %.2f\n", sub);
		
		
	        leia.close();
	}

}
