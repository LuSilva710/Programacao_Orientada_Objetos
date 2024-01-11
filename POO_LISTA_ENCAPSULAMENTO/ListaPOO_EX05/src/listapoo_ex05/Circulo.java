/*
* Escreva uma classe que represente um circulo no plano
* cartesiano. Forneça os seguintes membros de classe:
* a) Um construtor que receba o raio e um ponto (o centro do círculo);
* b) Um construtor que receba o raio e posicione o círculo na origem do espaço cartesiano;
* c) Métodos de acesso ao atributo raio do círculo;
* d) Métodos inflar e desinflar, que, respectivamente, aumentam e
* diminuem o raio do círculo de um dado valor;
* e) Métodos sobrecarregados, inflar e desinflar, que,
* respectivamente, aumentam e diminuem o raio do círculo de uma unidade;
* h) Métodos sobrecarregados mover, que:
* i) por default (sem parâmetros) levam o círculo para a origem do espaço 2D;
* ii) movem o círculo para um local indicado por dois parâmetros
* do tipo double (indicando o valor de abcissa e ordenada do
* ponto para onde o círculo se move);
* iii) movem o círculo para o local indicado por outro ponto.
* f) Método que retorna a área do círculo
* 
 */
package listapoo_ex05;

public class Circulo {
    private double raio; // diametro/2 
    private double pontoX;
    private double pontoY;

    // CONSTRUTOR COM PARAMETROS (RAIO E PONTO CENTRAL CIRCULO)
    public Circulo(double novoRaio, double novoPontoX, double novoPontoY) {
        this.raio = novoRaio;
        this.pontoX = novoPontoX;
        this.pontoY = novoPontoY;
    }

    // CONSTRUTOR COM PARAMETROS (RAIO E PONTO ORIGEM)
    public Circulo(double novoRaio) {
        this.raio = novoRaio;
        this.pontoX = 0.0;
        this.pontoY = 0.0;
    }

    // MÉTODOS GETTER E SETTER
    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // MÉTODOS AUMENTAR/DIMINUIR RAIO
    public void aumentarRaio(double incremento) {
        this.raio += incremento;
    }

    public void diminuirRaio(double decremento) {
        this.raio -= decremento;
    }

    // MÉTODOS AUMENTAR/DIMINUIR RAIO (SOBRECARGA)
    public void aumentarRaio() {
        raio++;
    }

    public void diminuirRaio() {
        raio--;
    }

    // MÉTODO MOVER (SOBRECARREGADO)
    public void mover() {
        this.pontoX = 0.0;
        this.pontoY = 0.0;
    }

    public void mover(double novoPontoX, double novoPontoY) {
        this.pontoX = novoPontoX;
        this.pontoY = novoPontoY;
    }
    
    public void mover(Ponto novoPonto){
        this.pontoX = novoPonto.x;
        this.pontoY = novoPonto.y;
    }
    
    // MÉTODO CALCULA E RETORNA ÁREA DO CÍRCULO
    public double calcularArea(){
        return Math.PI * Math.pow(raio,2);
    }

    
    

}
