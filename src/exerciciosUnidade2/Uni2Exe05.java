package exerciciosUnidade2;

import java.util.Scanner;

public class Uni2Exe05 {

	public static void main(String[] args) {
		// Leia quatro valores inteiros A, B, C e D. A seguir, 
		//calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

		 	Scanner leia = new Scanner(System.in);

	        int a,b,c,d;

	        a = leia.nextInt();
	        b = leia.nextInt();
	        c = leia.nextInt();
	        d = leia.nextInt();

	        int diferenca = (a * b - c * d);

	        System.out.println("DIFERENCA = " +diferenca);
	        
	        leia.close();
		
		
	}

}
