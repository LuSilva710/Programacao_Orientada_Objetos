package funcionario;

public abstract class FuncionarioAutenticavel extends Funcionario {
    
    public FuncionarioAutenticavel(String nome, String cpf) {
        super(nome, cpf);
    }

    public abstract boolean autentica(int senha);

}
