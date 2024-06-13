package exerciciosUnidade6; // Declara o pacote onde esta classe está localizada

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class exer10GPT { // Declara a classe principal do programa
    public static void main(String[] args) { // Declara o método main, ponto de entrada do programa
        int[] valores = new int[50]; // Cria um vetor de inteiros com capacidade para 50 elementos
        int tamanho = 0; // Variável para rastrear o número de elementos no vetor
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para ler a entrada do usuário

        while (true) { // Inicia um loop infinito para exibir o menu e processar as opções
            // Exibe o menu de opções
            System.out.println("\nMenu:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) { // Inicia um switch para processar a opção escolhida
                case 1: // Caso para incluir um valor no vetor
                    if (tamanho < 50) { // Verifica se ainda há espaço no vetor
                        System.out.print("Digite o valor para incluir: ");
                        int valor = scanner.nextInt(); // Lê o valor a ser incluído
                        valores[tamanho++] = valor; // Adiciona o valor ao vetor e incrementa o tamanho
                        System.out.println("Valor incluído no vetor.");
                    } else {
                        System.out.println("Vetor cheio. Não foi possível incluir o valor.");
                    }
                    break; // Sai do case 1
                case 2: // Caso para pesquisar um valor no vetor
                    System.out.print("Digite o valor para pesquisar: ");
                    int valorPesquisar = scanner.nextInt(); // Lê o valor a ser pesquisado
                    boolean encontrado = false; // Flag para indicar se o valor foi encontrado
                    for (int i = 0; i < tamanho; i++) { // Percorre o vetor até o tamanho atual
                        if (valores[i] == valorPesquisar) { // Verifica se o valor está presente no vetor
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Valor encontrado no vetor.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break; // Sai do case 2
                case 3: // Caso para alterar um valor no vetor
                    System.out.print("Digite o valor a ser alterado: ");
                    int valorAntigo = scanner.nextInt(); // Lê o valor atual a ser alterado
                    System.out.print("Digite o novo valor: ");
                    int valorNovo = scanner.nextInt(); // Lê o novo valor
                    boolean alterado = false; // Flag para indicar se o valor foi alterado
                    for (int i = 0; i < tamanho; i++) { // Percorre o vetor até o tamanho atual
                        if (valores[i] == valorAntigo) { // Verifica se o valor atual está no vetor
                            valores[i] = valorNovo; // Altera o valor
                            alterado = true;
                            break;
                        }
                    }
                    if (alterado) {
                        System.out.println("Valor alterado com sucesso.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break; // Sai do case 3



                case 4: // Caso para excluir um valor do vetor
                    System.out.print("Digite o valor a ser excluído: ");
                    int valorExcluir = scanner.nextInt(); // Lê o valor a ser excluído
                    boolean excluido = false; // Flag para indicar se o valor foi excluído
                    for (int i = 0; i < tamanho; i++) { // Percorre o vetor até o tamanho atual
                        if (valores[i] == valorExcluir) { // Verifica se o valor está no vetor
                            for (int j = i; j < tamanho - 1; j++) { // Move todos os elementos subsequentes uma posição para trás
                                valores[j] = valores[j + 1];
                            }
                            tamanho--; // Decrementa o tamanho do vetor
                            excluido = true;
                            break;
                        }
                    }
                    if (excluido) {
                        System.out.println("Valor excluído com sucesso.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break; // Sai do case 4











                    
                case 5: // Caso para mostrar os valores do vetor
                    System.out.println("Valores no vetor:");
                    for (int i = 0; i < tamanho; i++) { // Percorre o vetor até o tamanho atual
                        System.out.print(valores[i] + " "); // Exibe cada valor seguido de um espaço
                    }
                    System.out.println(); // Quebra de linha após exibir todos os valores
                    break; // Sai do case 5
                case 6: // Caso para ordenar os valores do vetor
                    for (int i = 0; i < tamanho - 1; i++) { // Percorre o vetor até o penúltimo elemento
                        for (int j = i + 1; j < tamanho; j++) { // Percorre o vetor a partir do elemento seguinte a i
                            if (valores[i] > valores[j]) { // Compara os valores e realiza a troca se necessário
                                int temp = valores[i]; // Variável temporária para a troca
                                valores[i] = valores[j];
                                valores[j] = temp;
                            }
                        }
                    }
                    System.out.println("Valores ordenados em ordem crescente.");
                    break; // Sai do case 6
                case 7: // Caso para inverter os valores do vetor
                    int[] valoresInvertidos = new int[tamanho]; // Cria um novo vetor para armazenar os valores invertidos
                    for (int i = 0; i < tamanho; i++) { // Percorre o vetor até o tamanho atual
                        valoresInvertidos[i] = valores[tamanho - 1 - i]; // Preenche o novo vetor com os valores na ordem inversa
                    }
                    for (int i = 0; i < tamanho; i++) { // Copia os valores invertidos de volta para o vetor original
                        valores[i] = valoresInvertidos[i];
                    }
                    System.out.println("Valores invertidos.");
                    break; // Sai do case 7
                case 8: // Caso para sair do sistema
                    System.out.println("Saindo do sistema...");
                    scanner.close(); // Fecha o scanner para liberar o recurso
                    return; // Sai do método main, encerrando o programa
                default: // Caso para opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
