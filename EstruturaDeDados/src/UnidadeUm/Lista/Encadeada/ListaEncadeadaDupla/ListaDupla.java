package UnidadeUm.Lista.Encadeada.ListaEncadeadaDupla;

public class ListaDupla <T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }   

    public void inserir(T info){
        NoListaDupla<T> novo = new NoListaDupla<>();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        novo.setAnterior(null);

        if(primeiro != null){
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public NoListaDupla<T> buscar(T info){
        NoListaDupla<T> p = primeiro;

        while(p != null){
            if(p.getInfo().equals(info)){
                return p;
            }else{
                p = p.getProximo();
            }
        }
        return null;
    }

    public void retirar(T info){
        NoListaDupla<T> p = buscar(info);

        if(p != null){
            if(primeiro == p){
                primeiro = p.getProximo();
            }else{
                p.getAnterior().setProximo(p.getProximo());
            }

            if(p.getProximo() != null){
                p.getProximo().setAnterior((p.getAnterior()));
            }
        }
    }

    public void exibirOrdemInversa(){

        if(primeiro == null){
            System.out.println("Lista vazia");
            return;
        }

        NoListaDupla<T> p = primeiro;

        while(p.getProximo() != null){
            p = p.getProximo();
        }

        while(p != null){
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }
    }

    public void liberar(){
        NoListaDupla<T> p = primeiro;

        while(p != null){
            NoListaDupla<T> t = p.getProximo();
            p.setProximo(null);
            p.setAnterior(null);
            p = t;
        }

        primeiro = null;
    }    

    @Override
    public String toString() {
        String lista = "";
        NoListaDupla<T> p = primeiro;
        while(p != null){
            lista += p.getInfo() + ",\n"; 
            p = p.getProximo();
        }
        return lista;
    }

    

}
