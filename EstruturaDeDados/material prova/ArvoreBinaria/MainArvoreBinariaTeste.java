package ArvoreBinaria;

public class MainArvoreBinariaTeste {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> inteiros = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
        no5.setEsquerda(no7);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
        inteiros.setRaiz(no1);

        // Testes, pode trocar o check por print para ver como retorna o resultado
        ArvoreBinaria<Integer> localInteiros = new ArvoreBinaria<>();
        check(localInteiros.estaVazia(), "Test 1");

        NoArvoreBinaria<Integer> noTest2 = new NoArvoreBinaria<>(5);
        localInteiros.setRaiz(noTest2);
        check(!localInteiros.estaVazia(), "Test 2");

        check(inteiros.toString().equals("<1<2<><4<><>>><3<5<7<><>><>><6<><>>>>"), "Test 3");

        check(inteiros.pertence(1), "Test 4");
        check(inteiros.pertence(3), "Test 5");
        check(inteiros.pertence(6), "Test 6");
        check(!inteiros.pertence(10), "Test 7");

        check(inteiros.contarNos() == 7, "Test 8");
        check(inteiros.contarNosInternos(inteiros.getRaiz().getDireita()) == 2, "Test Prova");

        check(inteiros.altura() == 3, "Test Altura");
        check(inteiros.estaBalanceada(), "Test Esta Balanceada");

        check(inteiros.percursoPreOrdem().trim().equals("1 2 4 3 5 7 6"), "Test Pré-Ordem");
        check(inteiros.percursoInOrdem().trim().equals("2 4 1 7 5 3 6"), "Test In-Ordem");
        check(inteiros.percursoPosOrdem().trim().equals("4 2 7 5 6 3 1"), "Test Pós-Ordem");

        ArvoreBinaria<Integer> arvoreTrue = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2, null, n3);
        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1, null, n2);
        arvoreTrue.setRaiz(n1);
        check(arvoreTrue.isDegenerada(), "Test Degenerada TRUE");

        ArvoreBinaria<Integer> arvoreFalse = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> m4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> m5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> m2 = new NoArvoreBinaria<>(2, m4, null);
        NoArvoreBinaria<Integer> m3 = new NoArvoreBinaria<>(3, null, m5);
        NoArvoreBinaria<Integer> m1 = new NoArvoreBinaria<>(1, m2, m3);
        arvoreFalse.setRaiz(m1);
        check(!arvoreFalse.isDegenerada(), "Test Degenerada FALSE");

        System.out.println("✅ Todos os testes passaram!");
    }

    private static void check(boolean condition, String testName) {
        if (!condition) {
            System.err.println("❌ Falha no " + testName);
        }
    }
}
