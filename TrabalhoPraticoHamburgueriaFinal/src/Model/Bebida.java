package Model;

import javax.swing.JOptionPane;

public class Bebida extends Pedido {
    
    public Bebida(int id, String nome, String descricao, double valor) {
        super(id, nome, descricao, valor);
    }

    @Override
    public void prepararPedido() {
        JOptionPane.showMessageDialog(null, "Delivery de Bebidas  - Média de entrega: 25 minutos");
    }
    
}
