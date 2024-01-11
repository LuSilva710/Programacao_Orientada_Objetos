package Model;

public class Cliente extends Pessoa {

    private String endereco;

    //CONSTRUTOR
    public Cliente(String id, String nome, String email, String telefone, String endereco) {
        super(id, nome, email, telefone);
        this.endereco = endereco;
    }
    
      public Cliente(String nome, String telefone, String endereco) {
        super(nome, telefone);
        this.endereco = endereco;
    }

    public Cliente(String nome, String telefone) {
        super(nome, telefone);
    }

    //METODOS GETTER E SETTER

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
}
