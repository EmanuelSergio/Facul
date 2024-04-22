package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        
        /*Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
        Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

        Scanner leia = new Scanner(System.in);
        System.out.println("informe uma letra:");
        char letra=leia.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("é vogal");
        }else{
            System.out.println("não é vogal");
        }




        leia.close();

    }

}
