package jogoDaVelha;

import java.util.Scanner;

public class Jogo {
        public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        int coluna, linha;
        String venceu = "";
        int jogadas=0;

        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println();
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
        
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < tabuleiro[i].length - 1) {
                    System.out.print("|"); // Separador de colunas
                }
            }
            System.out.println();
            if (i < tabuleiro.length - 1) {
                System.out.println("---+---+---"); // Separador de linhas
            }
        }


        do {
            
            System.out.println();
            System.out.println("Jogador X:");
            System.out.println("Informe a coluna da jogada");
            coluna = leia.nextInt()-1;
            System.out.println("Informe a linha da jogada");
            linha = leia.nextInt()-1;

            if(tabuleiro[linha][coluna] == ' '){
                tabuleiro[linha][coluna] = 'X';
                jogadas++;
            }

            
            if(tabuleiro[0][0] =='X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X'){
                venceu = "X venceu";
                break;
            }else if(tabuleiro[1][0] =='X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X'){
                venceu = "X venceu";
                break;
            }else if(tabuleiro[2][0] =='X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X'){
                venceu = "X venceu";
                break;
            }else if(tabuleiro[0][0] =='X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X'){
                venceu = "X venceu";
                break;
            }else if(tabuleiro[0][1] =='X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X'){
                venceu = "X venceu";
                break;
            }else if(tabuleiro[0][2] =='X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X'){
                venceu = "X venceu";
                break;
            }else if(tabuleiro[0][0] =='X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X'){
                venceu = "X venceu";
                break;
            }else if(tabuleiro[0][2] =='X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X'){
                venceu = "X venceu";
                break;
            }else if(jogadas == 9){
                venceu="deu velha";
                break;
            }

            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(" " + tabuleiro[i][j] + " ");
                    if (j < tabuleiro[i].length - 1) {
                        System.out.print("|"); // Separador de colunas
                    }
                }
                System.out.println();
                if (i < tabuleiro.length - 1) {
                    System.out.println("---+---+---"); // Separador de linhas
                }
            }

            System.out.println();
            System.out.println("Jogador O:");
            System.out.println("Informe a coluna da jogada");
            coluna = leia.nextInt()-1;
            System.out.println("Informe a linha da jogada");
            linha = leia.nextInt()-1;

            if(tabuleiro[linha][coluna] != 'X'){
                tabuleiro[linha][coluna] = 'O';
                jogadas++;
            }

            if(tabuleiro[0][0] =='O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O'){
                venceu = "O venceu";
                break;
            }else if(tabuleiro[1][0] =='O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O'){
                venceu = "O venceu";
                break;
            }else if(tabuleiro[2][0] =='O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O'){
                venceu = "O venceu";
                break;
            }else if(tabuleiro[0][0] =='O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O'){
                venceu = "O venceu";
                break;
            }else if(tabuleiro[0][1] =='O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O'){
                venceu = "O venceu";
                break;
            }else if(tabuleiro[0][2] =='O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O'){
                venceu = "O venceu";
                break;
            }else if(tabuleiro[0][0] =='O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O'){
                venceu = "O venceu";
                break;
            }else if(tabuleiro[0][2] =='O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O'){
                venceu = "O venceu";
                break;
            }else if(jogadas == 9){
                venceu = "deu velha";
                break;
            }

            
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(" " + tabuleiro[i][j] + " ");
                    if (j < tabuleiro[i].length - 1) {
                        System.out.print("|"); // Separador de colunas
                    }
                }
                System.out.println();
                if (i < tabuleiro.length - 1) {
                    System.out.println("---+---+---"); // Separador de linhas
                }
            }

        } while (true);

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < tabuleiro[i].length - 1) {
                    System.out.print("|"); // Separador de colunas
                }
            }
            System.out.println();
            if (i < tabuleiro.length - 1) {
                System.out.println("---+---+---"); // Separador de linhas
            }
        }

        System.out.println("\n"+venceu);

        leia.close();

    }
}
