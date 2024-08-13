package SegundoSemestre.UnidadeUm.Exercicios.Exercicios2.Questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        System.out.println("Informe o numero da 1ª conta");
        conta1.setNumero(leia.nextLine());

        System.out.println("Informe o titular da 1ª conta");
        conta1.setTitular(leia.nextLine());

        System.out.println("Informe o numero da 2ª conta");
        conta2.setNumero(leia.nextLine());

        System.out.println("Informe o titular da 2ª conta");
        conta2.setTitular(leia.nextLine());


        conta1.depositar(1000.0);
        conta1.depositar(700.0);

        conta2.depositar(5000.0);

        conta2.sacar(3000.0);

        conta2.transferir(conta1, 1800.0);

        System.out.println(conta1.getTitular()+" saldo: R$" + conta1.getSaldo());
        System.out.println(conta2.getTitular()+" saldo: R$" + conta2.getSaldo());

        leia.close();
    }
}
