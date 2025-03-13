package UnidadeUm.Lista.Linear;

public class ListaLinearEstaticaGenerica <T>{
     
    private Object[] info;
    private int tamanho;
    
    /*ListaEstatica(): construtor da classe.
     Deve criar um vetor para guardar os dados e estabelecer que a lista está
     vazia;
     */

    public ListaLinearEstaticaGenerica(){
        this.tamanho = 0;
        info = new Object[10];
    }

    /*redimensionar(): este método deverá aumentar a capacidade de armazenamento da lista, criando um novo
vetor com capacidade de armazenamento expandida em 10 novas posições e copiar os dados do vetor original
para o novo vetor criado. Por fim, o método redimensionar() deverá assumir que o novo vetor info é o vetor
recentemente criado;
 */

    private void redimensionar(){
        Object[] novo = new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    /*inserir(int): Deve inserir o número fornecido como argumento no vetor encapsulado pela lista. Caso o vetor
encapsulado info não tenha mais posições livres, deve invocar o método privado redimensionar(), para
expandir a capacidade de armazenamento da lista; */

    public void inserir(T valor){
        if(info.length == tamanho){
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    /*exibir(): Deve exibir o conteúdo armazenado na lista, apresentando na tela o valor do primeiro número até o
último número armazenado, nesta ordem;
 */

    public void exibir(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    /*buscar(int): Deve procurar se há um número igual ao fornecido como argumento. Caso seja encontrado, este
método deverá retornar a posição do número no vetor (índice no vetor). Se não for localizado, deverá retornar -1; */

    public int buscar(T valor){
        
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    /*retirar(int): Deve retirar da lista o dado fornecido como argumento, deslocando todos os elementos das
posições seguintes, uma posição para esquerda; */

    public void retirar(T valor){
        int lugar = buscar(valor);
        if(lugar != -1){
            for(int i = lugar; i < tamanho -1; i++){
                info[i] = info[i+1];
            }
            tamanho--;
        }
    }

    /*liberar(): Deverá limpar a estrutura de dados de forma que o vetor info seja redimensionado novamente para
que tenha capacidade de armazenar apenas 10 elementos;
 */

    public void liberar(){
        info = new Object[10];
        tamanho = 0;
    }

    /*obterElemento(int): este método deverá retornar o número armazenado na posição fornecida como
argumento. Caso o valor do parâmetro corresponda a uma posição inexistente ou não ocupada, este método
deverá lançar a exceção IndexOutOfBoundsException. */

    @SuppressWarnings("unchecked")
    public T obterElemento(int posicao){
        if(posicao < 0 || posicao >= tamanho){
            throw new IndexOutOfBoundsException();
        }
        return (T) info[posicao];
    }

    /*estaVazia(): este método deverá retornar true se a lista não possuir nenhum dado armazenado e false se a
lista estiver armazenando algum dado;
 */

    public boolean estaVazia(){
        if(tamanho == 0){
            return true;
        }else{
            return false;
        }
    }

    /*getTamanho(): método getter da variável tamanho; */

    public int getTamanho() {
        return tamanho;
    }

    /*toString(): deve retornar os valores armazenados na lista, desde o primeiro até o último, separando-os por
vírgula */

    @Override
    public String toString() {
        String dados = "";
        for (int i = 0; i < tamanho; i++) {
            dados += "indice: "+ i+ " valor: " + info[i] + ",\n";
        }
        return dados;
    }

    public void inverter(){
        Object[] novo = new Object[info.length];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[tamanho - i - 1];
        }
       info = novo;
    }
}
