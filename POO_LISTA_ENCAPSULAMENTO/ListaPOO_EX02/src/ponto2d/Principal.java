package ponto2d;

public class Principal {

    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D(5.0, 12.0);
        Ponto2D p3 = new Ponto2D(p2);

        if  (p2.equals(p3)) {  // (p2 == p3) {
            System.out.println("Iguais!");
        } else {
            System.out.println("Diferente!");
        }

        p1.movimentar();
        System.out.println(p1.getX() + " " + p1.getY());
        p1.movimentar(-4.5, 6);
        System.out.println(p1.getX() + " " + p1.getY());

        
        System.out.println(p1.toString());
    }

}
