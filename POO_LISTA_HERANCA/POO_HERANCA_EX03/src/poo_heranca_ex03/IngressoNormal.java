package poo_heranca_ex03;

public class IngressoNormal extends Ingresso {
    
    public IngressoNormal(double valor) {
        super(valor);
    }
    
    public void imprimeTipo() {
        System.out.println("Ingresso Normal");
    }
    
}
