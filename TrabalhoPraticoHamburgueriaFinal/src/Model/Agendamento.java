package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {

    private int id;
    private Cliente cliente;
    private String pedido;
    private int quantidade;
    private double valor;
    private String formaPagamento;
    private Date data;
    private String observacao;

    //CONSTRUTORES
    public Agendamento(Cliente cliente, String pedido, int quantidade, double valor, String formaPagamento, String data) throws ParseException {
        this.cliente = cliente;
        this.pedido = pedido;
        this.quantidade = quantidade;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
    }

    public Agendamento(Cliente cliente, String pedido, int quantidade, double valor, String formaPagamento, String data, String observacao) throws ParseException {
        this(cliente, pedido, quantidade, valor, formaPagamento, data);
        this.observacao = observacao;
    }

    //METODOS GETTER E SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorTotal() {
        double valorTotal = this.valor * this.quantidade;
        return valorTotal;
    }

    public Date getData() {
        return data;
    }

    public String getDataFormatada() {
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }

    public String getHoraFormatada() {
        return new SimpleDateFormat("HH:mm").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
