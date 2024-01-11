package Model;

public class Usuario extends Pessoa {

    private String nivelAcesso;
    private String senha;

    //CONSTRUTORES
    public Usuario(String nome, String nivelAcesso, String senha) {
        super(nome);
        this.nivelAcesso = nivelAcesso;
        this.senha = senha;
    }

    public Usuario(String nome, String senha) {
        super(nome);
        this.senha = senha;
    }

    //METODOS GETTER E SETTER
    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
