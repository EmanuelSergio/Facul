/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esgirardi
 */
public class teste {
    
    private static final String FILE_PATH_TESTE = "C:\\teste\\teste.csv";
    
    public static void main(String[] args) {
        
        List<Integer> notas = new ArrayList<>();
        notas.add(10);
        notas.add(9);
        notas.add(9);
        
        AlunoController controller = new AlunoController();
        
        Aluno aluno1 = new Aluno("Gustavo", notas);
        Aluno aluno2 = new Aluno("Pedro", notas);
        Aluno aluno3 = new Aluno("mASNO", notas);
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        alunos.add(aluno1);
          alunos.add(aluno2);
          alunos.add(aluno3);
        
          // EXEMPLO 5: Manipulação de arquivos CSV
            List<String[]> dados = new ArrayList<>();
        
       controller.salvarAlunos(FILE_PATH_TESTE,alunos );
        
       controller.lerArquivo(FILE_PATH_TESTE).forEach(linha -> System.out.println(String.join(", ", linha)));;
        
    }
    
}
