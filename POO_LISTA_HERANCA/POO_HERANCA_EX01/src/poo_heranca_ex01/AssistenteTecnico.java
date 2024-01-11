package poo_heranca_ex01;

public class AssistenteTecnico extends Assistente {
    private double bonusSalarial;
    
    public AssistenteTecnico(String nome, double salario, int numeroMatricula, double bonusSalarial){
        super(nome, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }
    
    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
    
    @Override
    public double ganhoAnual(){
        return super.ganhoAnual() + getBonusSalarial();
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Bonus Salarial: " + getBonusSalarial());
        System.out.println("Ganho Anual: " + ganhoAnual());
    }

}
