package SegundoSemestre.UnidadeUm.Exercicios.Exercicios2.Questao2;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Informe um valor valido");
        }else{
            saldo = saldo + valor;
        }
    }

    public void sacar(double valor){
        if (valor > saldo) {
            System.out.println("saldo insuficiente");
        }else if(valor <= 0){
            System.out.println("Informe um valor valido");
        }else{
            saldo = saldo - valor;
        }
       

    }

    public void transferir(ContaBancaria conta, double valor){
        
        if (valor > saldo) {
            System.out.println("saldo insuficiente");
        }else if(valor <= 0){
            System.out.println("Informe um valor valido");
        }else{
            saldo = saldo - valor;
            conta.depositar(valor);
        }
    }

    
}
