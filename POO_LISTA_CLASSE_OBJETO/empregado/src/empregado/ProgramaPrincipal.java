package empregado;

public class ProgramaPrincipal {

    public static void main(String[] args) {
       Empregado c1 = new Empregado();
       
       c1.setNome("João ");
       c1.setSobrenome("Marciano");
       c1.setSalarioMensal(1200.0);
       c1.setConcederAumento(0.10);
       
        System.out.println("Dados Pessoais: " +c1.getDadosPessoais());
        System.out.println("Salário Anual.: R$" + c1.salarioAnual());
        System.out.println("Reajuste......: R$" + c1.getReajusteSalarial());
       
    }
    
}
