package SegundoSemestre.UnidadeUm.Exercicios.Exercicios1.ExercicioDois;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        System.out.println("Informe o peso da pessoa");
        pessoa1.peso = leia.nextDouble();

        System.out.println("Informe a altura da pessoa");
        pessoa1.altura = leia.nextDouble();

        double imc = pessoa1.calcularImc();

        System.out.printf("IMC: %.2f", imc);


        leia.close();

    }

    

}
