package poo_lista_polimorfismo_ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar Assalariado");
            System.out.println("2 - Cadastrar Horista");
            System.out.println("3 - Exibir Dados dos Funcionários");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                case 1:
                    cadastrarAssalariado(listaFuncionarios);
                    break;
                case 2:
                    cadastrarHorista(listaFuncionarios);
                    break;
                case 3:
                    exibirDadosFuncionarios(listaFuncionarios);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void cadastrarAssalariado(ArrayList<Funcionario> listaFuncionarios) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Assalariado");
        System.out.println("Informe o nome do funcionário:");
        String nome = scanner.next();
        System.out.println("Informe o salário:");
        double salario = scanner.nextDouble();
        Assalariado assalariado = new Assalariado(nome, salario);
        listaFuncionarios.add(assalariado);
        System.out.println("Assalariado cadastrado com sucesso!\n");
    }

    private static void cadastrarHorista(ArrayList<Funcionario> listaFuncionarios) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Horista");
        System.out.println("Informe o nome do funcionário:");
        String nome = scanner.next();
        System.out.println("Informe a taxa por hora trabalhada:");
        double taxaHora = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        double horasTrabalhadas = scanner.nextDouble();
        Horista horista = new Horista(nome, taxaHora);
        horista.addHora(horasTrabalhadas);
        listaFuncionarios.add(horista);
        System.out.println("Horista cadastrado com sucesso!\n");
    }

    private static void exibirDadosFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        System.out.println("\nDados dos Funcionários:");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome...: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.receberPagamento());
            System.out.println("------------");
        }

        System.out.println();
    }
}
