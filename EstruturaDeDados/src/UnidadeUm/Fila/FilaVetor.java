package UnidadeUm.Fila;


import UnidadeUm.Fila.Fila;


public class FilaVetor <T> implements Fila<T>{
    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
        this.info = new Object[limite];
    }

    @Override
    public void inserir(T valor) {
        if(limite == tamanho){
            throw new FilaCheiaException("Fila cheia");
        }
        int posicao = (inicio + tamanho) % limite; // Calcula a posição circular
        info[posicao] = valor;
        tamanho++;
    }
 
    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if(estaVazia()){
            throw new RuntimeException("Fila vazia");
        }else{
            return (T) info[inicio];
        }   
    }

    @Override
    public T retirar() {
        if(estaVazia()){
            throw new FilaVaziaException("Fila vazia");
        }else{
            T elemento = (T) info[inicio];
            info[inicio] = null;
            inicio = (inicio + 1) % limite;
            tamanho--;
            return elemento;
        }

        
    }

    @Override
    public void liberar() {
        for(int i = 0; i < tamanho; i++) {
            info[i] = null;
        }
        inicio = 0;
        tamanho = 0;
    }
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        // Calculate the needed size for the new queue
        int novoTamanho = this.tamanho + f2.tamanho;
        
        // Create the new queue with enough capacity
        FilaVetor<T> f3 = new FilaVetor<>(novoTamanho);
        
        // Copy elements from the current queue (f1)
        for (int i = 0; i < this.tamanho; i++) {
            int posicao = (this.inicio + i) % this.limite;
            f3.inserir((T) this.info[posicao]);
        }
        
        // Copy elements from f2
        for (int i = 0; i < f2.tamanho; i++) {
            int posicao = (f2.inicio + i) % f2.limite;
            f3.inserir((T) f2.info[posicao]);
        }
        
        return f3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int posicao = (inicio + i) % limite;
            sb.append(info[posicao]).append(" ");
        }
        return sb.toString();
    }

    public int getLimite() {
        return limite;
    }

    
    

}
