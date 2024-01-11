/*
 * ) Escreva uma classe que represente uma reta (y=ax+b).
* Forneça os seguintes membros de classe:
* a) Construtores sobrecarregados que criem uma reta a partir de:
* i) Dois valores, representando o coeficiente angular e o coeficiente linear da reta;
* ii) Dois pontos;
* b) Métodos de acesso para o coeficiente angular e para o coeficiente linear da reta;
* c) Um método que verifique se um ponto dado pertence a reta;
* d) Um método que gere e retorne a representação String da reta;
* e) Um método que dada uma outra reta, retorne o ponto de interseção
* da reta dada ou null se as retas forem paralelas.
 */
package listapoo_ex04;

public class Reta {

    private double coeficienteAngular;
    private double coeficienteLinear;

    //MÉTODO CONSTRUTOR
    public Reta(double coeficienteAngular, double coeficienteLinear) {
        this.coeficienteAngular = coeficienteAngular;
        this.coeficienteLinear = coeficienteLinear;
    }

    public Reta(Ponto2D ponto1, Ponto2D ponto2) {
        this.coeficienteAngular = (ponto2.getValorX() - ponto1.getValorY()) / (ponto2.getValorY() - ponto1.getValorY());;
        this.coeficienteLinear = ponto1.getValorY() - this.coeficienteAngular * ponto1.getValorX();
    }

    //MÉTODOS GETTER E SETTER
    public double getCoeficienteAngular() {
        return coeficienteAngular;
    }

    public void setCoeficienteAngular(double coeficienteAngular) {
        this.coeficienteAngular = coeficienteAngular;
    }

    public double getCoeficienteLinear() {
        return coeficienteLinear;
    }

    public void setCoeficienteLinear(double coeficienteLinear) {
        this.coeficienteLinear = coeficienteLinear;
    }

    // MÉTODO VERIFICAR PONTO 
    public boolean verificarPonto(Ponto2D ponto1, Ponto2D ponto2) {
        return (ponto1.getValorX() == ponto2.getValorX() && ponto1.getValorY() == ponto2.getValorY());
    }

    // MÉTODO CONVERTER PARA STRING
    public String converter() {
        return "y= " + this.coeficienteAngular + "x + " + this.coeficienteLinear;
    }

    // MÉTODO retornar interseção da reta
    public Ponto2D verificarIntersecao(Reta novaReta) {
        if (this.coeficienteAngular == novaReta.coeficienteAngular) {
            return null;
        } 
            double x = (novaReta.coeficienteLinear - this.coeficienteLinear) / (this.coeficienteAngular - novaReta.coeficienteAngular);
            double y = this.coeficienteAngular * x + this.coeficienteLinear;

            return new Ponto2D(x, y);
        }
    }

