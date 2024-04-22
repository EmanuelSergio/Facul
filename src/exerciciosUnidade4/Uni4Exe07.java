package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        
        /*O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
        As cartas com peso superior pagam um adicional de R$ 0,45 por 
        cada 20 gramas, ou fração, em que excedem aquele peso. Escreva 
        um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
        Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: **/

        Scanner leia = new Scanner(System.in);
        double valorPagar=0;
        
        System.out.println("Informe o peso da carte em gramas");
        int peso = leia.nextInt();
        
        if(peso>50){
            int pesoExcedido = peso - 50;
            double adicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45 + 0.45 *adicional;

        }else{
            valorPagar = 0.45;
        }


        System.out.println("Custo do selo: $"+valorPagar);

        leia.close();

    }
}
