/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10.Questao2;

/**
 *
 * @author esgirardi
 */
public class Teste {

    public static void main(String[] args) {
        
        Vendedor vendedorLuiz = new Vendedor(10, "Luiz", 1000.0);
        Vendedor vendedorPaula = new Vendedor(7, "Paula", 1200.0);
        
        
        
        vendedorLuiz.incluirVenda(new Venda(200));
        vendedorLuiz.incluirVenda(new Venda(100));
        
        vendedorPaula.incluirVenda(new Venda(500));
        vendedorPaula.incluirVenda(new Venda(350));
        vendedorPaula.incluirVenda(new Venda(280));
        
        Programador programadorJulio = new Programador("Julio", 1000.0);
        programadorJulio.incluirLinguagem("C");
        programadorJulio.incluirLinguagem("java");
        
        Programador programadorAna = new Programador("Ana", 1000.0);
        programadorJulio.incluirLinguagem("C#");
        programadorJulio.incluirLinguagem("java");
        
        Programador programadorAnderson = new Programador("Anderson", 1200.0);
        programadorJulio.incluirLinguagem("Python");
        
        Funcionario funcionarioJose = new Funcionario("Jose", 1000.0);
        Funcionario funcionarioMaria = new Funcionario("Maria", 1400.0);
        
        Empresa empresa = new Empresa("Senior");
        
        empresa.incluirFuncionario(vendedorLuiz);
        empresa.incluirFuncionario(vendedorPaula);
        empresa.incluirFuncionario(programadorJulio);
        empresa.incluirFuncionario(programadorAna);
        empresa.incluirFuncionario(programadorAnderson);
        empresa.incluirFuncionario(funcionarioJose);
        empresa.incluirFuncionario(funcionarioMaria);
        
        System.out.println(empresa.calcularCustosSalarios());
        
        
        System.out.println("Funcionarios");
        System.out.println(empresa.getFuncionarios().toString());
        
        
        System.out.println("Vendedores");
        for (Funcionario f : empresa.getFuncionarios()) {
             if (f instanceof Vendedor) {
                 System.out.println(f.toString());
            }
        }
        
        System.out.println("Programadores");
        for (Funcionario f : empresa.getFuncionarios()) {
             if (f instanceof Programador) {
                 System.out.println(f.toString());
            }
        }
        
        
        
    }
    
}
