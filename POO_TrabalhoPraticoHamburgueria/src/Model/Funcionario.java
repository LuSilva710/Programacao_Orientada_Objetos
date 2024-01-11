package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Funcionario extends Usuario implements Cadastro {
    
    static List<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(String nome, int senha, String telefone) {
        super(nome, senha, telefone);
    }

    public Funcionario(String nome, int senha, String telefone, String nivelAcesso) {
        super(nome, senha, telefone, nivelAcesso);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getTelefone() {
        return super.getTelefone();
    }

 
    public static void cadastrar(List<Funcionario> funcionarios) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CADASTRO DE FUNCIONÁRIO:");
        System.out.println("\nINFORME SEU NOME:");
        String nome = teclado.nextLine();
        System.out.println("INFORME SUA SENHA:");
        int senha = teclado.nextInt();
        System.out.println("INFORME SEU TELEFONE:");
        String telefone = teclado.next();
        System.out.println("INFORME SEU NIVEL DE ACESSO:");
        teclado.nextLine();
        String nivelAcesso = teclado.nextLine();
        
        Funcionario funcionario = new Funcionario(nome, senha, telefone, nivelAcesso);
        
        funcionarios.add(funcionario);
        System.out.println("CADASTRO REALIZADO COM SUCESSO! \n");
       
    }

    @Override
    public Funcionario autenticar(String nome, int senha) {
        System.out.println("Sou o funcionário " + super.getNome() + " e estou validando minha senha!");
         for (Funcionario funcionario : funcionarios) {
         if (funcionario.getNome().equalsIgnoreCase(funcionario.getNome()) && senha == super.getSenha()) {
            return funcionario;
        } 
         }
            return null;
        }
    }

