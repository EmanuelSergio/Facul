package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        
        /*Escreva um algoritmo que obtém do usuário 3 
        valores inteiros representando as três cartas 
        deste usuário em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3; 7 = 7; 
        11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a 
        palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" 
        (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). 
        Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada. */

         Scanner ler = new Scanner(System.in);
        System.out.println("Carta 1:");
        int carta1 = ler.nextInt();
        System.out.println("Carta 2:");
        int carta2 = ler.nextInt();
        System.out.println("Carta 3:");
        int carta3 = ler.nextInt();
        int qtCartasBoas = 0;
        if (carta1 == 1 || carta1 == 2 || carta1 == 3){
            qtCartasBoas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3){
            qtCartasBoas++;
        }
        if ((carta3 == 1) || (carta3 == 2) || (carta3 == 3)){
            qtCartasBoas++;
        }
        if(qtCartasBoas == 1){
            System.out.println("Truco");
        }else if (qtCartasBoas == 2){
            System.out.println("Seis");
        }else if (qtCartasBoas == 3){
            System.out.println("Nove");
        }
        ler.close();


    }
}
