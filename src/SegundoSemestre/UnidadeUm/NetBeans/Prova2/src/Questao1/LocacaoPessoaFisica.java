/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author Emanuel Sergio Girardi
 */
public class LocacaoPessoaFisica extends Locacao{
    
    private Veiculo veiculo;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    @Override
    public Double getValorTotal() { 
        if(getQuantidadeDias() >= 5){
            Double diariaComDesconto = veiculo.getPrecoDiaria() - (veiculo.getPrecoDiaria() * 0.05);
            return getQuantidadeDias() * diariaComDesconto;
            
        }else{
            return getQuantidadeDias() * veiculo.getPrecoDiaria();
        }
    }

    @Override
    public String imprimir() {
        return "Valor Total: $"+getValorTotal()+" Veiculo: "+veiculo.imprimir();
    }
    
}
