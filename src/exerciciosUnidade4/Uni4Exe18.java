package exerciciosUnidade4;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        
        /*Uma loja que trabalha com crediário funciona 
        da seguinte maneira: se o pagamento ocorre até o 
        dia do vencimento, o cliente ganha 10% de desconto 
        e é avisado que o pagamento está em dia. Se o pagamento 
        é realizado até cinco dias após o vencimento o cliente 
        perde o desconto, e se o pagamento atrasa mais de cinco 
        dias, é cobrada uma multa de 2% por cada dia de atraso. 
        Faça um algoritmo que leia o dia do vencimento, o dia do 
        pagamento e o valor da prestação e calcule o valor a ser 
        pago pelo cliente, exibindo as devidas mensagens. Suponha 
        que todo vencimento ocorre até o dia dez de cada mês e os 
        clientes nunca deixam para pagar no mês seguinte.

 */

         Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o dia do vencimento (ocorre até o dia 10 de cada mês):");
        int diaVencimento = ler.nextInt();
        System.out.println("Escreva o dia do pagamento:");
        int diaPagamento = ler.nextInt();
        System.out.println("Escreva o valor da prestação:");
        double prestacao = ler.nextDouble();
        double desconto, multa;
        if (diaPagamento >= 1 && diaPagamento <=diaVencimento){
            desconto = prestacao * 0.10;
            prestacao = prestacao - desconto;
            System.out.println("Valor da prestação: R$" + prestacao);
            System.out.println("Pagamento em dia.");
        }else if (diaPagamento > diaVencimento && diaPagamento - diaVencimento <= 5){
            System.out.println("Valor da prestação: R$" + prestacao);
        }else if (diaPagamento > diaVencimento && diaPagamento - diaVencimento > 5){
            multa = ((diaPagamento - diaVencimento - 5) * 0.02) * prestacao;
            prestacao = prestacao + multa;
            System.out.println("Valor da prestação: R$" + prestacao);
        }
        ler.close();

    }
}
