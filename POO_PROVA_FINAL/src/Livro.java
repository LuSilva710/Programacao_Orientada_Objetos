
public class Livro extends Produto {

    private String isbn;

    public Livro(String isbn, String descricao) {
        this.isbn = isbn;
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String mostrarDados() {
        return "Produto: " + descricao + " - " + isbn;
    }

    @Override
    public String toString() {
        return "Livro - " + "ISBN = " + isbn;
    }
    
    
}
