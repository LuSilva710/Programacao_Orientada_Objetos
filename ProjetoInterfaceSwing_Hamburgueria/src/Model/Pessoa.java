package Model;

public abstract class Pessoa {

    protected String id;
    protected String nome;
    protected String email;
    protected String telefone;

    //CONSTRUTOR
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
      public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //METODOS GETTER E SETTER
    public void setId(String id) {    
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
