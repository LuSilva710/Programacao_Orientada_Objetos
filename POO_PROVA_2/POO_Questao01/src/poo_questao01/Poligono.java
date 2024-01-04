package poo_questao01;

public class Poligono extends Forma {
    private int lados;

    public Poligono() {
    }

    public Poligono(int lados) {
        this.setLados(lados);
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        try {
            if (lados < 0) {
                throw new IllegalArgumentException("Valor inválido."); 
            }
            this.lados = lados;
        } catch (IllegalArgumentException er) {
            System.out.println(er.getMessage());
            // er.printStackTrace() --> indica linha do erro
            this.lados = 0;
        }
    }

    public void pintar(int cor) {
        System.out.println("Exibindo a cor: " + cor);
    }

    @Override
    public void desenhar() {
        System.out.println("Poligono");
    }

    @Override
    public void aumentar(int t) {
        System.out.println("O valor do argumento t é: " + t);
    }

    @Override
    public void renderizar() {
        System.out.println("O objeto foi renderizado.");
    }

    @Override
    public String toString() {
        return "Poligono - nº de lados: " + lados;
    }

}
