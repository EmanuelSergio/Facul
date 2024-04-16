package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe07 {

	public static void main(String[] args) {
		/*Uma fábrica de refrigerantes vende seu produto em três formatos: 
		 * lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante 
		 * compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.

		 */ 
		
		  	Scanner leia = new Scanner(System.in);
		  	
	        double pequena = 350, media = 600,grande = 2000;
	        
	        int pequenaQ = 0,mediaQ = 0, grandeQ = 0;

	        System.out.println("digite a quantidade de garrafas de 350 Ml");
	        pequenaQ = leia.nextInt();

	        System.out.println("digite a quantidade de garrafas de 600 Ml");
	        mediaQ = leia.nextInt();

	        System.out.println("digite a quantidade de garrafas de 2l");
	        grandeQ = leia.nextInt();
	        
	        double tot = ((double)(((pequena*pequenaQ)+(media*mediaQ)+(grande*grandeQ))/1000)); 
	        System.out.printf("quantidade final em litros : %.2f L",tot);

	        leia.close();


	}

}
