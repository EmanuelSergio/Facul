package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        
        /*Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

        se opção = 1, escreva os 3 valores em ordem crescente
        se opção = 2, escreva os 3 valores em ordem decrescente
        se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

 */

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o primero valor");
        int num1 = leia.nextInt();

        System.out.println("Informe o segundo valor");
        int num2 = leia.nextInt();

        System.out.println("Informe o terceiro valor");
        int num3 = leia.nextInt();


        System.out.println("informe a opção desejada:\na) escreva os 3 valores em ordem crescente\nb) escreva os 3 valores em ordem decrescente\nc) escreva os 3 valores de forma que o maior valor fique no meio");
        char opcao = leia.next().charAt(0);

        System.err.println(opcao);
       

        /* 
        maior = num1;
        if(num2 > maior){
            maior = num2;
        }

        if(num3> maior){
            maior = num3;
        }

        menor = num1;
        if(num2 < menor){
            menor = num2;
        }

        if(num3 < menor){
            menor = num3;
        }

        if(num1 != maior && num1 != menor){
            medio = num1;
        }else if(num2 != maior && num2 != menor){
            medio = num2;
        }else {
            medio = num3;
        }


        System.out.println("o maior numero é: "+maior +"\no medio numero é: "+medio + "\no menor numero é "+menor);

        */


        int maiorNum = num1;
        if(num2 > maiorNum){
            maiorNum = num2;
        }
        
        if(num3 > maiorNum){
            maiorNum = num3;
        }

        int menorNumero = num1;
        if(num2 < menorNumero){
            menorNumero = num2;
        }

        if(num3 < menorNumero){
            menorNumero = num3;
        }

        int medioNumero;
        if(num1 != maiorNum && num1 != menorNumero){
            medioNumero = num1;
        }else if(num2 != maiorNum && num2 != menorNumero){
            medioNumero = num2;
        }else{
            medioNumero = num3;
        }


        System.out.println("o maior numero é: "+maiorNum +"\no medio numero é: "+medioNumero + "\no menor numero é "+menorNumero);













        /*
         Scanner ler = new Scanner(System.in);
        
        int valor1, valor2, valor3, n1 = 0, n2 = 0, n3 = 0;
        
        System.out.print("Escreva o valor 1: " );
        valor1 = ler.nextInt();
        System.out.print("Escreva o valor 2: ");
        valor2 = ler.nextInt();
        System.out.print("Escreva o valor 3: ");
        valor3 = ler.nextInt();
        System.out.println("Lista de opções:");
        System.out.println("1. Ordem crescente;");
        System.out.println("2. Ordem decrescente;");
        System.out.println("3. O número maior aparece no meio;");
        System.out.print("Escreva a sua opção: ");
        int opcao = ler.nextInt();
       
        if (valor1 > valor2 && valor1 > valor3){
            n3 = valor1;
        }else if (valor1 < valor2 && valor1 > valor3 || valor1 < valor3 && valor1 > valor2){
            n2 = valor1;
        }else if (valor1 < valor2 && valor1 < valor3){
            n1 = valor1;
        }
        
        if (valor2 > valor1 && valor2 > valor3){
            n3 = valor2;
        }else if (valor2 > valor1 && valor2 < valor3 || valor2 < valor1 && valor2 > valor3){
            n2 = valor2;
        }else if (valor2 < valor1 && valor2 < valor3){
            n1 = valor2;
        }
        
        if (valor3 > valor1 && valor3 > valor2){
            n3 = valor3;
        }else if (valor3 > valor1 && valor3 < valor2 || valor3 < valor1 && valor3 > valor2){
            n2 = valor3;
        }else if (valor3 < valor1 && valor3 < valor2){
            n1 = valor3;
        }
        
        switch (opcao){
            case 1:
            System.out.println(n1 + " " + n2 + " " + n3);
            break;
            case 2:
            System.out.println(n3 + " " + n2 + " " + n1);
            break;
            case 3:
            System.out.println(n1 + " " + n3 + " " + n2);
            break;
        }
        ler.close();


 */

        leia.close();

    }
}
