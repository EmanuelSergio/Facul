package beecrowd;
import java.util.Scanner;

public class beecrowd13 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int segundos = leia.nextInt();
        int horas = segundos / 3600;
        segundos -= horas*3600;
        int minutos = segundos / 60;
        segundos -= minutos * 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);

        leia.close();

    }
}
