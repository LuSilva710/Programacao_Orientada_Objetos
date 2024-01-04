package poo_questao01;

public class Linha extends Forma {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Linha() {
    }
    
    public Linha(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public void desenhar() {
        System.out.println("Linha");
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
        return "Linha - Pontos: " + "x1= " + x1 + ", x2= " + x2 + ", y1= " + y1 + ", y2= " + y2;
    }
}
