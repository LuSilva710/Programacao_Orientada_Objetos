package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agendamento {

    private int id;
    private Cliente cliente;
    private String email;
    private Pedido pedido;
    private int quantidade;
    private double valor;
    private String formaPagamento;
    private Date data;
    private String observacao;

    //CONSTRUTORES
     public Agendamento(Cliente cliente, String email, Pedido pedido, int quantidade, double valor, String formaPagamento, String data) {
        this.cliente = cliente;
        this.email = email;
        this.pedido = pedido;
        this.quantidade = quantidade;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Agendamento(Cliente cliente, String email, Pedido pedido, int quantidade, double valor, String formaPagamento, String data, String observacao) {
        this(cliente, email, pedido, quantidade, valor, formaPagamento, data);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
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
