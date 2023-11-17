package pessoa;

import java.util.Scanner;

public class Pessoa {

    int idade;
    int dia;
    int mes;
    int ano;
    String nome;

    void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - ano;
        if (mesAtual < mes || (mesAtual == mes && diaAtual < dia)) {
            idade --; // Ajuste caso o aniversário ainda não tenha ocorrido no ano atual
        }
    }

    int informaIdade() {
        return idade;
    }

    String informaNome() {
        return nome;
    }

    void ajustaDataDeNascimento(int novoDia, int novoMes, int novoAno) {
        dia = novoDia;
        mes = novoMes;
        ano = novoAno;
    }
}