/*
Crie uma classe chamada Funcionário que inclua 3 atributos: nome, sobrenome, saláriomensal. 
Sua classe deve fornecer métodos get e set para todos os atributos. 
Se o saláriomensal não for positivo, configure-o como zero. 
Escreva um programa que demonstre as
capacidades da classe Funcionário. Crie dois objetos do tipo Funcionário e exiba 
o salárioANUAL de cada objeto. Dê a cada funcionário um aumento de 10% e exiba 
novamenteosalário anual de cada um deles.
 */
package projeto_funcionario;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private double salario_mensal;

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

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        if (salario_mensal < 0) {
            this.salario_mensal = 0;
        } else {
            this.salario_mensal = salario_mensal;
        }
    }

    public double calculaSalarioAnual() {
        double salarioAnual = salario_mensal * 12;
        return salarioAnual;
    }

    public void concederAumento(double percentual) {
        double aumentoSalarial = salario_mensal * percentual;
        salario_mensal += aumentoSalarial;
    }
}
