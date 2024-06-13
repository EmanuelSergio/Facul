package exerciciosUnidade6;

import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[50];
        int quantElem = 0;
        int opcao, entrada, novoValor;
        boolean achou;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.println("Digite sua opção:");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: // incluir
                    if (quantElem >= 50) {
                        System.out.println("Não há espaço para inserir novo valor");
                    }
                    else {
                        System.out.println("Digite o valor a ser inserido");
                        entrada = teclado.nextInt();
                        vetor[quantElem] = entrada;
                        System.out.println("Valor inserido na posição " + quantElem);
                        quantElem++;
                    }
                    break;

                case 2: // pesquisar
                    System.out.println("Digite o valor a ser pesquisado");
                    entrada = teclado.nextInt();
                    achou = false;
                    for (int i = 0; i < quantElem; i++) {
                        if (entrada == vetor[i]) {
                            System.out.println("Valor encontrado na posição " + i);
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("Valor não encontrado.");
                    }
                    break;
                
                case 3: // alterar
                    System.out.println("Digite o valor a ser alterado");
                    entrada = teclado.nextInt();
                    System.out.println("Digite o novo valor");
                    novoValor = teclado.nextInt();
                    achou = false;
                    for (int i = 0; i < quantElem; i++) {
                        if (entrada == vetor[i]) {
                            vetor[i] = novoValor;
                            System.out.println("Valor substituído na posição " + i);
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("Valor não encontrado.");
                    }
                    break;
                
                case 4: // excluir
                    
                    break;
                
                case 5: // mostrar
                    for (int i = 0; i < quantElem; i++) {
                        System.out.println("Valor [" + vetor[i] + "] na posição " + i);
                    }
                    break;
                
                case 6: // ordenar
                    
                    break;
                
                case 7: // inverter
                    
                    break;
                
                case 8: // sair
                    
                    break;
                
                default:
                    break;
            }
        }
        while (opcao != 8);

        System.out.println("Fim do programa");

        for (int i : vetor) {
            System.out.println(i);
        }

        teclado.close();
    }
}
