package poo_heranca01;

public class Diretor extends Gerente {
    private int numeroDeDepartamentos;
    
       // MÉTODO CONSTRUTOR
    public Diretor (String nome, String cpf,  int senha){
        super (nome, cpf, senha);
        this.numeroDeDepartamentos = 3;
}
    
      // MÉTODO BONIFICAR (SOBRESCRITA - OVERRIDE)
    @Override
    public double calculaBonificacao(){
        return(super.calculaBonificacao()+5000);
    }
}
