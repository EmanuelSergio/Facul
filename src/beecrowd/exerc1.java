package beecrowd;
import java.util.Scanner;
public class exerc1 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double a, b, c;
        
        
        a = leia.nextDouble();
        b = leia.nextDouble();
        c = leia.nextDouble();

        double triandoRetangulo = (a * c) / 2;


        double circulo = (c*c) * Math.PI;

        double trapezio = (a+b)*c;

        double quadrado = b*b;

        double retangulo = a*b;

        System.out.printf("TRIANGULO: %3f\nCIRCULO: %3f\nTRAPEZIO: %3f\nQUADRADO: %3f\nRETANGULO: %3f\n", triandoRetangulo, 
          circulo,
           trapezio,
            quadrado,
             retangulo);

             leia.close();



    }

}
