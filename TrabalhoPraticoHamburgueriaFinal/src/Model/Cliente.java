package Model;

public class Cliente extends Usuario {

    private int id;
    private String telefone;
    private String endereco;
    private String bairro;
    private Pedido pedido;
    private boolean entrega;

    // CONSTRUTORES
    public Cliente(int id, String nome, String senha, String telefone, String endereco, String bairro) {
        super(nome, senha);
        this.id = id;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
    }

    public Cliente(int id, String nome, String telefone, String endereco, String bairro) {
        super(nome);
        this.id = id;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
    }

    // GETTER E SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isEntrega() {
        return entrega;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
