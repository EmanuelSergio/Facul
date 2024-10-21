/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;

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
                tot = 2000.0;
            }else{
                tot = area * 0.55;
            }
        }
        
        return tot;
    }
    
    
    
}
