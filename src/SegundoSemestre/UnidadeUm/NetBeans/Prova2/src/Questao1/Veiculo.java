/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author Emanuel Sergio Girardi
 */
public class Veiculo implements Relatorio{
    
    private String placa;
    private int km;
    private Double precoDiaria;
    private Categoria categoria;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
       
        if(placa == null){
            throw new IllegalArgumentException("placa nao pode ser null");
        }
        
        this.placa = placa;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
       
        if(km < 0){
            throw new IllegalArgumentException("km não pode ser menor que zero");
        }
        
        this.km = km;
    }

    public Double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(Double precoDiaria) {
        
        if(precoDiaria <= 0){
            throw new IllegalArgumentException("valor da diaria não pode ser menor que zero");
        }
        
        this.precoDiaria = precoDiaria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        
        if(categoria == null){
            throw new IllegalArgumentException("Categoria não pode ser nulla");
        }
        
        this.categoria = categoria;
    }

    @Override
    public String imprimir() {
       return "Placa: "+this.placa + " KM: " + this.km + " Preço Diaria: $"+this.precoDiaria + " Categoria: " + this.categoria;
    }
    
    
    
    
}
