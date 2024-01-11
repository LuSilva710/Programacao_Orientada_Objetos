package poo_heranca_ex03;

public class CamaroteSuperior extends VIP{
     private double valorAdicionalCamaroteSuperior;
    
    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalCamaroteSuperior) {
        super(valor, valorAdicional);
        this.valorAdicionalCamaroteSuperior =  valorAdicionalCamaroteSuperior;
    }
    
    public double getValorCamaroteSuperior() {
        return super.getValorVIP() + valorAdicionalCamaroteSuperior;
    }
    
}
