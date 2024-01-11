package poo_classe_abstrata;

public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Empregado(){
        this.nome = null;
        this.sobrenome = null;
        this.cpf = null;
    }
    
    public Empregado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public abstract double vencimento();
}
