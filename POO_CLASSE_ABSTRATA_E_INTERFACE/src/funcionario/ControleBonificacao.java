package funcionario;

public class ControleBonificacao {
    
    private double totalDeBonif = 0;
    
    
    public void regitra(Funcionario f){
        
        this.totalDeBonif+=f.calculaBonificacao();
    }
    
    public double getTotalDeBonif(){
        
        return this.totalDeBonif;
    }
    
}
