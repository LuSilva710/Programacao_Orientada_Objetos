package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HamburgueriaApp {

    static Scanner teclado = new Scanner(System.in);
    static List<Cardapio> cardapio = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
     static List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        adicionarItemCardapio();

        // MENU DE INTERAÇÃO COM USUÁRIO
        do {
            System.out.println("OLÁ! INFORME A OPERAÇÃO A SER REALIZADA: ");
            System.out.println("1- CONSULTAR CARDÁPIO | 2 - REALIZAR CADASTRO | 3 - REALIZAR PEDIDO | 4 - STATUS DO PEDIDO |  0 - FINALIZAR ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    System.out.println(solicitarCardapio());
                    break;
                case 2:
                    cadastrarClienteOuFuncionario();
                    break;
                case 3:
                    realizarPedido();
                    break;
                case 4:
                    statusPedido();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    //  MÉTODO PARA ADICIONAR OPÇÕES AO CARDÁPIO
    private static void adicionarItemCardapio() {
        cardapio.add(new Hamburguer(1, "BOMB BACON", " (Pão, hambúrguer artesanal de carne bovina (130 g), queijo cheddar, bacon, ovo caipira, cebola roxa e picles)...........................", 35));
        cardapio.add(new Hamburguer(2, "BURGUER ©710", " (Pão, hambúrguer artesanal de carne bovina (130 g), queijo cheddar, cebola caramelizada e muito bacon)................................", 35));
        cardapio.add(new Hamburguer(3, "MASTER CHICKEN", " (Pão, hambúrguer artesanal de frango (130 g), mussarela, bacon e salada ©710).......................................................", 35));
        cardapio.add(new Hamburguer(4, "BIG BOMB", " (Pão, dois hambúrgueres artesanais de carne bovina (130 g/cada), dupla camada de queijo cheddar, cebola caramelizada e muito bacon).......", 45));
        cardapio.add(new Hamburguer(5, "BIG ©710", " (Pão, dois hambúrgueres artesanais de carne bovina (130 g/cada), dupla camada de queijo cheddar, bacon, ovo caipira, cebola roxa e picles)", 45));
        cardapio.add(new Hamburguer(6, "BIG CHICKEN", " (Pão, dois hambúrgueres artesanais de frango (130 g/cada), dupla camada de mussarela, bacon e salada ©710..............................", 45));
        cardapio.add(new HamburguerVegetariano(7));
        cardapio.add(new Hamburguer(8));
        cardapio.add(new Bebida(10, "COCA-COLA", " - 2L.....................................................................................................................................", 12));
        cardapio.add(new Bebida(11, "COCA-COLA ZERO", " - 2L...............................................................................................................................", 12));
        cardapio.add(new Bebida(12, "SUCO DEL VALLE", " - lata.............................................................................................................................", 6));
        cardapio.add(new Bebida(13, "SUCO DEL VALLE", " - 2L...............................................................................................................................", 12));
        cardapio.add(new Fritas(14, "PORÇÃO DE FRITAS ©710", " - Tamanho P | M | G.........................................................................................................", " ", 25.00));
        cardapio.add(new Fritas(15, "PORÇÃO DE FRITAS SUPREMA ©710", " - Tamahos P | M | G ................................................................................................", " - ", 35.00));
    }

    // MÉTODO PARA GERAR CÁRDAPIO 
    private static String solicitarCardapio() {
        StringBuilder cardapioStr = new StringBuilder();
        for (int i = 0; i < cardapio.size(); i++) {
            cardapioStr.append(i + 1).append(" - ").append(cardapio.get(i).getNome()).append(cardapio.get(i).getDescricao()).append("...R$")
                    .append(cardapio.get(i).getValor()).append("\n");
        }
        return cardapioStr.toString();
    }

    // MÉTODO PARA CADASTRAR CLIENTE OU FUNCIONÁRIO
    private static void cadastrarClienteOuFuncionario() {
        System.out.println("DIGITE 'C' PARA CADASTRAR UM CLIENTE OU 'F' PARA CADASTRAR UM FUNIONARIO:");
        String chave = teclado.next();
        if ("C".equalsIgnoreCase(chave)) {
            Cliente.cadastrar(clientes);
        } else if ("F".equalsIgnoreCase(chave)) {
            Funcionario.cadastrar(funcionarios);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    // METODO VERIFICA CADASTRO
    private static Cliente buscarCliente(String nomeCliente, int senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeCliente) && cliente.getSenha() == senha) {
                return cliente;
            }
        }
        return null;
    }

    // MÉTODO REALIZAR PEDIDO
    public static void realizarPedido() {
        System.out.println("\nINFORME SEU NOME:");
        teclado.nextLine();
        String nomeCliente = teclado.nextLine();
        System.out.println("INFORME SUA SENHA:");
        int senha = teclado.nextInt();

        Cliente clienteExistente = buscarCliente(nomeCliente, senha);

        if (clienteExistente != null) {
            System.out.println("Cliente autenticado. Realizando pedido...");
            adicionarPedido(clienteExistente);
        } else {
            System.out.println("Cliente não autenticado. Verifique o nome e a senha.");
        }
    }

    // METODO ADICIONAR PEDIDO AO CLIENTE
    private static void adicionarPedido(Cliente cliente) {
        Pedido pedido = new Pedido(cliente);

        int opcaoAdicionar;
        do {
            System.out.println("\nINFORME A OPÇÃO DO ITEM DESEJADO:");
            int idItem = teclado.nextInt();
            System.out.println("INSIRA A QUANTIDADE: ");
            int quantidade = teclado.nextInt();

            Cardapio itemSelecionado = cardapio.get(idItem - 1);

            if (itemSelecionado != null) {
                pedido.adicionarItem(itemSelecionado, quantidade);
            } else {
                System.out.println("Opção selecionada não é válida. Tente novamente.");
            }

            System.out.println("\nDESEJA ADICIONAR OUTRO ITEM AO PEDIDO?");
            System.out.println("1 - SIM | 2 - NÃO");
            opcaoAdicionar = teclado.nextInt();
        } while (opcaoAdicionar == 1);

        cliente.setPedido(pedido);
        System.out.println("PEDIDO REALIZADO COM SUCESSO! \n");
    }

// MÉTODO PARA EXIBIR STATUS DO PEDIDO
    private static void statusPedido() {
        if (!clientes.isEmpty()) {
            System.out.println("STATUS DOS PEDIDOS:");
            for (int i = 0; i < clientes.size(); i++) {
                Cliente cliente = clientes.get(i);
                Pedido pedido = cliente.getPedido();
                System.out.println("PEDIDO " + (i + 1) + ":");
                pedido.exibirDetalhes();
            }
        } else {
            System.out.println("NENHUM PEDIDO REALIZADO! \n");
        }
    }
}
