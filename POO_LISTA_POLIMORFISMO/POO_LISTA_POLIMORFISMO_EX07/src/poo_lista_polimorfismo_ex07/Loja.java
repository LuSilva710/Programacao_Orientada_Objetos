package poo_lista_polimorfismo_ex07;

public class Loja {

    public static void main(String[] args) {
        Item produtos[] = new Item[5];

        produtos[0] = new CDs("AC/DC", 18, "00000001", 12);
        produtos[1] = new Livro("Harry Potter e a Pedra Filosofal", 149.90, "0000151", "J. K. Howling");
        produtos[2] = new Livro("Harry Potter e a Câmara Secreta", 149.90, "0000152", "J. K. Howling");
        produtos[3] = new Livro("Harry Potter e a o Prisioneiro de Azkaban", 149.90, "0000153", "J. K. Howling");
        produtos[4] = new DVDs("Harry Potter e a Pedra Filosofal", 25, "000000452", 135);

        for (Item produto : produtos) {
            System.out.println(produto + "\n");
        }
        
        for (int indiceProduto1 = 0; indiceProduto1 < produtos.length; indiceProduto1++) {
            for (int indiceProduto2 = indiceProduto1 + 1; indiceProduto2  < produtos.length; indiceProduto2 ++) {
                if (produtos[indiceProduto1].equals(produtos[indiceProduto2])) {
                    System.out.println("Os produtos " + indiceProduto1 + " e " + indiceProduto2  + " são iguais.");
                }
            }
        }
    }
}
