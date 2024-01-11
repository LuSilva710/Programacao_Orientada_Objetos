package poo_lista_polimorfismo_ex07;

public class Livro extends Item {

    private String autor;

    public Livro(String nome, double preco, String codigoBarras, String autor) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAutor: " + getAutor();
    }
    
    
}
