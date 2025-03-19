package UnidadeUm.Lista.Encadeada.ListaEncadeadaDupla;

public class TesteListaDupla {

    public static void main(String[] args) {
        
        ListaDupla<Integer> lista = new ListaDupla<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        System.out.println(lista.toString());
    
        System.out.println(lista.buscar(20).getInfo());
        
        System.out.println(lista.buscar(10).getInfo());
        
        lista.retirar(10);

        System.out.println();

        System.out.println(lista.toString());
        lista.exibirOrdemInversa();

        System.out.println("lista 2:");

        ListaDupla<Integer> lista2 = new ListaDupla<>();

        lista2.inserir(5);
        lista2.inserir(10);
        lista2.inserir(15);
        lista2.inserir(20);

        lista2.retirar(10);

        System.out.println();

        System.out.println(lista2.toString());
        lista2.exibirOrdemInversa();

        System.out.println("lista 3:");

        ListaDupla<Integer> lista3 = new ListaDupla<>();

        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);

        lista3.retirar(5);

        System.out.println();

        System.out.println(lista3.toString());
        lista3.exibirOrdemInversa();

        
        System.out.println("lista 4:");

        ListaDupla<Integer> lista4 = new ListaDupla<>();

        
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);

        lista4.exibirOrdemInversa();

        lista4.liberar();

        System.out.println("vazio:");

        System.out.println(lista4.toString());

    }

}
