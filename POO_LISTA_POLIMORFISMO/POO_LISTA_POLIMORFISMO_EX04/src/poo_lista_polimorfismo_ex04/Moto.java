package poo_lista_polimorfismo_ex04;

import java.util.Scanner;

public class Moto extends Veiculo {

    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public void inserirDados() {
        System.out.println("Informe o nome do veiculo: ");
        Scanner scanner = new Scanner(System.in);
        super.setModelo(scanner.next());
        System.out.println("Informe o preço do veiculo: ");
        super.setPreco(scanner.nextDouble());
        System.out.println("Informe o ano do veiculo: ");
        ano = scanner.nextInt();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Ano: " + ano);
        System.out.println("-----------------------\n");
    }
}
