package UnidadeUm;

public class TesteListaEstatica {
    
    public static void main(String[] args) {
        
        ListaEstatica lista = new ListaEstatica();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        System.out.println("elemento: "+lista.obterElemento(3));
        //System.out.println("elemento: "+lista.obterElemento(5)); cai no erro de IndexOutOfBoundsException
        
        System.out.println(lista.toString());
        System.out.println(lista.getTamanho());
        System.out.println(lista.buscar(15));
        System.out.println(lista.buscar(30));

        lista.retirar(10);

        System.out.println(lista.toString());


        lista = new ListaEstatica();

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);
        lista.inserir(6);
        lista.inserir(7);
        lista.inserir(8);
        lista.inserir(9);
        lista.inserir(10);
        lista.inserir(11);
        lista.inserir(12);
        lista.inserir(13);
        lista.inserir(14);
        lista.inserir(15);

        System.out.println(lista.toString());
        System.out.println(lista.getTamanho());

        lista.liberar();

        System.out.println(lista.estaVazia());

    }

}
