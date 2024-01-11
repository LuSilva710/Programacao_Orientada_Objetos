package poo_heranca_ex03;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha seu ingresso: ");
            System.out.println("0 - Finalizar | 1 - Ingresso Normal | 2 - Ingresso VIP");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 0:
                    System.out.println("Finalizando.");
                    break;
                case 1:
                    Ingresso ingressoNormal = new IngressoNormal(50.0);
                    System.out.println("Compra realizada com sucesso!");
                    System.out.println("Valor do ingresso normal: " + ingressoNormal.imprimeValor());
                    System.out.println("--------------------------------------------------\n");
                    break;

                case 2:
                    System.out.println("Informe o tipo de camarote desejado: ");
                    System.out.println("1 - Camarote Superior | 2 - Camarote Inferior ");
                    int escolhaCamarote = scanner.nextInt();

                    switch (escolhaCamarote) {
                        case 1:
                            System.out.println("Compra realizada com sucesso!");
                            CamaroteSuperior camaroteSuperior = new CamaroteSuperior(120.0, 40.0, 50.0);
                            System.out.println("Valor do Camarote Superior: R$" + camaroteSuperior.getValorCamaroteSuperior());
                            System.out.println("--------------------------------------------------\n");
                            break;
                        case 2:
                            CamaroteInferior camaroteInferior = new CamaroteInferior(100.0, 30.0, "Setor B");
                            System.out.println("Compra realizada com sucesso!");
                            camaroteInferior.imprimeLocalizacao();
                            System.out.println("Valor do Camarote Inferior: R$" + camaroteInferior.getValorVIP());
                            System.out.println("--------------------------------------------------\n");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}
