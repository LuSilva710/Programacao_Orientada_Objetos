package fatura;

import java.util.Scanner;

public class FaturaTeste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Fatura faturaTeste = new Fatura();
        
        System.out.println("Número da fatura...: ");
        faturaTeste.numero = teclado.nextLine();
        
        System.out.println("Descrição..........:");
        faturaTeste.descricao = teclado.nextLine();
        
        System.out.println("Quantidade de itens: ");
        faturaTeste.quantidadeItemCompra = teclado.nextInt();
        
        System.out.println("Valor do Item......:");
        faturaTeste.valorItem = teclado.nextDouble();
        
        double totalFatura = faturaTeste.getTotalFatura();
        
        System.out.println("\n**Detalhes da Fatura**");
        System.out.println("Número.............: " + faturaTeste.numero);
        System.out.println("Descrição..........: " + faturaTeste.descricao);
        System.out.println("Quantidade Comprada: " + faturaTeste.quantidadeItemCompra);
        System.out.println("Preço por Item.....: " + faturaTeste.valorItem);
        System.out.println("Total da Fatura....: " + totalFatura);

    }
}
