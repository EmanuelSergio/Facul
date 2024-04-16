package beecrowd;
import java.util.Scanner;

public class beecrowd14 {


/*Leia um valor de ponto flutuante com duas casas decimais.
 Este valor representa um valor monetário. A seguir, calcule o menor número de notas e 
 moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. 
 As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal. */

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        double quantia = leia.nextDouble();
        

        System.out.println("NOTAS:");
        System.out.println((int)(quantia / 100) + " nota(s) de R$ 100,00");
        quantia = quantia % 100;
        System.out.println((quantia / 50) +" nota(s) de R$ 50,00");
        quantia = quantia % 50;
        System.out.println((quantia / 20) +" nota(s) de R$ 20,00");
        quantia = quantia % 20;
        System.out.println((quantia / 10) +" nota(s) de R$ 10,00");
        quantia = quantia % 10;
        System.out.println((quantia / 5) +" nota(s) de R$ 5,00");
        quantia = quantia % 5;
        System.out.println((quantia / 2) +" nota(s) de R$ 2,00");
        quantia = quantia % 2;
        
        quantia = quantia*100;

        System.out.println("MOEDAS:");
        System.out.println((int)(quantia / 100) +" moeda(s) de R$ 1.00");
        quantia = quantia % 100;
        System.out.println((quantia / 50) +" moeda(s) de R$ 0.50");
        quantia = quantia % 50;
        System.out.println((quantia / 25) +" moeda(s) de R$ 0.25");
        quantia = quantia % 25;
        System.out.println((quantia / 10) +" moeda(s) de R$ 0.10");
        quantia = quantia % 10;
        System.out.println((quantia / 5) +" moeda(s) de R$ 0.05");
        quantia = quantia % 5;
        System.out.println((quantia / 1) +" moeda(s) de R$ 0.01");


        leia.close();

    }

}
