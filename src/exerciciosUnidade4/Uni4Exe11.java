package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        
        /*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
        escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, 
        APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem 
        a mesma idade e o outro diferente dos demais, e apenas irmãos se 
        todas as idades forem diferentes.

 */

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o ano de nascimento do primeiro irmão:");
        int anoIrmao1 = leia.nextInt();
        
        System.out.println("Digite o ano de nascimento do segundo irmão:");
        int anoIrmao2 = leia.nextInt();
        
        System.out.println("Digite o ano de nascimento do terceiro irmão:");
        int anoIrmao3 = leia.nextInt();
        
        if (anoIrmao1 == anoIrmao2 && anoIrmao2 == anoIrmao3) {
            System.out.println("Eles são trigêmeos.");
        } else if ((anoIrmao1 == anoIrmao2 && anoIrmao2 != anoIrmao3) || 
                   (anoIrmao1 == anoIrmao3 && anoIrmao1 != anoIrmao2) || 
                   (anoIrmao2 == anoIrmao3 && anoIrmao2 != anoIrmao1)) {
            System.out.println("Eles são gêmeos.");
        } else {
            System.out.println("Eles são apenas irmãos.");
        }

        leia.close();

    }
}
