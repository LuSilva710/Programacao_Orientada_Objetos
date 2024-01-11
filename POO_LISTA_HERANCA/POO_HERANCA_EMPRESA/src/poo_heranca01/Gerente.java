package poo_heranca01;

public class Gerente extends Funcionario {

    private int senha;
    private int numeroDeFuncionarios;

    // MÉTODO CONSTRUTOR
    public Gerente (String nome, String cpf, int senha){
        super (nome, cpf);
        this.senha = senha;
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
    
    // MÉTODOS GETTER E SETTER
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
    
    //MÉTODO VALIDAR SENHA
     public boolean validarSenha(int senha){
        System.out.println("Sou o gerente "+ this.getNome() + ", e estou validando minha senha.");
        
        if(senha == this.senha){
            return true;
        } else {
            return false;
        }
    }
     
      // MÉTODO BONIFICAR (SOBRESCRITA - OVERRIDE)
    public double calculaBonificacao(){
        return(super.calculaBonificacao()+1000);
    }
    
}
