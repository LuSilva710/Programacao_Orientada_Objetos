package Model;

public abstract class Pedido {

    private int id;
    private String nome;
    private String descricao;
    private double valor;
    private int quantidade;

//   // CONSTRUTORES
    public Pedido(int id, String nome, String descricao, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Pedido(int id, String nome, String descricao, double valor, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    //METODO ABSTRATO
    public abstract void prepararPedido();

    //METODOS GETTER E SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        double valorTotal = this.valor * this.quantidade;
        return valorTotal;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
