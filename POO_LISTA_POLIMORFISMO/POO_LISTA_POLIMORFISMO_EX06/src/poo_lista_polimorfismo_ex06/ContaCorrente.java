package poo_lista_polimorfismo_ex06;

public class ContaCorrente {
    private double saldo;
    private double taxaOperacao;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
        this.taxaOperacao = 0.005; 
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor){
        double taxa = valor * taxaOperacao;
        saldo -= (valor + taxa);
    }
    
    public void obterSaldo(){
        System.out.println("Saldo atual:" + saldo);
    }
}
