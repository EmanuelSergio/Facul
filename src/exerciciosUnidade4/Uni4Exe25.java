package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        
        /*Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. 
        O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:
        Escolha uma opção:
        1 - Soma de dois números.
        2 - Diferença entre dois números.
        3 - Produto entre dois números.
        4 - Divisão entre dois números (o denominador não pode ser zero). */

        Scanner ler = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Selecione uma opção: ");
        System.out.println("+ Soma de dois números;");
        System.out.println("- Diferença entre dois números;");
        System.out.println("* Produto entre dois números;");
        System.out.println("/ Divisão entre dois números (o denominador não pode ser zero!!!);");
        System.out.print("Opção: ");
        char opcao = ler.next().trim().charAt(0);
        System.out.print("Escreva o número 1: ");
        numero1 = ler.nextInt();
        System.out.print("Escreva o número 2: ");
        numero2 = ler.nextInt();
        switch (opcao){
            case '+':
            System.out.println("Soma: " + (numero1 + numero2));
            break;
            case '-':
            if (numero1 > numero2){
                System.out.println("Diferença: " + (numero1 - numero2));
            }else if (numero2 > numero1){
                System.out.println("Diferença: " + (numero2 - numero1));
            }
            break;
            case '*':
            System.out.println("Produto: " + (numero1 * numero2));
            break;
            case '/':
            if (numero2 > 0){
            System.out.println("Divisão: " + (numero1 / numero2)); 
            }else {
                System.out.println("O denominador não pode ser zero");
            }
            break;
            default:
            System.out.println("Opção incorreta!!");
        }
        ler.close();


    }
}
