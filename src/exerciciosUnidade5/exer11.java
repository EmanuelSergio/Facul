package exerciciosUnidade5;



public class exer11 {
    public static void main(String[] args) {
        
        /*Uma máquina de biscoito está com problemas. 
        Quando ligada, após 1 hora ela quebra 1 biscoito, 
        na segunda hora ela quebra 3 biscoitos, na hora 
        seguinte ela quebra 3 vezes a quantidade de biscoitos 
        quebrados na hora anterior, e assim por diante. Faça um 
        algoritmo que calcule quantos biscoitos são quebrados no 
        final de cada dia (a máquina opera 16 horas por dia). */

       

        int horasTrabalhadas = 16;//tempo de trabalho
        int biscoitosQuebrados = 0;//variavel com tot de biscoitos
        int quebradosNaHora = 1;//inicia com 1 pois na primeira hora ele quebra um

        for (int hora = 0; hora < horasTrabalhadas; hora++) {
        
            biscoitosQuebrados += quebradosNaHora; // adiciona no tot a quantia quebrada no determinado horario
            quebradosNaHora *= 3; // multiplica do horario seguinte
          
        }        

       System.out.println(biscoitosQuebrados);

        
        
    }
}
