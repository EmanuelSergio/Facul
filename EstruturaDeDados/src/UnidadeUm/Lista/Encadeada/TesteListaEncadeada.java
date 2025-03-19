package UnidadeUm.Lista.Encadeada;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        System.out.println(lista.estaVazia());
        
        lista.inserir(5);
        
        System.out.println(lista.estaVazia());

       System.out.println(lista.getPrimeiro().getInfo());

       if(lista.getPrimeiro().getClass().equals(NoLista.class)){
           System.out.println("É do tipo NoLista");
       }

       System.out.println(lista.obterComprimento());
       
       ListaEncadeada<Integer> lista4 = new ListaEncadeada<>();

       lista4.inserir(5);
       lista4.inserir(10);
       lista4.inserir(15);
       lista4.inserir(20);

       //System.out.println(lista4.obterNo(10).getInfo());

       System.out.println(lista4.toString());
       System.out.println(lista4.buscar(20).getInfo());
       System.out.println(lista4.buscar(15).getInfo()+"\n");
       //System.out.println(lista4.buscar(50).getInfo());

        lista4.retirar(15);
        System.out.println(lista4.toString());

        System.out.println(lista4.obterNo(0).getInfo());

        ListaEncadeada<Integer> lista5 = new ListaEncadeada<>();

       System.out.println("lista  5: "+lista5.obterComprimento());

       lista5.inserir(5);
       lista5.inserir(10);
       lista5.inserir(15);
       lista5.inserir(20);

       System.out.println("lista  5: "+lista5.obterComprimento());

    }
}
 