package ArvoreBinaria;

public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return getRaiz() == null;
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        }

        return no.getInfo().equals(info) || pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private String arvorePre(NoArvoreBinaria<T> no) {

        if (no == null) {
            return "<>";
        }

        return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";

    }

    public String toString() {
        return arvorePre(raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {

        if (no == null) {
            return 0;
        }

        return contarNos(no.getEsquerda()) + contarNos(no.getDireita()) + 1;
    }

    public int contarNosInternos(NoArvoreBinaria<T> sa){
        if (sa == null) {
            return 0;
        }

        if(sa.getEsquerda() == null && sa.getDireita() == null){
            return 0;
        }

        return contarNosInternos(sa.getEsquerda()) + contarNosInternos(sa.getDireita()) + 1;
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    public String percursoPreOrdem() {
        return percursoPreOrdem(raiz).trim();
    }
    
    private String percursoPreOrdem(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "";
        }
    
        return no.getInfo() + " " +
               percursoPreOrdem(no.getEsquerda()) +
               percursoPreOrdem(no.getDireita());
    }
    public String percursoInOrdem() {
        return percursoInOrdem(raiz).trim();
    }
    
    private String percursoInOrdem(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "";
        }
    
        return percursoInOrdem(no.getEsquerda()) +
               no.getInfo() + " " +
               percursoInOrdem(no.getDireita());
    }

    public String percursoPosOrdem() {
        return percursoPosOrdem(raiz).trim();
    }
    
    private String percursoPosOrdem(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "";
        }
    
        return percursoPosOrdem(no.getEsquerda()) +
               percursoPosOrdem(no.getDireita()) +
               no.getInfo() + " ";
    }

    public void inserir(T info) {
        raiz = inserir(raiz, info);
    }
    
    private NoArvoreBinaria<T> inserir(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return new NoArvoreBinaria<>(info);
        }
    
        if (((Comparable<T>) info).compareTo(no.getInfo()) < 0) {
            no.setEsquerda(inserir(no.getEsquerda(), info));
        } else {
            no.setDireita(inserir(no.getDireita(), info));
        }
    
        return no;
    }
    
    public int altura() {
        return altura(raiz);
    }
    
    private int altura(NoArvoreBinaria<T> no) {
        if (no == null) {
            return -1;
        }
    
        int altEsq = altura(no.getEsquerda());
        int altDir = altura(no.getDireita());
    
        return Math.max(altEsq, altDir) + 1;
    }

    public boolean estaBalanceada() {
        return estaBalanceada(raiz);
    }
    
    private boolean estaBalanceada(NoArvoreBinaria<T> no) {
        if (no == null) {
            return true;
        }
    
        int altEsq = altura(no.getEsquerda());
        int altDir = altura(no.getDireita());
    
        int dif = Math.abs(altEsq - altDir);
    
        return dif <= 1 &&
               estaBalanceada(no.getEsquerda()) &&
               estaBalanceada(no.getDireita());
    }

    public int buscaLinear(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public int buscaLinearOrdenada(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            } else if (valor < vetor[i]) {
                break;
            }
        }
        return -1;
    }

    
    public int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;
    
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
    
            if (vetor[meio] == valor) {
                return meio;
            } else if (valor < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
    
        return -1;
    }
    
    public void ordenarPorBolha(int[] vetor) {
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
    
            if (!trocou) break; // otimização
        }
    }

    public void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, pivo - 1);
            quickSort(vetor, pivo + 1, fim);
        }
    }
    
    private int particionar(int[] vetor, int inicio, int fim) {
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

    public void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }
    
    private void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] esquerda = new int[meio - inicio + 1];
        int[] direita = new int[fim - meio];
    
        for (int i = 0; i < esquerda.length; i++)
            esquerda[i] = vetor[inicio + i];
    
        for (int i = 0; i < direita.length; i++)
            direita[i] = vetor[meio + 1 + i];
    
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

    public boolean isDegenerada() {
        return isDegenerada(raiz);
    }
    
    private boolean isDegenerada(NoArvoreBinaria<T> no) {
        if (no == null) return true;
    
        if (no.getEsquerda() != null && no.getDireita() != null) {
            return false;
        }
    
        if (no.getEsquerda() != null) {
            return isDegenerada(no.getEsquerda());
        }
    
        if (no.getDireita() != null) {
            return isDegenerada(no.getDireita());
        }
    
        return true;
    }
    
    
}
