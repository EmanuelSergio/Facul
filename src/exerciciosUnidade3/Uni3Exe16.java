package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe16 {

	public static void main(String[] args) {
		/*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. 
		 * Considerando que alguém está pagando uma compra, faça um programa 
		 * que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. 
		 * Escreva também o número de cada tipo de nota a ser fornecido como troco. 
		 * Suponha que o sistema monetário não utilize centavos.

		 */ 

        Scanner leia = new Scanner(System.in);

        int valorPodut, valorPago;
        
        
   
        System.out.println("Digite o valor do produto pago ");
        valorPodut = leia.nextInt();

        System.out.println("Digite o valor total pago: ");
        valorPago = leia.nextInt();
        
        int troco=valorPago - valorPodut, resto, saida;
        int cem, dez, uni;
        cem = troco / 100;
        
        resto = troco % 100;

        dez = resto/10;

        uni = resto % 10;

        saida = cem + dez + uni;
        System.out.println("Quantidade de notas no troco: "+saida);


        
        
        
        leia.close();
	}

}
