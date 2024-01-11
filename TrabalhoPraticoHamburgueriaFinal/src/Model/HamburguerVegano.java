package Model;

import javax.swing.JOptionPane;

public class HamburguerVegano extends Hamburguer {

    private String bifeVegano;
    public HamburguerVegano(int id, String nome, String descricao, String bifeVegano, double valor) {
        super(id, nome, descricao, valor);
        this.bifeVegano = "Hambúrguer artesanal de soja (130 g)";
    }

    public String getBifeVegano() {
        return bifeVegano;
    }

    public void setBifeVegano(String bifeVegano) {
        this.bifeVegano = bifeVegano;
    }
    
    @Override
    public void prepararPedido() {
        JOptionPane.showMessageDialog(null, "Preparando o hambúrguer vegano - Média de preparo: 35 minutos");
    }

}
