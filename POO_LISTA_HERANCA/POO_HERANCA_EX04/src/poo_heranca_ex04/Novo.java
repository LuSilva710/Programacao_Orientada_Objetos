package poo_heranca_ex04;

public class Novo extends Imovel {
    private double valorAdicional;
    
    public Novo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }
    
     public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double calcularPrecoFinal() {
        return getPreco() + valorAdicional;
    }
    
}
