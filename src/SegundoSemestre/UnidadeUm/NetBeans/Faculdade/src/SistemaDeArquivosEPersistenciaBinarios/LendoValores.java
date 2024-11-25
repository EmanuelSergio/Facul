/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeArquivosEPersistenciaBinarios;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author emanu
 */
public class LendoValores {
    
      
    private static final String FILE_PATH_TESTE = "D:\\ArquivosJava\\maisDados.bin";
    static File arquivo = new File(FILE_PATH_TESTE);
    
    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream(arquivo);
            DataInputStream dis = new DataInputStream(fis);
            
            String frase = dis.readUTF();
            System.out.println("frase: "+frase);
            
            dis.close();
            
            
        } catch (Exception e) {
        }
        
    }
    
}
