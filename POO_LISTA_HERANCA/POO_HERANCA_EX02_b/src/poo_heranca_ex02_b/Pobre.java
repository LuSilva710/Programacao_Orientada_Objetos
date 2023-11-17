package poo_heranca_ex02_b;

public class Pobre extends Pessoa{
    
    public Pobre(String nome, int idade) {
        super(nome, idade);
    }
    
    public String trabalha(){
        return "trabalhador.";
    }
    
}
