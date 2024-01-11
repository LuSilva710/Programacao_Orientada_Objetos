/*
 * Escreva uma classe NumeroComplexo, que representa um número
* complexo. A classe deve fornecer as seguintes operações:
* a) Construtor com valores das partes inteira e fracionária;
* b) Métodos getter/setter para os atributos da parte inteira e parte
* imaginária;
* c) Método somar, que recebe outro número complexo e o adiciona ao
* número complexo que recebeu a mensagem. (a+bi)+(c+di) = (a+c)+(b+d)i;
* d) Método subtrair, que recebe outro número complexo e o subtrai do
* número complexo que recebeu a mensagem. (a+bi)−(c+di) = (a−c)+(b−d)i;
* e) Método multiplicar, que recebe outro número complexo e o 
* multiplica ao complexo que recebeu a mensagem: (a+bi) * (c+di) = (ac−bd)+(ad+bc)i;
* f) Método dividir, que recebe outro número complexo e o divide ao
* complexo que recebeu a mensagem: (a+bi) / (c+di) = (ac+bd)/(c2 +d2 ) + (bc-ad)/(c2 + d2)i;
* g) Um método de comparação semântica dos números complexos;
* h) Um método que gere e retorne a representação string do número
* complexo;
* i) Um método que retorne o módulo do número complexo.
 */
package listapoo_ex03;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    // MÉTODO CONSTRUTOR
    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // MÉTODOS GETTER E SETTER
    public double getParteReal() {
        return this.parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return this.parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    // MÉTODO SOMAR
    public void somar(NumeroComplexo novoNumero) {
        this.parteReal += novoNumero.getParteReal();
        this.parteImaginaria += novoNumero.getParteImaginaria();
    }

    // MÉTODO SUBTRAIR
    public void subtrair(NumeroComplexo novoNumero) {
        this.parteReal += novoNumero.getParteReal();
        this.parteImaginaria += novoNumero.getParteImaginaria();
    }

    // MÉTODO MULTIPLICAR
    public void multiplicar(NumeroComplexo novoNumero) {
        this.parteReal += novoNumero.getParteReal();
        this.parteImaginaria += novoNumero.getParteImaginaria();
    }

    // MÉTODO DIVIDIR
    public void dividir(NumeroComplexo novoNumero) {
        this.parteReal += novoNumero.getParteReal();
        this.parteImaginaria += novoNumero.getParteImaginaria();
    }

    // MÉTODO COMPARAR SEMÂNTICA
    public boolean comparar(NumeroComplexo novoNumero) {
        return (this.parteReal == novoNumero.getParteReal() && this.parteImaginaria == novoNumero.getParteImaginaria());
    }

    // MÉTODO CONVERTER PARA STRING
    public String converter(NumeroComplexo numero) {
        return this.parteReal + " + " + this.parteImaginaria + "i";
    }

    // MÉTODO RETORNA MODULO
    public double retornarModulo() {
        return Math.sqrt(parteReal * parteReal + parteImaginaria * parteImaginaria);
    }
}
