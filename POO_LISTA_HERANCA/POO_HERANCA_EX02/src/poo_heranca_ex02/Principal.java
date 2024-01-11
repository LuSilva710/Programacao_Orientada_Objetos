package poo_heranca_ex02;

public class Principal {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Yoko", "Akita");
        Gato g1 = new Gato("Zé", "Vira-lata");

        System.out.println("Cachorro: " + c1.caminhar());
        System.out.println("Cachorro: " +c1.latir());

        System.out.println("Gato: " +g1.caminhar());
        System.out.println("Gato: " +g1.miar());
    }
}
