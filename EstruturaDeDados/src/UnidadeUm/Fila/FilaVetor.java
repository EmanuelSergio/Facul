
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

    

}
