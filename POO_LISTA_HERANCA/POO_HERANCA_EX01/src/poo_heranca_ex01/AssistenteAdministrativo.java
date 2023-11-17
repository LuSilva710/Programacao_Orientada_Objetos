package poo_heranca_ex01;

public class AssistenteAdministrativo extends Assistente {

    private String turno;
    private double adicionalNoturno;

    public AssistenteAdministrativo(String nome, double salario, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        double salarioAnual = super.ganhoAnual();

        if (turno.equalsIgnoreCase("noite")) {
            salarioAnual += adicionalNoturno;
        }
        return salarioAnual;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Turno: " + getTurno());
        System.out.println("Adiciona Noturno: " + getAdicionalNoturno());
        System.out.println("Ganho Anual: " + ganhoAnual());
    }

}
