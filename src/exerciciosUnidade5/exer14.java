package exerciciosUnidade5;

import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        
        /*Um comerciante deseja fazer um levantamento do lucro das 20 
        mercadorias que comercializa. Para cada mercadoria ele tem o nome, 
        o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), 
onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total. */

        Scanner leia = new Scanner(System.in);

        int produtos = 20;
        float pc=0,pv=0;
        float lucro=0;
        float totvenda=0;
        float totcompra=0;

        for (int i = 0; i < produtos; i++) {
            System.out.println("Informe o preço de custo do "+(i+1)+"º produto");
            pc = leia.nextFloat();
            totcompra += pc;

            System.out.println("Informe o preço de venda do "+(i+1)+"º produto");
            pv = leia.nextFloat();

            totvenda += pv;

            lucro  = (pv - pc) / pc * 100;
            System.out.printf("o lucro é de %.2f%% no %dº item\n", lucro, i+1);



        }

        System.out.println("total das compras de produto $"+totcompra);
        System.out.println("total das vendas $"+totvenda);
        System.out.println("lucro total $"+(totvenda-totcompra));
        double lucroTotal  = (totvenda - totcompra) / totcompra * 100;
        System.out.printf("%.2f%% de lucro",lucroTotal);


        leia.close();

    }
}
