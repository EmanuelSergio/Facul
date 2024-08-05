package SegundoSemestre.UnidadeUm.Aula1;

public class Cachorro {

    String nome;
    String raca;
    String cor;
    double peso;

    public Cachorro(){

    }

    public void latir(){
        System.out.println(nome+": Au au");
    }

    public void abanarRabo(){
        System.out.println(nome +" abanou o rabo");
    }

    public void pegarCoisa(String objeto){
        System.out.println(nome+" esta pegando "+objeto);
    }



}
