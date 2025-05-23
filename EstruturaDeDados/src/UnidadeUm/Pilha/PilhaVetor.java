package UnidadeUm.Pilha;

public class PilhaVetor <T> implements Pilha<T> {
    private Object info[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        this.tamanho = 0;
        this.info = new Object[limite];
    }

    @Override
    public void push(T info) {
        if(limite == tamanho){
            throw new PilhaCheiaException("Pilha cheia");
        }
        this.info[tamanho] = info;
        tamanho++;
    }

    @Override  
    public T pop() {
        if(estaVazia()){
            throw new PilhaVaziaException("Pilha vazia");
        }else{
            T elemento = (T) info[tamanho - 1];
            info[tamanho - 1] = null;
            tamanho--;
            return elemento;
        }
    }

    //renavam 01262126298
    // placa RIA2D55
    //FABRICACAO 2021, MODELO 2021
    //FORD RANGER LTDCD4A32C ABERTA/CABINE DUPLA
    //CHASSI 8AFAR23LXMJ226714

    @Override
    public T peek() {
        if(estaVazia()){
            throw new PilhaVaziaException("Pilha vazia");
        }else{
            return (T) info[tamanho - 1];
        }
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        for(int i = 0; i < tamanho; i++) {
            info[i] = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pilha: ");
        for (int i = 0; i < tamanho; i++) {
            sb.append(info[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public void concatenar(PilhaVetor<T> pilha) {
        if (this.tamanho + pilha.tamanho > this.limite) {
            throw new PilhaCheiaException("Pilha cheia");
        }
        for (int i = 0; i < pilha.tamanho; i++) {
            this.push((T) pilha.info[i]);
        }
    }
     

}
