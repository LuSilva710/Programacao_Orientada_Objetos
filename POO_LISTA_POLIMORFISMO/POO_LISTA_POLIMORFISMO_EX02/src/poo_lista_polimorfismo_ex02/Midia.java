package poo_lista_polimorfismo_ex02;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    // METODO CONSTRUTOR
    public Midia() {
        this.codigo = 0;
        this.preco = 0.0;
        this.nome = "";
    }

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    // METODOS GETTER E SETTER
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // METODOS DA CLASSE
    public  String getTipo(){
        return "";
    };

    public  String getDetalhes(){
        return "";
    };

    public void exibirDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Detalhes: \n" + getDetalhes());
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do disco: ");
        this.nome = scanner.next();
        System.out.println("Insira o código: ");
        this.codigo = scanner.nextInt();
        System.out.println("Insira o preço: ");
        this.preco = scanner.nextDouble();
    }

}
