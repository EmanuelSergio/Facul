package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe04 {

	public static void main(String[] args) {
		/*Faça um programa para ler três notas de um aluno em uma disciplina 
		 * e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).

		 */ 

		Scanner leia = new Scanner(System.in);
		
		System.out.println("informe as 3 notas do aluno");
		int nota1=leia.nextInt(),
				nota2=leia.nextInt(),
				nota3=leia.nextInt();
		
		double media = ((nota1*5) + (nota2 * 3) + (nota3 * 2)) / 10;
		
		System.out.println("A media do aluno é: "+media);
		
		
		leia.close();
		
	}

}
