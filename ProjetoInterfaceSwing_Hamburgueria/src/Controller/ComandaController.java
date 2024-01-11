package Controller;

import Controller.Helper.ComandaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.PedidoDAO;
import Model.Pedido;
import View.Comanda;
import java.util.ArrayList;

public class ComandaController {

    private final Comanda view;
    private final ComandaHelper helper;

    public ComandaController(Comanda view) {
        this.view = view;
        this.helper = new ComandaHelper(view);
    }

    public void atualizarTabela() {
        // buscar lista de agendamento em Banco
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();

        // exibir lista
        helper.preencherTabela(agendamentos);
    }

    public void atualizaCliente() {
        // Buscar cliente no Banco
        // Exibir cliente no ComboBox
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();

        helper.preencherCliente(clientes);
    }

    public void atualizaPedido() {
        PedidoDAO pedidoDAO = new PedidoDAO();
        ArrayList<Pedido> pedidos = pedidoDAO.selectAll();

        helper.preencherPedido(pedidos);
    }

    public void atualizaValor() {
        Pedido pedido = helper.obterPedido();
        helper.setarValor(pedido.getValor());
    }

    public void agendar() {
        // busca objeto na tela
        Agendamento agendamento = helper.obterModelo();
        // salva objeto no Banco de Dados
        new AgendamentoDAO().insert(agendamento);
        
        // inserir elemento na tabela
        atualizarTabela();
        helper.limparTela();
    }
}
