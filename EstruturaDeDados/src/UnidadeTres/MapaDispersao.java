package UnidadeTres;

import UnidadeUm.Lista.Encadeada.ListaEncadeada;

public class MapaDispersao<T>  {

    private ListaEncadeada<NoMapa<T>> [] info;

    public MapaDispersao(int tamanho){
        this.info = new ListaEncadeada[tamanho];
    }
    
    private int calcularHash(int chave){
        return 0;
    }

    public void inserir(int chave, T dado){}

    public void remover(int chave){}

    public T buscar(int chave){
        return null;
    }

    public double calcularFatorCarga(){
        return 0;
    }

}