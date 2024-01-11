
public class Revista extends Produto {

    private String issn;

    public Revista(String issn, String descricao) {
        this.issn = issn;
        this.descricao = descricao;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String mostrarDados() {
        return "Produto: " + descricao + " - " + issn;
    }

    @Override
    public String toString() {
        return "Revista - " + "ISSN = " + issn;
    }
    
    

}
