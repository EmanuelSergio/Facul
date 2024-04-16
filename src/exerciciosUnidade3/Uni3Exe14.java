package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe14 {

	public static void main(String[] args) {
		/*Descreva um programa que a partir da distância percorrida 
		 * e o do tempo gasto por um motorista durante uma viagem de 
		 * final de semana, calcule a velocidade média e a quantidade 
		 * de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.

		 */ 

	  	Scanner leia = new Scanner(System.in);

	  	System.out.println("Informe a distancia em KMs");
	  	int distancia = leia.nextInt();
	  	System.out.println("Informe o tempo gasto em horas");
	  	int tempo = leia.nextInt();
	  	

        double veloMedia = distancia / tempo;

        double combustivelGasto = distancia / 12;

        System.out.println("Velocidade Média: "+veloMedia + " km/h");
        System.out.println("Combustivel gasto: "+combustivelGasto + " Litros");
	  	
	  	
	  	leia.close();
		
	}

}
