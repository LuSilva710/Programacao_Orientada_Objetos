    package poo_lista_polimorfismo_ex05;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private double valorPagamento;
    private String contato[] = new String[3];
    
    public Pessoa(String nome, String endereco, double valorPagamento){
        this.nome = nome;
        this.endereco = endereco;
        this.valorPagamento = valorPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String[] getContato() {
        return contato;
    }

    public void setContato(String[] contato) {
        this.contato = contato;
    }
    
    public abstract double realizarPagamento();
}
