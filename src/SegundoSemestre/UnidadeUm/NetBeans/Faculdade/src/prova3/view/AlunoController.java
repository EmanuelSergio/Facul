package prova3.view;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emanuel Sergio Girardi
 */
public class AlunoController {
    
    public static int calcularMedia(List<Integer> notas){
        
        double acumulador = 0;
        
        for (Integer nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new NotaInvalidaException();
            }
            
           acumulador += nota;
        }
        return (int) (acumulador / notas.size());
    }
    
    public void salvarAlunos(List<Aluno> alunos){
        
    }
    
    //String caminho = "C:\\teste";
    
    public static void salvarAlunos(String caminho,List<Aluno> alunos) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(caminho))) {
            writer.write("Nome,Media");
            writer.newLine();
            for (Aluno aluno : alunos) {
                writer.write(String.join(",", aluno.getNome())); 
                Integer media = calcularMedia(aluno.getNotas());
                String mediaString = String.valueOf(media);
               writer.write(String.join(",",","+ mediaString)); 
                writer.newLine(); 
            }
            System.out.println("Arquivo CSV criado com sucesso: " + caminho);
        } catch (IOException e) {
           
            System.err.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }

           public List<String[]> lerArquivo(String caminho) {
        List<String[]> dados = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(caminho))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.add(linha.split(",")); 
            }
        } catch (IOException e) {
          
            System.err.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }
        return dados;
    }

    
}
