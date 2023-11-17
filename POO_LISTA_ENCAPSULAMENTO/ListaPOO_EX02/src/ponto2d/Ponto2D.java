/*
* Escreva uma classe Ponto2D que represente um ponto no plano
* cartesiano. Além dos atributos por você identificados, a classe
* deve oferecer os seguintes membros:
* a) Construtores sobrecarregados que permitam a inicialização do ponto:
* i) Por default (sem parâmetros) na origem do espaço 2D;
* ii) Num local indicado por dois parâmetros do tipo double
* (indicando o valor de abcissa e ordenada do ponto que está sendo criado);
* iii) Em um local indicado por outro ponto.
* b) Métodos de acesso (getter/setter) dos atributos do ponto;
* c) Métodos sobrecarregados de movimentação do ponto com os mesmos
* parâmetros indicados para os construtores;
* d) Método de comparação semântica do ponto (equals);
* e) Método de representação do objeto como String;
* f) Método que permita calcular a distância do ponto que recebe a
* mensagem, para outro ponto;
* g) Método que permita a criação de um novo ponto no mesmo local do
* ponto que recebeu a mensagem (clone);
 */
package ponto2d;

public class Ponto2D {
    private double x;
    private double y;

    // CONSTRUTOR DEFAULT 
    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // CONSTRUTOR COM PARAMETROS  - SOBRECARGA
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D obj) {
        this.x = obj.getX();
        this.y = obj.getY();
    }

    // MÉTODOS GETTER E SETTER
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // MÉTODO DE MOVIMENTAÇÃO - SOBRECARGA
    public void movimentar() {
        this.x = 0;
        this.y = 0;
    }

    public void movimentar(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void movimentar(Ponto2D obj) {
        this.x = obj.getX();
        this.y = obj.getY();
    }

    // MÉTODO COMPARAR SEMÂNTICA
    public boolean equals(Ponto2D obj) {
        return (this.x == obj.getX() && this.y == obj.getY());
    }

    // MÉTODO CONVERTER PARA STRING
    public String toString() {
        return "X: " + this.x + "| Y:" + this.y;
    } 
    
    //Casting - Herança
    //public boolean equals(Oject obj) {
    //Ponto2D p = (Ponto2D) obj
    //    return (this.x == obj.getX() && this.y == obj.getY());
    
    
    // MÉTODO CALCULA DISTÂNCIA DOS PONTOS 
    public double distancia(Ponto2D obj) {
        double distanciaX = this.x - obj.x;
        double distanciaY = this.y - obj.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    // MÉTODO CLONE
    public Ponto2D clone() {
        return new Ponto2D(this);
    }
}

