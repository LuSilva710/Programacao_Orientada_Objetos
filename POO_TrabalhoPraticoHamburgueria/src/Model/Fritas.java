package Model;

public class Fritas extends Cardapio {
    private String tamanho;
    
     public Fritas(int id, String nome, String descricao, String tamanho, double valor) {
        super(id, nome, descricao, valor);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
     
     
    
}
