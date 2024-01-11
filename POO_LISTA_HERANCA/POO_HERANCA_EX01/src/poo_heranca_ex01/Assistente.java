
package poo_heranca_ex01;

public class Assistente extends Funcionario {
    private int numeroMatricula;
    
    public Assistente(String nome, double salario, int numeroMatricula){
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Número de Matricula: " + getNumeroMatricula());
    }
    
}
