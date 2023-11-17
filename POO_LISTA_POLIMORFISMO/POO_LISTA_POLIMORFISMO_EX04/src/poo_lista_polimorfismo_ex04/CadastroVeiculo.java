package poo_lista_polimorfismo_ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> cadastrarVeiculo = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("0 - Sair | 1 - Carro | 2 - Moto | 3 - Exibir Dados do Veículo");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                case 1:
                    Carro carro = cadastrarCarro();
                    cadastrarVeiculo.add(carro);
                    break;
                case 2:
                    Moto moto = cadastrarMoto();
                    cadastrarVeiculo.add(moto);
                    break;
                case 3:
                    exibirDadosVeiculo(cadastrarVeiculo);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private static Moto cadastrarMoto() {
        System.out.println("Nova cadastro de Moto:");
        Moto moto = new Moto("", 0, 0);
        moto.inserirDados();
        return moto;
    }

    public static Carro cadastrarCarro() {
        System.out.println("Nova cadastro de Carro:");
        Carro carro = new Carro("", 0, 0);
        carro.inserirDados();
        return carro;
    }

    private static void exibirDadosVeiculo(ArrayList<Veiculo> veiculos) {
        System.out.println("Relatório de Veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }

        ajustarValores(veiculos);

        // Exibir relatório após ajustes
        System.out.println("Relatório após ajustes:");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }
    }

// Método para ajustar os valores dos veículos
    private static void ajustarValores(ArrayList<Veiculo> veiculos) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.getAno() >= 2008) {
                    double novoPreco = moto.getPreco() * 1.1; // Reajuste de 10%
                    moto.setPreco(novoPreco);
                }
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.getKm() > 100000) {
                    double novoPreco = carro.getPreco() * 0.92; // Redução de 8%
                    carro.setPreco(novoPreco);
                }
            }
        }
    }
}
