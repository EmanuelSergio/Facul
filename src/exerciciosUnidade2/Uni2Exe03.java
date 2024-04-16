package exerciciosUnidade2;

import java.util.Scanner;

public class Uni2Exe03 {

	public static void main(String[] args) {
		
		//Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
		
			Scanner leia = new Scanner(System.in);
		
			System.out.println("Informe o raio:");
		 	double raio = leia.nextDouble();
	        double pi = 3.14159;
	        double area = pi * raio * raio;

	     
	        System.out.println("A área da circunferência é: " + area);

	        leia.close();
	}

}
