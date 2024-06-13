package exerciciosUnidade6;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        
        /**Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

“1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). 
Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
“4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. 
A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
“5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
“6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
“7 – Inverter valores”: desafio (ver abaixo);
“8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa. */

        Scanner leia = new Scanner(System.in);

        int[] valores = new int[5];
        int opcao=0;
        int tamanho = 0;
        boolean find;
        
        do {
            
            System.out.println("Informe o que voce deseja fazer:");
            System.out.println("1 - Incluir valor: \r\n" + //
                                "2 - Pesquisar valor:\r\n" + //
                                "3 - Alterar valor:\r\n" + //
                                "4 - Excluir valor:\r\n" + //
                                "5 - Mostrar valores:\r\n" + //
                                "6 - Ordenar valores:\r\n" + //
                                "7 - Inverter valores:\r\n" + //
                                "8 - Sair do sistema:");

            opcao = leia.nextInt();

           // System.out.println(valores.length);

            switch (opcao) {
                case 1:
                
                        if (tamanho >= valores.length) {
                            System.out.println("vetor cheio\n");
                        }else{
                            System.out.println("Informe o numero:");
                            valores[tamanho] = leia.nextInt();
                            tamanho++;
                            System.out.println("ADICIONADO COM SUCESSO\n");
                        }
            

                    break;
                case 2:

                    System.out.println("informe o valor que deseja pesquisar no vetor:");
                    int pesquisa = leia.nextInt();

                    for (int i = 0; i < tamanho; i++) {
                        if (valores[i] == pesquisa) {
                            System.out.println("O valor "+pesquisa +" está na posicão "+i);
                        }
                    }
                    break;

                case 3:
                    find=false;
                    System.out.println("Informe o número que você quer alterar");
                    for (int i = 0; i < tamanho; i++) {
                        System.out.println("valor: "+valores[i]);
                    }
                        int alterar = leia.nextInt();

                        for (int i = 0; i < valores.length; i++) {
                            if (valores[i] == alterar) {
                                find=true;
                            }
                        }

                    if(find==true){

                        System.out.println("Informe o novo valor:");
                        int novoValor = leia.nextInt();
                        
                        for (int i = 0; i < valores.length; i++) {
                            if (valores[i] == alterar) {
                                valores[i] = novoValor;
                                System.out.println("VALOR ALTERADO");
                            }
                        }
                    }else{
                        System.out.println("Valor inexistente");
                    }

                    break;

                case 4:

                    find=false;
                    System.out.println("Informe o número que você quer excluir");
                    for (int i = 0; i < tamanho; i++) {
                        System.out.println("valor: "+valores[i]);
                    }
                        int excluir = leia.nextInt();

                        for (int i = 0; i < tamanho; i++) {
                            if (valores[i] == excluir) {
                                for (int j = i; j < tamanho - 1; j++) { // Move todos os elementos subsequentes uma posição para trás
                                    valores[j] = valores[j + 1];
                                }
                                tamanho--; // Decrementa o tamanho do vetor
                                find = true;
                                break;
                            }
                        }

                    if(find==true){
                            System.out.println("valor excluido");
                    }else{
                        System.out.println("Valor inexistente");
                    }
                    break;

                case 5://mostrar todos

                    for (int i = 0; i < tamanho; i++) {
                        System.out.println("Valor: "+valores[i]);
                    }
                    
                    break;

                case 6://Ordenar valores em ordem crescente
                    
                    int n = tamanho;
                    
                    for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (valores[j] > valores[j + 1]) {
                            int temp = valores[j];
                            valores[j] = valores[j + 1];
                            valores[j + 1] = temp;
                        }
                    }
                }

                    for (int i = 0; i < tamanho; i++) {
                        System.out.println(valores[i]);
                    }

                    break;

                case 7://inverter posição dos vetores
                int[] valoresInvertidos = new int[tamanho]; // Cria um novo vetor para armazenar os valores invertidos
                for (int i = 0; i < tamanho; i++) { // Percorre o vetor até o tamanho atual
                    valoresInvertidos[i] = valores[tamanho - 1 - i];
                }for (int i = 0; i < tamanho; i++) { // Copia os valores invertidos de volta para o vetor original
                    valores[i] = valoresInvertidos[i];
                }
                    break;   
                default:
                    System.out.println("\nInforme uma opção correta\n");
                    break;
            }


        } while (opcao != 8);

        
        
        leia.close();
    }
}
