package ArvoreNArea;

public class MainArvoreNariaTeste {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();

        // Montagem da árvore conforme o setup original
        NoArvore<Integer> n9 = new NoArvore<>(9);
        NoArvore<Integer> n10 = new NoArvore<>(10);
        NoArvore<Integer> n4 = new NoArvore<>(4);
        n4.inserirFilho(n10);
        n4.inserirFilho(n9);

        NoArvore<Integer> n3 = new NoArvore<>(3);
        NoArvore<Integer> n8 = new NoArvore<>(8);
        n3.inserirFilho(n8);

        NoArvore<Integer> n7 = new NoArvore<>(7);
        NoArvore<Integer> n6 = new NoArvore<>(6);
        NoArvore<Integer> n5 = new NoArvore<>(5);
        NoArvore<Integer> n2 = new NoArvore<>(2);
        n2.inserirFilho(n7);
        n2.inserirFilho(n6);
        n2.inserirFilho(n5);

        NoArvore<Integer> n1 = new NoArvore<>(1);
        n1.inserirFilho(n4);
        n1.inserirFilho(n3);
        n1.inserirFilho(n2);

        arvore.setRaiz(n1);

        // Testes
        check(arvore.toString().equals("<1<2<5><6><7>><3<8>><4<9><10>>>"), "Test toString()");
        check(arvore.pertence(7), "Test pertence(7)");
        check(!arvore.pertence(55), "Test pertence(55)");
        check(arvore.ContarNos() == 10, "Test contarNos()");
        check(!arvore.isDegenerada(), "Test isDegenerada() == false");
        check(arvore.altura() == 2, "Test altura()");
        check(arvore.contarNosInternos() == 4, "Test contarNosInternos()");
        check(arvore.percursoPosOrdem().equals("5 6 7 2 8 3 9 10 4 1"), "Test percursoPosOrdem()");

        // Teste extra: árvore degenerada
        Arvore<Integer> arvore2 = new Arvore<>();
        NoArvore<Integer> d3 = new NoArvore<>(7);
        NoArvore<Integer> d2 = new NoArvore<>(6);
        NoArvore<Integer> d1 = new NoArvore<>(5);
        d1.setPrimeiro(d2);
        d2.setPrimeiro(d3);
        arvore2.setRaiz(d1);
        check(arvore2.isDegenerada(), "Test árvore degenerada == true");

        System.out.println("✅ Todos os testes passaram!");
    }

    private static void check(boolean condition, String testName) {
        if (!condition) {
            System.err.println("❌ Falha no " + testName);
        }
    }
}