package exerciciosUnidade5;



public class exer3 {
    public static void main(String[] args) {
        
        //Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:

       
        float conta=0;

        for (float i = 1; i <= 100; i++) {
            conta += 1/i;
        }

        System.out.println("resultado: " +conta);

        
    }
}
