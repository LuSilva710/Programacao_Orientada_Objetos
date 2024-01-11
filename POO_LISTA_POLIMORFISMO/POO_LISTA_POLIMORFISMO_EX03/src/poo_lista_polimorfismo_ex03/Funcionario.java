package poo_lista_polimorfismo_ex03;

public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    
     public String getNome() {
        return nome;
    }
     
      public void setNome(String nome) {
        this.nome = nome;
    }

    public double receberPagamento() {
        return 0.0;
    }

    public void exibirPagamento() {
        System.out.println("Salário: " + receberPagamento());
    }
}
