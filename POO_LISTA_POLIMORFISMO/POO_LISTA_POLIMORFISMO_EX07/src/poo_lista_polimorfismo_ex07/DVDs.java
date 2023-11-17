package poo_lista_polimorfismo_ex07;

public class DVDs extends Item {
    private double duracao;
    
    public DVDs(String nome, double preco, String codigoBarras, double duracao) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nDuração: " + getDuracao();
    }
}
