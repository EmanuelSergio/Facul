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
 
    public double calcularIrpf(){
    
        double imposto = 0;
        double diferenca = 0;
        
        if (salario > 1903.98) {
            if (salario <= 2826.65) { 
                diferenca = salario - 1903.98;
                imposto = diferenca * (7.5/100.0);
            } else if (salario <= 3751.05) { 
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                diferenca = salario - 2826.65;
                imposto += (diferenca * (15.0/100.0));
            } else if (salario <= 4664.68) { 

                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                
                diferenca = 3751.05 - 2826.65;
                imposto += (diferenca * (15.0/100.0));
                
                
                diferenca = salario - 3751.05;
                imposto += (diferenca * (22.5/100.0));
            } else { 
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                diferenca = 3751.05 - 2826.65;
                imposto += (diferenca * (15.0/100.0));
                
                diferenca = 4664.68 - 3751.05;
                imposto += (diferenca * (22.5/100.0));
                
                diferenca = salario - 4664.68;
                imposto += (diferenca * (27.5/100.0));
            }
        }
        
        return imposto;
    }

}
