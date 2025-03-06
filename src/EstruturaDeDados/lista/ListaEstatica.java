package EstruturaDeDados.lista;

public class ListaEstatica {

    private int[] info;
    private int tamanho;
    
    public ListaEstatica(){
        this.tamanho = 0;
        info = new int[10];
    }

    private void redimensionar(){
        int[] novo = new int[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(int valor){
        if(info.length == tamanho){
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(int valor){
        
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor){
        int lugar = buscar(valor);
        if(lugar != -1){
            for(int i = lugar; i < tamanho -1; i++){
                info[i] = info[i+1];
            }
            tamanho--;
        }
    }

    public void liberar(){
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao){
        if(posicao < 0 || posicao >= tamanho){
            throw new IndexOutOfBoundsException();
        }
        return info[posicao];
    }

    public boolean estaVazia(){
        if(tamanho == 0){
            return true;
        }else{
            return false;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String dados = "";
        for (int i = 0; i < tamanho; i++) {
            dados += "indice: "+ i+ " valor: " + info[i] + ",\n";
        }
        return dados;
    }

}
