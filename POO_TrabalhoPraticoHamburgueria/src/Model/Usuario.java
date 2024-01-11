package Model;

import java.util.ArrayList;

public abstract class Usuario {

    public String nome;
    private int senha;
    private String telefone;
    private String nivelAcesso;

    public Usuario(String nome, int senha, String telefone) {
        this.nome = nome;
        this.senha =senha;
        this.telefone = telefone;
        this.nivelAcesso = "CLIENTE";
    }

    public Usuario(String nome, int senha, String telefone, String nivelAcesso) {
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public int getSenha() {
        return senha;
    }
    
    public abstract Usuario autenticar(String nome, int senha);
    
    //public abstract void cadastrar();
}
