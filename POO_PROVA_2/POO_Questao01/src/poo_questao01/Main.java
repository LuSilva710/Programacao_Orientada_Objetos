package poo_questao01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        int soma = 0;

        Poligono poligono1 = new Poligono(-4);
        Poligono poligono2 = new Poligono(6);
        Poligono poligono3 = new Poligono(8);

        Linha linha1 = new Linha(1, 2, 3, 4);
        Linha linha2 = new Linha(5, 6, 7, 8);
        Linha linha3 = new Linha(9, 10, 11, 12);

        formas.add(poligono1);
        formas.add(poligono2);
        formas.add(poligono3);
        formas.add(linha1);
        formas.add(linha2);
        formas.add(linha3);

        for (Forma forma : formas) {
            System.out.println(forma.toString());

            if (forma instanceof Poligono) {
                soma += ((Poligono)forma).getLados();
            }
        }
        System.out.println("Soma de lados: " + soma);
    }
}
