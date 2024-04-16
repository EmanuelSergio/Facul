package beecrowd;
import java.util.Scanner;

public class beecrowd11 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        
        int km;
        
        km = leia.nextInt();
        
        
        int tempoMinuto = km * 2;

        System.out.println(tempoMinuto+" minutos");



        leia.close();
    }

}
