package poo_lista_polimorfismo_ex06;

public class ClienteEspecial extends ContaCorrente {
    private double taxaOperacao;
    
    public ClienteEspecial(double saldo) {
        super(saldo);
        this.taxaOperacao = 0.001;
    }
}
