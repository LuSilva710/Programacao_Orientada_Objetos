package funcionario;

public class Diretor extends Funcionario implements Autenticavel {

    private int numDepto;
    private int senha;

    public Diretor(String nome, String cpf, int senha) {
        super(nome, cpf);
        this.numDepto = 4;
        this.senha = senha;
    }

   
   @Override
    public boolean autentica(int senha) {
        System.out.println("Sou o diretor " + this.nome + " e estou validando minha senha!");
        if (senha == this.senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calculaBonificacao() {
        return (this.salario * 1.5);
    }
}
