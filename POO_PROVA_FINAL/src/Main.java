
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();


        int opcao;
        do {
            System.out.println("Olá! Informe o produto a ser cadastrado:");
            System.out.println("1 - Revista | 2 - Revista Digital | 3 - Livro | 0 - Sair");

            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Informe o ISSN: ");
                    String issn = teclado.next();
                    System.out.println("Informe a descrição: ");
                    String descricao = teclado.next();
                    if (descricao == null) {
                        throw new NullPointerException("Descrição inválida!");
                    }

                    Revista revista1 = new Revista(issn, descricao);
                    produtos.add(revista1);
                    break;
                }
                case 2: {
                    System.out.println("Informe o DOI: ");
                    String doi = teclado.next();
                    System.out.println("Informe o nome do assinante: ");
                    String assinante = teclado.next();
                    System.out.println("Informe o ISSN: ");
                    String issn = teclado.next();
                    System.out.println("Informe a descrição: ");
                    String descricao = teclado.next();
                    if (descricao == null) {
                        throw new NullPointerException("Descrição inválida!");
                    }

                    RevistaDigital revistadig1 = new RevistaDigital(doi, assinante, issn, descricao);
                    produtos.add(revistadig1);
                    break;
                }
                case 3:
                    System.out.println("Informe o ISBN: ");
                    String isbn = teclado.next();
                    System.out.println("Informe a descrição: ");
                    String descricao = teclado.next();
                    if (descricao == null) {
                        throw new NullPointerException("Descrição inválida!");
                    }
                    Livro livro1 = new Livro(isbn, descricao);
                    produtos.add(livro1);

                    break;

                default:
                    break;
            }

        } while (opcao != 0);

        for (Produto produto : produtos) {

            if (produto instanceof RevistaDigital) {
                String s = JOptionPane.showInputDialog("Revista Digital - Informe o nome do usuário: ");
                if (((RevistaDigital) produto).autenticar(s)) {
                    JOptionPane.showMessageDialog(null, "Usuário liberado!");
                    JOptionPane.showMessageDialog(null, produto.mostrarDados());
                } else {
                    System.out.println("Acesso negado!");
                }
            } else {
                JOptionPane.showMessageDialog(null, produto.mostrarDados());
            }
        }

    }
}
