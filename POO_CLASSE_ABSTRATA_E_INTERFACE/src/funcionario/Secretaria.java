package funcionario;


public class Secretaria extends Funcionario{
    
    public Secretaria(String nome, String cpf) {
        super(nome, cpf);
    }
    
    
    @Override
     public double calculaBonificacao(){
        return (this.salario*1.25);
    }
    
}
