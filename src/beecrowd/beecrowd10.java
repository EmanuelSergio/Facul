package beecrowd;
import java.util.Scanner;

public class beecrowd10 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double x1,y1,x2,y2;

        x1 = leia.nextDouble();
        y1 = leia.nextDouble();
        x2 = leia.nextDouble();
        y2 = leia.nextDouble();

        double calc = (x2 - x1);
        double calc2 = (y2 - y1);
        
        double tot = Math.sqrt(Math.pow(calc, 2) + Math.pow(calc2, 2));

        System.out.printf("%.4f", tot);


        leia.close();
    }

}
