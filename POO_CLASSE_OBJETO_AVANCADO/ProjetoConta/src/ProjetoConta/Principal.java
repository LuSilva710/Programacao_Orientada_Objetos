//Terceiro Construtor : Criar contrutor Cliente com random para titular e inicializar saldo com 0;
package ProjetoConta;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        //Continuar com a operação escolhida
        do {
            System.out.println("Ola! Informe a operacao a ser realizada: ");
            System.out.println("1- Criar nova conta | 2 - Consultar Saldo | 3 - Sacar | 4 - Depositar | 5 - Transferir | 0 - Finalizar ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    criarNovaConta();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    depositar();
                    break;

                case 5:
                    transferir();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    //Metodo para especificar  qual tipo de conta será criada
    public static void criarNovaConta() {
        System.out.println("Deseja criar uma conta especial? (Digite 'E' para Conta Especial ou 'N' para Conta Normal): ");
        String resposta = teclado.next();

        if (resposta.equalsIgnoreCase("N")) {
            criarContaAleatoria();
        } else if (resposta.equalsIgnoreCase("E")) {
            criarContaPersonalizada();
        } else {
            System.out.println("Opção inválida.");
        }
    }
    
    // Metodo para criar uma conta com número aleatório e saldo 0.0
    public static void criarContaAleatoria() {
        Cliente cli = cadastrarCliente();
        Conta conta = new Conta(cli); 
        contasBancarias.add(conta);
        System.out.println("Conta criada com sucesso! O número da conta é: " + conta.getNumero());
    }
    
    // Metodo para criar uma conta personalizada, solicitando numero de conta e saldo inicial
    public static void criarContaPersonalizada() {
        Conta conta = cadastrarConta();
        contasBancarias.add(conta);
        System.out.println("Conta criada com sucesso!");
    }

    // Metodo para atribuir novos valores aos atributos da classe Conta
    public static Conta cadastrarConta() {
        System.out.println("Informe o nº da conta: ");
        int numeroConta = teclado.nextInt();
        System.out.println("Informe o saldo inicial: ");
        double saldo = teclado.nextDouble();

        Cliente cli = cadastrarCliente();
        return new Conta(numeroConta, cli, saldo);
    }

    // Método para cadastrar cliente
    public static Cliente cadastrarCliente() {
        System.out.println("Informe o nome do cliente: ");
        String nome = teclado.next();
        System.out.println("Informe o CPF do cliente: ");
        String cpf = teclado.next();

        return new Cliente(nome, cpf);
    }

    public static void consultarSaldo() {
        if (contasBancarias.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        System.out.println("Informe o número da conta:");
        int numeroConta = teclado.nextInt();

        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            System.out.println("Saldo da conta: R$" + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void sacar() {
        if (contasBancarias.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        System.out.println("Informe o número da conta:");
        int numeroConta = teclado.nextInt();

        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            System.out.println("Informe o valor a ser sacado:");
            double valorSaque = teclado.nextDouble();

            if (conta.sacar(valorSaque)) {
                System.out.println("Saque realizado com sucesso!" );
                
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
            System.out.println("Saldo atual: R$" + conta.getSaldo());
    }

    public static void depositar() {
        if (contasBancarias.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        System.out.println("Informe o número da conta:");
        int numeroConta = teclado.nextInt();

        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            System.out.println("Informe o valor a ser depositado:");
            double valorDeposito = teclado.nextDouble();

            if (valorDeposito > 0) {
                conta.depositar(valorDeposito);
                System.out.println("Depósito realizado com sucesso!");
                System.out.println("Saldo atual: R$" + conta.getSaldo());
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void transferir() {
        if (contasBancarias.size() < 2) {
            System.out.println("É necessário pelo menos duas contas para fazer uma transferência.");
            return;
        }

        System.out.println("Informe o número da conta de origem:");
        int contaOrigem = teclado.nextInt();
        System.out.println("Informe o número da conta de destino:");
        int contaDestino = teclado.nextInt();

        Conta contaOrigemObj = encontrarConta(contaOrigem);
        Conta contaDestinoObj = encontrarConta(contaDestino);

        if (contaOrigemObj != null && contaDestinoObj != null) {
            System.out.println("Informe o valor da transferência:");
            double valorTransferencia = teclado.nextDouble();

            if (valorTransferencia > 0) {
                if (contaOrigemObj.transferir(contaDestinoObj, valorTransferencia)) {
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Saldo da conta de origem: R$" + contaOrigemObj.getSaldo());
                    System.out.println("Saldo da conta de destino: R$" + contaDestinoObj.getSaldo());
                } else {
                    System.out.println("Saldo insuficiente para a transferência.");
                }
            } else {
                System.out.println("Valor de transferência inválido.");
            }
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }

    public static Conta encontrarConta(int numeroConta) {
        for (Conta conta : contasBancarias) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}

/*  

     
  
        // Verificar qual conta corresponde ao número do titular
        Conta contaSelecionada = null;

        if (c1.getNumero() == numeroTitular) {
            contaSelecionada = c1;
        } else if (c2.getNumero() == numeroTitular) {
            contaSelecionada = c2;
        }
        if (contaSelecionada == null) {
            System.out.println("Número do titular não encontrado.");
        } else {

        
            System.out.println("Ola " + contaSelecionada.getTitular().getNome()
                    + "! Informe a operacao a ser realizada:"
                    + "\n1- Criar nova conta | 2 - Consultar Saldo | 3 - Sacar | 4 - Depositar | 5 - Transferir | 0 - Finalizar: ");
            int opcao = teclado.nextInt();
            

            // Escolher operação a ser realizada
           
 */
