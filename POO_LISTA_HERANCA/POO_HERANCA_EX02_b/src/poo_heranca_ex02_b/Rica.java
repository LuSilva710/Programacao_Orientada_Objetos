package poo_heranca_ex02_b;

public class Rica extends Pessoa {
    private double dinheiro;
    
    public Rica(String nome, int idade) {
        super(nome, idade);
    }
    
    public String fazCompras(){
      return  "bem sucedido.";
    }
    
    
}
