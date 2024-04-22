package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        
        /*Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado

 */

         Scanner ler = new Scanner(System.in);
        System.out.print("X = ");
        int x = ler.nextInt();
        System.out.print("Y = ");
        int y = ler.nextInt();
        if (x == 0 && y == 0){
            System.out.println("Quadrante 0");
        }else if (x > 0 && y > 0){
            System.out.println("Quadrante 1");
        }else if (x > 0 && y < 0){
            System.out.println("Quadrante 2");
        }else if (x < 0 && y < 0){
            System.out.println("Quadrante 3");
        }else if (x < 0 && y > 0){
            System.out.println("Quadrante 4");
        }
        ler.close();

    }
}
