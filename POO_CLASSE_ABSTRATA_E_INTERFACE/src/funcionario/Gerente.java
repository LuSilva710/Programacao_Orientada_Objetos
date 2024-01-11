package funcionario;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;
    private int numFuncGerenciados;
    private String depto;

    public Gerente(int senha, String nome, String cpf, String depto) {
        super(nome, cpf);
        this.senha = senha;
        this.depto = depto;

    }

    @Override
    public boolean autentica(int senha) {
        System.out.println("Sou o gerente " + this.nome + " e estou validando minha senha!");
        if (senha == this.senha && DeptosAutorizados.validaDepto(this.depto)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calculaBonificacao() {
        return (this.salario * 1.4);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }
}
