/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author emanu
 */
public class Imovel {
 
    private String endereco;
    private int area;
    private Finalidade finalidade;
    private Bairro bairro;

    public Imovel() {
    }

    public Imovel(String endereco, int area, Finalidade finalidade, Bairro bairro) {
        this.endereco = endereco;
        this.area = area;
        this.finalidade = finalidade;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
       
        if (area <= 0) {
            throw new IllegalArgumentException("area nao pode ser negativa ou menor a zero");
        }
        
        this.area = area;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    public Double calcularIptu(){
        
        if(getBairro() == null){
            throw new IllegalArgumentException("o bairro deve ser definido");
        }
        
        if(getBairro().getCoeficienteIptu() <= 0){
             throw new IllegalArgumentException("o coeficiente do bairro deve ser definido");
        }
        
        if(getFinalidade() == null){
            throw new IllegalArgumentException("A finalidade deve ser definida");
        }
        
        Double tot = 0.0;
        
        if(finalidade == Finalidade.RESIDENCIAL){
            tot = area * 1.0;
        }else if(finalidade == Finalidade.COMERCIAL){
            if(area <= 100){
                tot = 500.0;
            }else if(area > 100 && area <= 400){
                tot = 1000.0;
            }else if(area > 400){
                tot = area * 2.55;
            }
        }else if(finalidade == Finalidade.INDUSTRIAL){
            if(area <= 2000 ){
                tot = 1000.0;
            }else{
                tot = area * 0.55;
            }
        }
        
        tot = tot * getBairro().getCoeficienteIptu();
        BigDecimal bd = new BigDecimal(tot);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    
    
}
