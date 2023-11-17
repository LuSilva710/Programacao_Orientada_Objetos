package poo_heranca_ex02_b;

public class Principal {

    public static void main(String[] args) {
        Rica pessoaRica = new Rica("Herdeiro_Mauricio", 18);
        Pobre pessoaPobre = new Pobre("Morcego", 30);
        Miseravel pessoaMiseravel = new Miseravel("Zé", 30);
        
        System.out.println("Pessoa rica: " + pessoaRica.getNome() + ", " + pessoaRica.getIdade() + " anos, " + pessoaRica.fazCompras());
        System.out.println("Pessoa pobre: " + pessoaPobre.getNome() + ", " + pessoaPobre.getIdade() + " anos, " + pessoaPobre.trabalha());
        System.out.println("Pessoa miseravel: " + pessoaMiseravel.getNome()  + ", " + pessoaMiseravel.getIdade() + " anos, " + pessoaMiseravel.mendiga());
    }
}
