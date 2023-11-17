package fatura;
public class Fatura {

    String numero;
    String descricao;
    int quantidadeItemCompra;
    double valorItem;
    
    double getTotalFatura() {
        double valorFatura = quantidadeItemCompra * valorItem;
        if (valorFatura < 0) {
            valorFatura = 0;
        }
        if (valorItem < 0) {
            valorItem = 0.0;
                }
        return valorFatura;
    }
    
}
