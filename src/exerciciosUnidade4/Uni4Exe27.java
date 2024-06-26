package exerciciosUnidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        
        /*As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para 
baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se 
para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar 
durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e 35 
minutos pagará por duas horas. Entretanto, se a pessoa permaneceu menos de 30 minutos, 
também pagará por uma hora. Os horários de chegada e partida são apresentados na forma 
de pares de inteiros, representando horas e minutos. Por exemplo, o par 12 50 representará 
meio dia e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de partida 
e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver 
validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior 
a 24 horas, e sempre chegam e saem no mesmo dia.

 */

            Scanner ler = new Scanner(System.in);
        int horaEntrada, horaSaida, totalHoras = 0, minutoEntrada, minutosSaída, minutoTotal;
        double tarifa;
        System.out.print("Horário de entrada: ");
        horaEntrada = ler.nextInt();
        System.out.print("Minutos de entrada: ");
        minutoEntrada = ler.nextInt();
        System.out.print("Horário de saída: ");
        horaSaida = ler.nextInt();
        System.out.print("Minutos de saída:");
        minutosSaída = ler.nextInt();
        totalHoras = 0;
        
        if (horaEntrada > horaSaida){
            totalHoras = 24 - horaEntrada + horaSaida;
        }else if (horaEntrada < horaSaida){
            totalHoras = horaSaida - horaEntrada;
        }
        
        minutoTotal = Math.abs(minutoEntrada - minutosSaída);
        if (minutoTotal >= 30){
            totalHoras = totalHoras + 1;
        }else if (minutoEntrada < minutosSaída){
            totalHoras = minutosSaída + minutoEntrada;
        }
        
        switch (totalHoras){
            case 0:
            case 1:
            tarifa = 5.00;
            break;
            case 2:
            tarifa = 10.00;
            break;
            case 3:
            tarifa = 17.50;
            break;
            case 4:
            tarifa = 25.00;
            break;
            case 5:
            tarifa = 35.00;
            break;
            default:
            tarifa = 35 + (totalHoras - 5) * 10;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Para a sua felicidade, a tarifa vai custar: R$" + df.format(tarifa));
        
        ler.close();



    }
}
