package exerciciosUnidade2;

import java.util.Scanner;

public class Uni2Exe04 {

	public static void main(String[] args) {
		// Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota 
		//A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.
		
		  Scanner leia = new Scanner(System.in);
	        
	        double a,b;
	        
	        a = leia.nextDouble(); 
	        b = leia.nextDouble();

	        a = a * 3.5;
	        b = b * 7.5;

	        double soma = (a + b) / 11;

	        System.out.printf("MEDIA = %.2f\n",soma);
	 

		
		leia.close();
		
		
	}

}
