package SegundoSemestre.UnidadeUm.Aula1;

public class Matilha {

    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "gustavo lima";
        cachorro1.cor = "branco";
        cachorro1.raca = "pastor alemão";
        cachorro1.peso = 13.0;

        Cachorro cachorro2 = new Cachorro();

        cachorro2.nome = "pedro lima";
        cachorro2.cor = "preto";
        cachorro2.raca = "Hotvailerkkkkk";
        cachorro2.peso = 15.0;

        cachorro1.abanarRabo();
        cachorro1.latir();
        cachorro1.pegarCoisa("osso");

        Cachorro cachorro3;
        cachorro3 = cachorro1;

        cachorro3.abanarRabo();

        cachorro3 = cachorro2;

        cachorro3.cor = "preto claro";

        System.out.println("\ngustavo lima tem a cor: "+ cachorro1.cor);
        System.out.println("pedro lima tem a cor: "+ cachorro2.cor);
        System.out.println("cachorro 3 tem a cor: "+ cachorro3.cor);

        cachorro3 = new Cachorro();

        cachorro3.nome = "marco faria";
        cachorro3.cor = "cinza preto";
        cachorro3.raca = "buldoguesksksk";
        cachorro3.peso = 20.0;

        


    }


}
