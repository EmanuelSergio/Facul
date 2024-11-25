/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeArquivosEPersistenciaBinarios;

import com.sun.source.tree.TryTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author emanu
 */
public class AbrindoArquivo {
    
    private static final String FILE_PATH = "D:\\ArquivosJava\\dados.dat";
   
    static File arquivo = new File("D:\\ArquivosJava\\dados.dat");
    
     
     
    
   
     
    public static void main(String[] args) {
        
        
        
        
        try {
            FileOutputStream fos = new FileOutputStream(arquivo, true);
            System.out.println(fos);
            fos.write(79);
            fos.write(105);
            fos.write(105);
            fos.write(105);
            fos.write(105);
            fos.write(105);
            fos.write(105);
            fos.write(105);
            
            fos.close();
            
            
            FileInputStream fis = new FileInputStream(arquivo);
            while (true) {                
                int dado = fis.read();
                if(dado != -1){
                    System.out.println(dado);
                }else{
                    break;
                }
            }
            
                    
        } catch (Exception e) {
            System.out.println("nao foi possivel achar o arquivo");
        }
        
        
        
        
        System.out.println(arquivo.getName());

        
    }
    
}
