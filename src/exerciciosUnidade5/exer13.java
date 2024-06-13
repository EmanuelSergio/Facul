package exerciciosUnidade5;

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        
        /*Um motorista acaba de voltar de um feriado prolongado. 
        Antes de sair de viagem e imediatamente após retornar, o 
        motorista encheu o tanque do veículo e registrou as medidas 
        do odômetro. Em cada parada feita durante a viagem, foi registrado 
        o valor do odômetro e a quantidade de combustível comprado para 
        reabastecer o veículo (suponha que o tanque foi enchido a cada parada). 
        Descreva um algoritmo que leia o número total de reabastecimentos feitos 
        e os dados registrados relativos à compra de combustível. Calcule e escreva:

        a quilometragem obtida por litro de combustível em cada parada;
        a quilometragem média obtida por litro de combustível em toda a viagem.*/

        Scanner leia = new Scanner(System.in);

        double litrosabastecidos=0;
        double kmsRodados = 0;

        System.out.println("Informe a quantidade de paradas (reabastecimento)");
        int qntReabastecimento = leia.nextInt();

        for (int i = 0; i < qntReabastecimento; i++) {
            System.out.println("Informe a quantidade de litros abastecidos na"+i+"ª");
            litrosabastecidos += leia.nextDouble();

            System.out.println("Informe a quantidade de kms rodados na "+i+"ª");
            kmsRodados += leia.nextDouble();

            System.out.println("A média da km dessa ultima distancia: "+kmsRodados/litrosabastecidos);

        }

        
        System.out.println("a média da viagem foi de: "+kmsRodados/litrosabastecidos);


        leia.close();
    }   
}
