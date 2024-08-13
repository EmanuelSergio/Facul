package SegundoSemestre.UnidadeUm.Exercicios.Exercicios1.ExercicioQuatro;

public class Pessoa {

    double altura;
    double peso;
    String nome;

    double calcularImc(){
        return peso/(altura*altura);
    }

}
