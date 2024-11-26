/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3.view;

/**
 *
 * @author esgirardi
 */
public class NotaInvalidaException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Erro na nota";
    }
   
    
    
}
