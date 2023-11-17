package poo_heranca_ex01;

public class Principal {

    public static void main(String[] args) {
         // Testando a classe Funcionario
        Funcionario funcionario = new Funcionario("João", 3000.0);
        funcionario.addAumento(500.0);
        funcionario.exibirDados();
        System.out.println("-----------------------------\n");

        // Testando a classe Assistente
        Assistente assistente = new Assistente("Maria", 2500.0, 12345);
        assistente.addAumento(300.0);
        assistente.exibirDados();
        System.out.println("-----------------------------\n");

        // Testando a classe AssistenteTecnico
        AssistenteTecnico tecnico = new AssistenteTecnico("Carlos", 2800.0, 67890, 200.0);
        tecnico.exibirDados();
        System.out.println("-----------------------------\n");

        // Testando a classe AssistenteAdministrativo
        AssistenteAdministrativo administrativo = new AssistenteAdministrativo("Ana", 3200.0, 55555, "noite", 150.0);
        administrativo.exibirDados();
        System.out.println("-----------------------------\n");
    }
    
}
