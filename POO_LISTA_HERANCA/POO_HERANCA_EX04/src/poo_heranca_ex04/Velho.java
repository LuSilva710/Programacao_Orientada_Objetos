package poo_heranca_ex04;

public class Velho extends Imovel {
    private double desconto;
    
    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularPrecoFinal() {
        return getPreco() - desconto;
    }
}
