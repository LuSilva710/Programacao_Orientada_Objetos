package poo_lista_polimorfismo_ex07;

public class Item {
    private String nome;
    private double preco;
    private String codigoBarras;

    public Item(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }  

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + "\nPreço: R$" + getPreco();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return codigoBarras.equals(item.codigoBarras);
    }
}
