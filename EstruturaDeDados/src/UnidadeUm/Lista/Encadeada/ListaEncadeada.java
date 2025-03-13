package UnidadeUm.Lista.Encadeada;

public class ListaEncadeada <T>{
    
    private NoLista<T> primeiro;

    ListaEncadeada(){
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor){
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }

    public boolean estaVazia(){
        if(primeiro == null){
            return true;
        }
        return false;
    }

    // public NoLista<T> buscar(T valor){
         
    //     NoLista p = primeiro;

    //     while (p != null) {
    //         if(p.getInfo() == valor){
    //             return p;
    //         }
    //     }
        


    //     return valor;
    // }

}
