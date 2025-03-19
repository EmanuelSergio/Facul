package UnidadeUm.Lista.Encadeada;

public class ListaEncadeada <T> {
    
    private NoLista<T> primeiro;

    ListaEncadeada(){
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro()  {
        return primeiro;
    }

    public void inserir(T valor){
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }

    public boolean estaVazia(){
        return primeiro == null;
    } 

    public NoLista<T> buscar(T valor){
         
        NoLista<T> p = primeiro;

        while (p != null) {
            if(p.getInfo().equals(valor)){
                return p;
            }else{ 
                p = p.getProximo();
            }
        }
        return null;
    }

    public void retirar(T valor){
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;

        // procura nó que contém dado a ser removido,
        // guardando o anterior
        while(p != null && !p.getInfo().equals(valor)){
            anterior = p;
            p = p.getProximo();
        }

        // se achou o nó que contém o dado a ser removido

        if(p != null){
            if(p.equals(primeiro)){
                this.primeiro = p.getProximo();
            }else{
                anterior.setProximo(p.getProximo());
            }
        }
        
    }

    public int obterComprimento(){
        NoLista<T> p = primeiro;
        int cont = 0;
        while(p != null){
            cont++;
            p = p.getProximo();
        }
        return cont;
    }

    public NoLista<T> obterNo(int index){
        if (index < 0 || index >= obterComprimento()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + obterComprimento());
        }
        int posicao = 0;
        NoLista<T> p = primeiro;
        while(p != null && posicao != index){
            p = p.getProximo();
            posicao++;
        }
        return p;
    }

    @Override
    public String toString() {
        String toString = "";
        NoLista<T> p = primeiro;

        while(p != null){
            toString += p.getInfo() + ",\n";
            p = p.getProximo();
        }
        return toString;
    }

    public ListaEncadeada<T> criarInvertida(){
        ListaEncadeada<T> invertida = new ListaEncadeada<>();
        NoLista<T> p = primeiro;
        while(p != null){
            invertida.inserir(p.getInfo());
            p = p.getProximo();
        }
        return invertida;
    }
}
