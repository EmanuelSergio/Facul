package exerciciosUnidade2;

import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        
        //Leia 2 valores inteiros e imprima sua soma.

    	Scanner leia = new Scanner(System.in);
        
    	System.out.println("informe os valores de a e depois b");
    	int a=leia.nextInt(),b=leia.nextInt();
        
    	System.out.println("soma: "+ (a+b));


    	leia.close();
    }
}
