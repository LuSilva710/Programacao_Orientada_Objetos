package Model;

public class Hamburguer extends Cardapio {
    
    
    // MÉTODO CONSTRUTOR 1
    public Hamburguer(int id) {
        super(id, "PROMOÇÃO DO DIA ", " (Combo Clássico + porção de fritas da casa) ......................................................................................", 90.00);
    }

    // MÉTODO CONSTRUTOR 2 - SOBRECARGA
    public Hamburguer(int id, String nome, String descricao, double valor) {
        super(id, nome, descricao, valor);
    }

}
