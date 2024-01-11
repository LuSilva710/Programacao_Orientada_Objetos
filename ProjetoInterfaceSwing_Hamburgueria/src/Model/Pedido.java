package Model;

public class Pedido {
   private int id;
   private String nome;
   private String descricao;
// private int quantidade;
   private double valor;

   // CONSTRUTOR
    public Pedido(int id, String nome, String descricao,  double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

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
    
     @Override
    public String toString(){
        return getNome();
    }
}
