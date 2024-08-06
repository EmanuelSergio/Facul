package SegundoSemestre.UnidadeUm.Aula1.Exercicios.ExercicioQuatro;

public class Pessoa {

    double altura;
    double peso;
    String nome;

    double calcularImc(){
        return peso/(altura*altura);
    }

}
