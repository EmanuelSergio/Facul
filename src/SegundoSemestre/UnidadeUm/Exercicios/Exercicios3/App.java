package SegundoSemestre.UnidadeUm.Exercicios.Exercicios3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];

        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < funcionarios.length; i++) {
        funcionarios[i] = new Funcionario();

            System.out.println("Informe o nome do funcionario");
            funcionarios[i].setNome(leia.next());

            System.out.println("Informe o salario do funcionario");
            funcionarios[i].setSalario(leia.nextDouble());

        }

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("nome: " +funcionarios[i].getNome() + ", salario: $" + funcionarios[i].getSalario() + ", IRPF $" + funcionarios[i].calcularIrpf());
        }


    }
}
