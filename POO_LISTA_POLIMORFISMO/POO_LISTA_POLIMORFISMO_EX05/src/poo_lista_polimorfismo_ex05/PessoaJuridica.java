package poo_lista_polimorfismo_ex05;


public class PessoaJuridica extends Pessoa {
    private int cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private double imposto;
    
    public PessoaJuridica(String nome, String endereco, double valorPagamento, int cnpj, String nomeFantasia, String nomeSocial, double imposto){
        super(nome, endereco, valorPagamento);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = nomeSocial;
        this.imposto = 0.20;
    }
     @Override
    public double realizarPagamento(){
        return getValorPagamento() - (getValorPagamento() * 0.20);
    }
}
