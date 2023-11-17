package poo_lista_polimorfismo_ex03;

import java.util.Scanner;

public class Assalariado extends Funcionario {
    private double salario;
    
    public Assalariado(String nome, double salario){
        super(nome);
        this.salario = salario;
    }
    
    @Override
    public double receberPagamento(){
        return salario;
    }
    
    public void inserirDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar nome do funcionário: ");
        super.setNome(scanner.next());
        System.out.println("Informar salário:");
        this.salario = scanner.nextDouble();
    }
}
