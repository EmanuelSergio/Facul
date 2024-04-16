package beecrowd;
import java.util.Scanner;

public class beecrowd12 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int quantia = leia.nextInt();
        

        System.out.println(quantia);
        System.out.println((quantia / 100) + " nota(s) de R$ 100,00");
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
        System.out.println((quantia / 1) +" nota(s) de R$ 1,00");

        leia.close();
    

    }
}
