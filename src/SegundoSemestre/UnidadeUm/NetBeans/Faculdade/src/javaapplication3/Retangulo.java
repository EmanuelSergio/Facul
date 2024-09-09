/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author esgirardi
 */
public class Retangulo {
    
    private int altura;
    private int comprimento;

    
    /**
     Contrutor que ja cria o retangulo com os valores
     * @param int altura para setar a altura
     * @param int comprimento para setar o comprimento
     */
    public Retangulo(int altura, int comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
    }
    
    public Retangulo(){
        this.altura = 0;
        this.comprimento = 0;
    }
    
    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("Valor digitado invalido :"+altura);
        }
       
        this.altura = altura;
    }

    /**
     * @return the comprimento
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(int comprimento) {
       
         if(comprimento <= 0){
            throw new IllegalArgumentException("Valor digitado invalido :"+comprimento);
        }
        this.comprimento = comprimento;
    }
    
    /**
     @return retorna o valor da area
     */
    public int calcularArea(){
        return altura * comprimento;
    }
    
    /**
     @return retorna o valor do comprimento*/
    public int calcularPerimentro(){
        return 2*(altura+comprimento);
    }
    
    
    
    
    
}
