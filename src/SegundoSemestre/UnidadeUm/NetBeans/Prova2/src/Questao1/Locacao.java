/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author Emanuek Sergio Girardi
 */
public abstract class Locacao implements Relatorio{
    
    private int quantidadeDias;
    private Pessoa pessoa;

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        
        if(quantidadeDias <= 0){
            throw new IllegalArgumentException("quantidade de dias nao pode ser menor ou igual a zero");
        }
        
        this.quantidadeDias = quantidadeDias;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        if(pessoa == null){
            throw new IllegalArgumentException("pessoa não pode ser null");
        }
        
        this.pessoa = pessoa;
    }

    public abstract Double getValorTotal();
   
   
}
