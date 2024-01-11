package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Usuario implements Cadastro {

    static List<Cliente> clientes = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);
    private String endereco;
    private String bairro;
    private Pedido pedido;
    private boolean entrega;

    // MÉTODO CONSTRUTOR 
    public Cliente(String nome, int senha, String telefone) {
        super(nome, senha, telefone, "CLIENTE");
    }

    // MÉTODO CONSTRUTOR 2 - SOBRECARGA
    public Cliente(String nome, int senha, String telefone, String endereco, String bairro) {
        super(nome, senha, telefone, "CLIENTE");
        this.endereco = endereco;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public static void cadastrar(List<Cliente> clientes) {
        System.out.println("CADASTRO DE CLIENTE:");
        System.out.println("\nINFORME SEU NOME:");
        String nomeCliente = teclado.nextLine();
        System.out.println("INFORME SUA SENHA:");
        int senha = teclado.nextInt();
        System.out.println("INFORME SEU TELEFONE:");
        String telefone = teclado.next();

        System.out.println("ESCOLHA UMA OPÇÃO DE ENTREGA: ");
        System.out.println("1 - INFORMAR ENDEREÇO");
        System.out.println("2 - RETIRAR NO LOCAL");
        int opcaoEntrega = teclado.nextInt();

        String endereco = "";
        String bairro = "";

        Cliente cliente;
        if (opcaoEntrega == 1) {
            System.out.println("INFORME O ENDEREÇO DE ENTREGA:");
            teclado.nextLine();
            endereco = teclado.nextLine();

            System.out.println("INFORME SEU BAIRRO:");
            bairro = teclado.nextLine();
            cliente = new Cliente(nomeCliente, senha, telefone, endereco, bairro);
        } else {
            cliente = new Cliente(nomeCliente, senha, telefone);
        }

        clientes.add(cliente);
        System.out.println("CADASTRO REALIZADO COM SUCESSO! \n");
    }

    @Override
    public Cliente autenticar(String nome, int senha) {
        System.out.println("Sou o cliente " + super.getNome() + " e estou validando minha senha!");
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(cliente.getNome()) && senha == super.getSenha()) {
                return cliente;
            }
        }
        return null;
    }
}

