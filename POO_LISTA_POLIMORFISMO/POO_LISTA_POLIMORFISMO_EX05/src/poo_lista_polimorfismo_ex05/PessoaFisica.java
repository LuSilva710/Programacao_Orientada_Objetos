package poo_lista_polimorfismo_ex05;

public class PessoaFisica extends Pessoa{
    private int cpf;
    private double imposto;
    
    public PessoaFisica(String nome, String endereco, double valorPagamento, int cpf, double imposto){
        super(nome, endereco, valorPagamento);
        this.cpf = cpf;
        this.imposto = 0.10;
    }
    
    @Override
    public double realizarPagamento(){
        return getValorPagamento() - (getValorPagamento() * imposto);
    }
}


