package poo_heranca_ex03;

public class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
 
    public double getValorVIP(){
        return getValor() + valorAdicional;
    }
    
    
    
}
