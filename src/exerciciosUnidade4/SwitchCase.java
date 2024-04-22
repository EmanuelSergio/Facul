package exerciciosUnidade4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        char letra = 'a';
        Scanner leia = new Scanner(System.in);

        letra = leia.next().charAt(0);


        switch (letra) {
            case 'a':
                System.out.println("letra a");
                break;
            
            default:
                break;
        }

        leia.close();
    }
}
