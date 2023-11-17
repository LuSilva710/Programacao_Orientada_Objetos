/*
 * Escreva uma classe que represente um país. Um país é representado
através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.:
Brasil), população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.:
8.515.767,049). Além disso, cada país mantém uma lista de outros
países com os quais ele faz fronteira. Escreva a classe em Java e
forneça os seus membros a seguir:
a) Construtor que inicialize o código ISO, o nome e a dimensão do país;
b) Métodos de acesso (getter/setter) para as propriedades código
ISSO, nome, população e dimensão do país;
c) Um método que permita verificar se dois objetos representam o
mesmo país (igualdade semântica). Dois países são iguais se
tiverem o mesmo código ISO;
d) Um método que informe se outro país é limítrofe do país que
recebeu a mensagem;
e) Um método que retorne a densidade populacional do país;
f) Um método que receba um país como parâmetro e retorne a lista de
vizinhos comuns aos dois países.
Considere que um país tem no máximo 40 outros países com os quais ele
faz fronteira.
 */
package listapoo_ex06;

import java.util.ArrayList;

public class Pais {

    private String codigoISO;
    private String nome;
    private int populacao;
    private double dimensao;
    private ArrayList<Pais> paisesFronteira = new ArrayList<>();

    // MÉTODO CONSTRUTOR
    public Pais(String novoCodigoISO, String novoNome, double novaDimensao) {
        this.codigoISO = novoCodigoISO;
        this.nome = novoNome;
        this.dimensao = novaDimensao;
    }

    // MÉTODOS GETTER E SETTER
    public String getCodigoISO() {
        return this.codigoISO;
    }

    public void setCodigoISO(String novoCodigoISO) {
        this.codigoISO = novoCodigoISO;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getPopulacao() {
        return this.populacao;
    }

    public void setPopulacao(int novaPopulacao) {
        this.populacao = novaPopulacao;
    }

    public double getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(double novaDimensao) {
        this.dimensao = novaDimensao;
    }

    // MÉTODO COMPARAR SEMÂNTICA
    public boolean compararPaises(Pais novoPais) {
        return (this.codigoISO.equals(novoPais.getCodigoISO()));
    }

    // MÉTODO PARA ADICIONAR PAÍSES NA LISTA DE FRONTEIRAS
    public void adicionarFronteira(Pais novoPais) {
       if (this.paisesFronteira.size() >= 40) {
        System.out.println("Este país já atingiu o limite máximo de 40 fronteiras.");
    } else if (!this.paisesFronteira.contains(novoPais)) {
        this.paisesFronteira.add(novoPais);
        novoPais.adicionarFronteira(this);
    }
}

    // MÉTODO RETORNA DENSIDADE POPULACIONAL
    public double verificarDensidadePopulacional() {
        if (this.dimensao == 0) {
            return 0;
        } else {
            return this.populacao / this.dimensao;
        }
    }

    // MÉTODO RETORNAR VIZINHOS COMUNS DE PAISES
    public ArrayList<Pais> verificarVizinhosComuns(Pais outroPais) {
        ArrayList<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais pais : this.paisesFronteira) {
            if (outroPais.paisesFronteira.contains(pais)) {
                vizinhosComuns.add(pais);
            }
        }
        return vizinhosComuns;
    }

}
