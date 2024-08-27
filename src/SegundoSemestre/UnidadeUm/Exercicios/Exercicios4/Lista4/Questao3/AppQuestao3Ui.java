/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author esgirardi
 */
public class AppQuestao3Ui {

    public static void main(String[] args) {
        
      Retangulo r1 = new Retangulo(Integer.parseInt(JOptionPane.showInputDialog("Informe a altura")), Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento")));
      
      JOptionPane.showMessageDialog(null, "a altura: "+r1.calcularArea());
      JOptionPane.showMessageDialog(null, "o perimetro: "+r1.calcularPerimentro());
      
      
        
    }
    
}
