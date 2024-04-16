package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe12 {

	public static void main(String[] args) {
		/*Uma empresa tem para um funcionário os seguintes dados: 
		 * o nome, o número de horas trabalhadas mensais e o número de dependentes. 
		 * A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) 
		 * e R$ 60,00 por dependente (valor para cálculo do salário família) e são 
		 * feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% 
		 * sobre o salário trabalho para o imposto de renda. Descreva um programa que 
		 * informe o nome, o salário bruto e o salário líquido do funcionário.

		 */ 
		
	  	Scanner leia = new Scanner(System.in);
	  	
	  	System.out.println("Informe o nome do funcionario");
	  	String nome = leia.nextLine();
	  	System.out.println("Informe quantas horas foram trabalhadas");
	  	int horas = leia.nextInt();
	  	System.out.println("Informe quantos filhos tem");
	  	int dependentes = leia.nextInt();
	  	
	  	
	  	double salarioBruto = horas * 10;
	  	double salario = salarioBruto;
	  	salario -= salario * 0.085 + salario * 0.05;
	  	salario += dependentes * 60;
	  	
	  	System.out.println("  NOME: "+nome +"\n SALARIO BRUTO: R$" +salarioBruto +"\n SALARIO LIQUIDO: R$"+ salario);
	  	
	  	leia.close();
	}

}
