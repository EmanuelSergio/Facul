/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeArquivosEPersistenciaBinarios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author emanu
 */
public class ColocandoValoresNoArquivo {
    
    private static final String FILE_PATH_TESTE = "D:\\ArquivosJava\\teste.bin";
    static File arquivo = new File(FILE_PATH_TESTE);
 
    public static void main(String[] args) {
        
        
        try {
            FileOutputStream fos = new FileOutputStream(arquivo);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeDouble(2332);
            dos.writeBoolean(true);
            dos.writeUTF("vasco da gamaa");
            dos.close();
    
        } catch (Exception e) {
        }
       
        
    }
    
    
     
     
}
