package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        
        /*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
        Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.
 */

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a idade de Marquinhos");
        int marquinhos = leia.nextInt();

        System.out.println("Informe a idade de zezinho");
        int zezinho = leia.nextInt();

        System.out.println("Informe a idade de luluzinha");
        int luluzinha = leia.nextInt();

        if(marquinhos < zezinho && marquinhos < luluzinha){
            System.out.println("marquinhos é o caçula");
        }else if(zezinho < marquinhos && zezinho < luluzinha){
            System.out.println("zezinho é o caçula");
        }else{
            System.out.println("luluzinha é a caçula");
        }


        leia.close();
    }
}
