package UnidadeTres;

public class NoMapa<T> {
    
    private int chave;
    private T valor;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }
    
    public void setValor(T valor) {
        this.valor = valor;
    }

    public boolean equals(Object o){
        return true;
    }

}
