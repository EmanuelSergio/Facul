package UnidadeDois.Arvore.exercicio8;

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

    public int contarNosInternos() {
        if (raiz == null) return 0;
        return contarNosInternos(raiz);
    }
    
    private int contarNosInternos(NoArvore<T> no) {
        if (no == null) return 0;
    
        int count = 0;
        if (no.getPrimeiro() != null) {
            count = 1; 
        }
    
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            count += contarNosInternos(p);
            p = p.getProximo();
        }
    
        return count;
    }

}
