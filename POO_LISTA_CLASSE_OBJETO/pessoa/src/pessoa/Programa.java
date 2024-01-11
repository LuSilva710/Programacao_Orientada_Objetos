package pessoa;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa albertEinstein = new Pessoa();
        albertEinstein.nome = "Albert Einstein";
        albertEinstein.dia = 14;
        albertEinstein.mes = 3;
        albertEinstein.ano = 1879;

        Pessoa isaacNewton = new Pessoa();
        isaacNewton.nome = "Isaac Newton";
        isaacNewton.dia = 4;
        isaacNewton.mes = 1;
        isaacNewton.ano = 1643;
        
        System.out.println("Data Atual (dia/mês/ano):");
        int diaAtual = teclado.nextInt();
        int mesAtual = teclado.nextInt();
        int anoAtual = teclado.nextInt();

        albertEinstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        System.out.println("Nome: " + albertEinstein.informaNome());
        System.out.println("Idade: " + albertEinstein.informaIdade() + " anos");

        isaacNewton.calculaIdade(diaAtual, mesAtual, anoAtual);
        System.out.println("Nome: " + isaacNewton.informaNome());
        System.out.println("Idade: " + isaacNewton.informaIdade() + " anos");
   
    }
}
