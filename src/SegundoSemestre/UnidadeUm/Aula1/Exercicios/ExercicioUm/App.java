package SegundoSemestre.UnidadeUm.Aula1.Exercicios.ExercicioUm;

public class App {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();

        pessoa1.peso = 78.0;
        pessoa1.altura = 1.75;

        double imc = pessoa1.calcularImc();
        System.out.printf("IMC: %.2f", imc);



    }

}
