package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        
        /*Elabore um algoritmo para exibir o 
        valor de reajuste que um funcionário 
        receberá no seu salário. A empresa irá 
        conceder 5% de reajuste para o funcionário 
        que for admitido há até de 12 meses. Para funcionário 
        admitido entre 13 e 48 meses, irá conceder 7% de reajuste. 
        O seu algoritmo deve solicitar ao usuário que digite a 
        quantidade de meses que o funcionário foi admitido.

 */

  Scanner ler = new Scanner(System.in);
        System.out.println("Adicione a quantidade de meses de admição: ");
        int meses = ler.nextInt();
        if (meses <= 12){
            System.out.println("5% de reajuste");
        }else if (meses > 12 && meses <= 48){
            System.out.println("7% de reajuste");
        }
        ler.close();



    }
}
