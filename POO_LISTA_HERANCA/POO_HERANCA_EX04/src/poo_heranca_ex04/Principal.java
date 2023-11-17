package poo_heranca_ex04;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Escolha o tipo de imóvel: ");
            System.out.println("0 - Finalizar | 1 - Imóvel Novo | 2 - Imóvel Velho");
            opcao = scanner.nextInt(); 
            
            switch(opcao){
                case 0:
                    System.out.println("Finalizando.");
                    break;
                    
                case 1:
                    System.out.println("Digite o endereço do imóvel novo: ");
                    String enderecoNovo = scanner.next();
                    System.out.println("Digite o preço do imóvel novo: ");
                    double precoNovo = scanner.nextDouble();
                    System.out.println("Digite o valor adicional do imóvel novo: ");
                    double valorAdicionalNovo = scanner.nextDouble();
                    Novo novo = new Novo(enderecoNovo, precoNovo, valorAdicionalNovo);
                    System.out.println("Preço final do imóvel novo: " + novo.calcularPrecoFinal());
                    
                    break;
                    
                case 2:
                    System.out.println("Digite o endereço do imóvel velho: ");
                    String enderecoVelho = scanner.next();
                    System.out.println("Digite o preço do imóvel velho: ");
                    double precoVelho = scanner.nextDouble();
                    System.out.println("Digite o desconto do imóvel velho: ");
                    double descontoVelho = scanner.nextDouble();
                    Velho velho = new Velho(enderecoVelho, precoVelho, descontoVelho);
                    System.out.println("Preço final do imóvel velho: " + velho.calcularPrecoFinal());
                    
                    break;   
                    
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while(opcao != 0);
        
        scanner.close();
    }
}
