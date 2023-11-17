package ProjetoConta;

import java.util.Random;
import java.util.Scanner;

public class Conta {

    //atributos
    private int numero;
    private Cliente titular; // composicionalidade de objetos
    private double saldo;

    // Construtor de classe personalizada
    public Conta(int num, Cliente cl, double s) {
        this.numero = num;
        this.titular = cl;
        setSaldo(s);  //Método para verificar se saldo é negativo
    }
    
     // Construtor de classe padrão
    public Conta(Cliente cli) {
        this.numero = geraNumeroContaAleatorio();
        this.titular = cli;
        this.saldo = 0.00; // Inicialize o saldo com 0.00
    }
    
    // Método para gerar número de conta aleatório
    private int geraNumeroContaAleatorio() {
        int minValor = 1000;
        int maxValor = 9999;
        Random ran = new Random();
        return ran.nextInt(maxValor - minValor + 1) + minValor;
    }

    //metodos Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente cl) {
        this.titular = cl;
    }

    public double getSaldo() {
        return this.saldo;
    }

    //Métodos para tornar atributos público
    
    public void setSaldo(double s) {
        if (s >= 0) {
            this.saldo = s;
        } else {
            this.saldo = 0;
            System.out.println("Valor inserido é inválido!");
        }
    }

    public boolean sacar(double valorSaque) {
        if ((this.saldo >= valorSaque) && (valorSaque > 0)) {
            this.saldo -= valorSaque;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            this.saldo += valorDepositado;
        } else {
            System.out.println("Impossivel realizar depósito! ");
        }
    }

    public boolean transferir(Conta contaDestino, double transferencia) {
    if (this.sacar(transferencia)) {
        contaDestino.depositar(transferencia);
        return true;
    } else {
        return false;
    }
}
}