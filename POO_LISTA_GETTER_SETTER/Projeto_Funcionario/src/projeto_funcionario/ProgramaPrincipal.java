package projeto_funcionario;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Funcionario funcionario1, funcionario2;
        funcionario1 = new Funcionario();
        funcionario2 = new Funcionario();

        funcionario1.setNome("Joao");
        funcionario1.setSobrenome("Marciano");
        funcionario1.setSalario_mensal(1400.0);
        funcionario1.concederAumento(0.10); // Aumento de 10%

        funcionario2.setNome("Maria");
        funcionario2.setSobrenome("Marciana");
        funcionario2.setSalario_mensal(1600.0);
        funcionario2.concederAumento(0.10); // Aumento de 10%

        System.out.println("Funcionário(a): " + funcionario1.getNome() + " " + funcionario1.getSobrenome());
        System.out.println("Salário Anual.: R$" + funcionario1.calculaSalarioAnual() + "\n");

        System.out.println("Funcionário(a): " + funcionario2.getNome() + " " + funcionario2.getSobrenome());
        System.out.println("Salário Anual.: R$" + funcionario2.calculaSalarioAnual());

    }
}
