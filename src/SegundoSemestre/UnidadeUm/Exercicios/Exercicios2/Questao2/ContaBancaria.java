package SegundoSemestre.UnidadeUm.Exercicios.Exercicios2.Questao2;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private Double saldo;

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

    public void depositar(Double valor){
        saldo = saldo + valor;
    }

    public void sacar(Double valor){
        saldo = saldo - valor;
    }

    public void transferir(ContaBancaria conta, Double valor){
        saldo = saldo - valor;
        conta.depositar(valor);
    }

    
}
