package empregado;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private String nomeCompleto;
    private double aumentoSalarial; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public String getDadosPessoais() {
        this.nomeCompleto = nome + sobrenome;
        return nomeCompleto;
    }

    public double salarioAnual() {
        return salarioMensal * 12;
    }

    public void setConcederAumento(double percentual) {
         aumentoSalarial = salarioMensal + (salarioMensal * percentual);
    }
    
    public double getReajusteSalarial(){
        return aumentoSalarial * 12; 
    }
}
