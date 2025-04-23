package ArvoreNArea;

public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        setRaiz(null);
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo().equals(info)) {
            return true;
        }

        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {
            if (pertence(p, info)) {
                return true;
            }
            p = p.getProximo();
        }

        return false;
    }

    public boolean pertence(T info) {
        if (getRaiz() == null) {
            return false;
        }

        return pertence(getRaiz(), info);
    };

    private String obterRepresentacaoTextual(NoArvore<T> no) {
        String s = "<";

        s += no.getInfo();

        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {
            s += obterRepresentacaoTextual(p);
            p = p.getProximo();
        }

        s += ">";

        return s;
    }

    public String toString() {
        if (getRaiz() == null) {
            return "";
        }

        return obterRepresentacaoTextual(getRaiz());
    }

    private int ContarNos(NoArvore<T> no) {
        int i = 1;

        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {
            i += ContarNos(p);
            p = p.getProximo();
        }

        return i;
    }

    public boolean isDegenerada() {
        if (getRaiz() == null) {
            return false;
        }

        NoArvore<T> p = getRaiz();

        while (p != null) {
            if (p.getProximo() != null) {
                return false;
            }

            p = p.getPrimeiro();
        }

        return true;

    }

    public int ContarNos() {
        if (getRaiz() == null) {
            return 0;
        }

        return ContarNos(getRaiz());
    }

    public int altura() {
        if (raiz == null) return -1;
        return altura(raiz);
    }
    
    private int altura(NoArvore<T> no) {
        if (no == null) return -1;
    
        int maxAlturaFilho = -1;
        NoArvore<T> p = no.getPrimeiro();
    
        while (p != null) {
            int altFilho = altura(p);
            if (altFilho > maxAlturaFilho) {
                maxAlturaFilho = altFilho;
            }
            p = p.getProximo();
        }
    
        return maxAlturaFilho + 1;
    }

    public static void ordenarPorBolha(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        for (int i = n - 1; i > 0; i--) {
            trocou = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, pivo - 1);
            quickSort(vetor, pivo + 1, fim);
        }
    }

    public static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int a = inicio + 1;
        int b = fim;
        while (true) {
            while (a <= fim && vetor[a] < pivo) a++;
            while (b >= inicio && vetor[b] > pivo) b--;
            if (a >= b) break;
            int temp = vetor[a];
            vetor[a] = vetor[b];
            vetor[b] = temp;
        }
        vetor[inicio] = vetor[b];
        vetor[b] = pivo;
        return b;
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] esquerda = new int[meio - inicio + 1];
        int[] direita = new int[fim - meio];

        for (int i = 0; i < esquerda.length; i++) esquerda[i] = vetor[inicio + i];
        for (int i = 0; i < direita.length; i++) direita[i] = vetor[meio + 1 + i];

        int i = 0, j = 0, k = inicio;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                vetor[k++] = esquerda[i++];
            } else {
                vetor[k++] = direita[j++];
            }
        }

        while (i < esquerda.length) vetor[k++] = esquerda[i++];
        while (j < direita.length) vetor[k++] = direita[j++];
    }

    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0, fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) return meio;
            else if (valor < vetor[meio]) fim = meio - 1;
            else inicio = meio + 1;
        }
        return -1;
    }

    public String percursoPosOrdem() {
        if (raiz == null) return "";
        return percursoPosOrdem(raiz).trim();
    }
    
    private String percursoPosOrdem(NoArvore<T> no) {
        String resultado = "";
    
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            resultado += percursoPosOrdem(p);
            p = p.getProximo();
        }
    
        resultado += no.getInfo() + " ";
    
        return resultado;
    }
    
    public int contarNosInternos() {
        if (raiz == null) return 0;
        return contarNosInternos(raiz);
    }
    
    private int contarNosInternos(NoArvore<T> no) {
        if (no == null) return 0;
    
        int count = 0;
        if (no.getPrimeiro() != null) {
            count = 1; // nó interno
        }
    
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            count += contarNosInternos(p);
            p = p.getProximo();
        }
    
        return count;
    }
    
    public boolean estaVazia() {
        return raiz == null;
    }
}
