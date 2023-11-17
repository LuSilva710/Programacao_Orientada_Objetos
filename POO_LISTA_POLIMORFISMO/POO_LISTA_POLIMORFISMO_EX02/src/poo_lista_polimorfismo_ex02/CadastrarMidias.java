package poo_lista_polimorfismo_ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarMidias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Midia> catalogo = new ArrayList<>();
        Midia midia = null;
        int escolha;

        do {
            System.out.println("Escolhe um tipo de mídia: ");
            System.out.println("0 - Sair | 1 - CD | 2 - DVD ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    midia = criarCD();
                    catalogo.add(midia);
                    break;
                case 2:
                    midia = criarDVD();
                    catalogo.add(midia);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            if (escolha != 0 && midia != null) {
                midia.exibirDados();
            }

        } while (escolha != 0);

        for (Midia m : catalogo) {
            m.exibirDados();
        }
    }

    private static CD criarCD() {
        System.out.println("Novo CD");
        CD cd = new CD();
        cd.inserirDados();
        return cd;
    }

    private static DVD criarDVD() {
        System.out.println("Novo DVD");
        DVD dvd = new DVD();
        dvd.inserirDados();
        return dvd;
    }
}
