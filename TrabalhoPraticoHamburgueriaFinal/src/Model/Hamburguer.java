package Model;

import javax.swing.JOptionPane;

public class Hamburguer extends Pedido {

    // MÉTODO CONSTRUTOR 1
    public Hamburguer(int id) {
        super(0, "PROMOÇÃO DO DIA ", " (Combo Clássico + porção de fritas da casa) ......................................................................................", 90.00);
    }

    // MÉTODO CONSTRUTOR 2 - SOBRECARGA
    public Hamburguer(int id, String nome, String descricao, double valor) {
        super(id, nome, descricao, valor);
    }

    @Override
    public void prepararPedido() {
        JOptionPane.showMessageDialog(null, "Preparando o hambúrguer padrão -  Média de preparo: 50 minutos");
    }

}
