
public class RevistaDigital extends Revista implements Autenticar {

    private String doi;
    private String assinante;

    public RevistaDigital(String doi, String assinante, String issn, String descricao) {
        super(issn, descricao);
        this.doi = doi;
        this.assinante = assinante;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getAssinante() {
        return assinante;
    }

    public void setAssinante(String assinante) {
        this.assinante = assinante;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean autenticar(String user) {
        if (user.equals(assinante)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String mostrarDados() {
        return "Produto: " + descricao + " - " + doi;
    }

    @Override
    public String toString() {
        return "RevistaDigital - " + "DOI = " + doi + " | Assinante = " + assinante;
    }
    
    

}
