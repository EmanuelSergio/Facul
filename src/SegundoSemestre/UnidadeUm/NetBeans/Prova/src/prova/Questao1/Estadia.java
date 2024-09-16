/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova.Questao1;

/**
 *
 * @author Emanuel Sergio Girardi
 */

/**
  classe que cria e calcula a estadia do usuario
 */
public class Estadia {

    private Periodo periodo;
    private int quantidadeDias;

    /**
     *
     */
    public Estadia() {
    }

    
    public Estadia(Periodo periodo, int quantidadeDias) {
        this.periodo = periodo;
        this.quantidadeDias = quantidadeDias;
    }
    
    /**
     * metodo que pega o periodo
     * @return retorna o Periodo
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * metodo que seta o periodo
     * @param periodo para setar o periodo
     */
    public void setPeriodo(Periodo periodo) {
        if(periodo == null){
            throw new IllegalArgumentException("Período não pode ser vazio");
        }
        this.periodo = periodo;
    }

    /**
     * metodo que pega a quantidade de dias
     * @return retorna a quantidade de dias
     */
    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    /**
     * metodo que seta a quantidade de dias
     * @param quantidadeDias para setar a quantidade de dias
     * podem lançar exceções de valor de dias invalidos ou quantidade de dias em altas temporadas
     */
    public void setQuantidadeDias(int quantidadeDias) {
        if(quantidadeDias <= 0){
            throw new IllegalArgumentException("Insira um valor valido");
        }else if(this.periodo == Periodo.ALTA_TEMPORADA && quantidadeDias < 5){
            throw new IllegalArgumentException("Em altas temporadas o tempo minimo de estadia é de 5 dias");
        }
        
        this.quantidadeDias = quantidadeDias;
    }

    /**
     * metodo que calcular o preço a ser pago
     @return retorna o valor a ser pago conforme a temporada e quantidade de dias
     */
    
    public float precoPagar(){
        float tot=0;
        
        if(this.periodo == Periodo.BAIXA_TEMPORADA){
             tot = this.quantidadeDias * (150 - (150*0.3f));
        }else if(this.periodo == Periodo.ALTA_TEMPORADA){
             tot = this.quantidadeDias * ((150*0.2f) + 150);
        }
        
        if(this.periodo == Periodo.MEDIA_TEMPORADA){
            tot = this.quantidadeDias * 150;
        }
        
        if(this.quantidadeDias == 1){
            tot += tot*0.05f;
        }
        
        if(this.periodo == Periodo.ALTA_TEMPORADA && this.quantidadeDias > 7){
            tot -= tot*0.02f;
        }
        return tot;
    } 
    
}
