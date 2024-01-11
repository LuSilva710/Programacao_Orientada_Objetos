package Model;

import javax.swing.JOptionPane;

public class Fritas extends Pedido {

    private String tamanho;

    public Fritas(int id, String nome, String descricao, String tamanho, double valor) {
        super(id, nome, descricao, valor);
        this.tamanho = tamanho;
    }

    @Override
    public void prepararPedido() {
        JOptionPane.showMessageDialog(null, "Preparando porção de fritas - Média de preparo: 30 minutos");
    }

}
