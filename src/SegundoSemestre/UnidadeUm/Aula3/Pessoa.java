package SegundoSemestre.UnidadeUm.Aula3;

public class Pessoa {

    double altura;
    double peso;
    String nome;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularImc(){
        return peso/(altura*altura);
    }

}
