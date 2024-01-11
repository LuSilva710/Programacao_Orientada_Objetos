package poo_lista_polimorfismo_ex03;

import java.util.Scanner;

public class Horista extends Funcionario {
    private double taxaHora;
    private double horasTrabalhadas;

    public Horista(String nome, double taxa) {
        super(nome);
        this.taxaHora = taxa;
    }

    public void addHora(double horas) {
        this.horasTrabalhadas += horas;
    }

    @Override
    public double receberPagamento() {
        return taxaHora * horasTrabalhadas;
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar nome do funcionário: ");
        super.setNome(scanner.next());
        System.out.println("Informe a taxa por hora trabalhada: ");
        this.taxaHora = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        this.horasTrabalhadas = scanner.nextDouble();
    }
}
