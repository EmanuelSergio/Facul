package batalhaNaval;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        char[][] tabuleiro = new char[9][9];

        char linha, coluna;

        Random ri;

        



        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                
                if(i == 0 && j >= 0 && j <= 8){
                    Integer test = j;
                    char caracter = Integer.toString(j).charAt(0);
                    tabuleiro[i][j] = caracter;
                }else{
                    tabuleiro[i][j] = '~';
                }

                if (j == 0 && i >= 0 && i <= 8) {
                    Integer test = i;
                    char caracter = Integer.toString(i).charAt(0);
                    tabuleiro[i][j] = caracter;
                }    
            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                
                    System.out.print(tabuleiro[i][j]+"  ");
                
            }
            System.out.println();
        }

        do {
            System.out.println("Informe a coluna");
            coluna = leia.next().charAt(0);
            System.out.println("Informe a linha");
            linha = leia.next().charAt(0);

            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro.length; j++) {
                    

                        tabuleiro[linha][coluna] = 'X';

                        System.out.print(tabuleiro[i][j]+"  ");
                    
                }
                System.out.println();
            }
        } while (true);



    }
}
