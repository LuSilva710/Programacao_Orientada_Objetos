package poo_heranca01;

public class ControleBonificacao {
    private double totalBonificacao = 0;
        
    public void registra (Funcionario f){
        if (! (f instanceof Diretor)){
            this.totalBonificacao += f.calculaBonificacao();
        }
    }

    public double getTotalBonificacao() {
        return totalBonificacao;
    }
    
    
}
