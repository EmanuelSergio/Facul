package UnidadeUm.Lista.Linear;

public class TesteListaLinearGenerica {
    
    public static void main(String[] args) {
        
        ListaLinearEstaticaGenerica<Integer> lista = new ListaLinearEstaticaGenerica<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.inverter();

        System.out.println(lista.toString());


        ListaLinearEstaticaGenerica<Integer> lista2 = new ListaLinearEstaticaGenerica<>();

        lista2.inserir(5);
        lista2.inserir(10);
        lista2.inserir(15);
        lista2.inserir(20);
        lista2.inserir(25);

        lista2.inverter();

        System.out.println(lista2.toString());



    }

}
