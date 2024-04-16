package exerciciosUnidade3;

import java.util.Scanner;

public class Uni3Exe15 {

	public static void main(String[] args) {
		/*Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
		X centena(s)  Y dezena(s) K unidade(s)  
		Exemplo, se for submetido o número 384, o programa deverá exibir:
		3 centena(s)  8 dezena(s) 4 unidade(s)  

		 */ 
		
		int entradaTotal, resto, cem, dez, uni;
        String saidaFormatada;
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número de até 3 digitos: ");
        entradaTotal = leia.nextInt();

        cem = entradaTotal / 100;
        resto = entradaTotal % 100;
        dez = resto/10;
        uni = resto % 10;
        saidaFormatada = cem + " centena(s) " + dez + " dezena(s) " + uni + " unidade(s) ";

        System.out.println("resultado: "+saidaFormatada);

        leia.close();


	}

}
