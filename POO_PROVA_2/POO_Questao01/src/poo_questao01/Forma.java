package poo_questao01;

public abstract class Forma implements Renderizavel {

    public abstract void desenhar();

    public abstract void aumentar(int t);

// Abstract não precisa implementar
//    @Override
//    public void renderizar() {
//        System.out.println("Objeto foi renderizado.");
//    }

}
