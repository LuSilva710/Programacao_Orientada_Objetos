/*
 Crie uma classe chamada Item que uma loja de suprimentos de informática possa utilizar
para representar uma fatura de um item vendido na loja. 
Um Item faturado deve ter quatroatributos: código, descrição, 
quantidade comprada do item, preço do item. 
Sua classe devefornecer métodos get e set para cada um dos atributos. 
Forneça tambémummétodochamado getTotal que calcula e retorna o total a pagar sobre 
o item faturado (ou seja, quantidade * preço). Se a quantidade não for positiva, 
deve ser configurada como zero.
Idem para preço. Escreva um programa que teste a classe Item. */
package loja_suprimento;

public class Item {

    private int codigo;
    private String descricao;
    private int quantidade;
    private double valor_item;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public double getValor_item() {
        return valor_item;
    }

    public void setValor_item(double valor_item) {
         if (valor_item < 0) {
            this.valor_item = 0.0;
        } else {
            this.valor_item = valor_item;
        }
    }

    public double getTotal() {
           return quantidade * valor_item;
        }
    }


