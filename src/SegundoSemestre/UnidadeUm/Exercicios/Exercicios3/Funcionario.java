package SegundoSemestre.UnidadeUm.Exercicios.Exercicios3;

public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        
        if(salario <= 0){
            throw new IllegalArgumentException("Salario invalido");
        }
        
        this.salario = salario;
    }
 
    public double calcularIrpf(double salario){
    
        double imposto=0;
        double diferenca = 0;

        if(salario >1903.98){
            if(salario > 1903.98){
                diferenca = salario - 1903.98;
                imposto = diferenca * (7.5/100);
    
            }else if(salario <= 3751.05){
                diferenca = salario - 1903.98;
                imposto += diferenca * (7.5/100);
    
                diferenca = 2826.65 - 1903.98;
                imposto += diferenca * (15.0/100.0);            
            }else if(salario <= 4664.68){


            }else if (salario > 4664.69) {
                
            }
        }

        
        return imposto;
    }

}
