package exerciciosUnidade4;

import java.util.Scanner;

/**
 * Uni4Exe01
 */
public class Uni4Exe01 {

    
public static void main(String[] args) {
    
    /** 
     * A jornada de trabalho semanal de um funcionário é de 40 horas. 
     * O funcionário que trabalhar mais de 40 horas receberá hora extra, 
     * cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
     * Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
     * o valor por hora e escreva o salário total do funcionário, que deverá 
     * ser acrescido das horas extras, 
     * caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
    */

    Scanner leia = new Scanner(System.in);

    int horas;
    double valor, salarioFinal,salarioExtra;

    System.out.println("Informe a quantidade de horas trabalhadas");
    horas = leia.nextInt();

    System.out.println("Informe o valor da hora");
    valor = leia.nextInt();

    
    if(horas>160){
        
        salarioFinal = valor * horas;
        int horasExtra = horas - 160; //ele deve trabalhar obrigatoriamente 160 hrs, oq passar é extra
        salarioExtra = (horasExtra) * (valor/2); //o valor da hr extra é 50% do salario
        salarioFinal = salarioFinal + salarioExtra;
        
        
    }else{
        salarioFinal = valor * horas;
    }


    System.out.println(salarioFinal);

    leia.close();

}

}