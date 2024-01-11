package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Cardapio> itens;
    private int id;
    private Cliente cliente; // COMPOSICIONALIDADE
    private int quantidadeItem;
    private double valor;

    // METODO CONSTRUTOR
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public Pedido(Cliente cliente, List<Cardapio> itens) {
        this.cliente = cliente;
        this.itens = new ArrayList<>(itens);
    }

    public Pedido(int id, Cliente cliente1, Cardapio produto2, int quantidadeItem) {
       
    }

    // MÉTODOS GETTER E SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Cardapio> getItens() {
        return itens;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    // METODO CALCULA  ITENS PEDIDO  
    public int calcularQuantidadeItem(Cardapio item) {
        int quantidadeItem = 0;
        for (Cardapio i : itens) {
            if (i.equals(item)) {
                quantidadeItem++;
            }
        }
        return quantidadeItem;
    }

    // MÉTODO ADICIONAR ITEM AO PEDIDO
    public void adicionarItem(Cardapio item, int quantidadeItem) {
        for (int i = 0; i < quantidadeItem; i++) {
            itens.add(item);
        }
    }

    // MÉTODO EXIBIR  PEDIDO
    public void exibirDetalhes() {
        System.out.println("CLIENTE: " + cliente.getNome());
        System.out.println("ENDEREÇO: " + (cliente.isEntrega() ? cliente.getEndereco() + ", " + cliente.getBairro() : "Retirada no local"));
        List<Cardapio> printedItems = new ArrayList<>();

        for (Cardapio item : itens) {

            if (!printedItems.contains(item)) {
                int quantidade = calcularQuantidadeItem(item);
                System.out.println("x" + quantidade + " - " + item.getNome());
                printedItems.add(item);
            }
        }
        System.out.println("VALOR TOTAL: R$" + calcularPedido());
        System.out.println("MÉDIA DE PREPARO: 50 MINUTOS");
        System.out.println();
    }

    // MÉTODO CALCULAR VALOR PEDIDO
    public double calcularPedido() {
        double valorTotal = 0;
        for (Cardapio item : itens) {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }
}
