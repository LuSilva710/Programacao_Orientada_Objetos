package poo_heranca_ex02_b;

public class Miseravel extends Pessoa{
    
    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }
    
    public String mendiga(){
       return "situação vulnerável.";
    }
}
