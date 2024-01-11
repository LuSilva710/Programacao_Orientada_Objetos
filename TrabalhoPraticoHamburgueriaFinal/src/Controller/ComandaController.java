package Controller;

import Controller.Helper.ComandaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.PedidoDAO;
import Model.Pedido;
import View.Comanda;
import View.MenuPrincipal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ComandaController {

    private final Comanda view;
    private final ComandaHelper helper;

    public ComandaController(Comanda view) {
        this.view = view;
        this.helper = new ComandaHelper(view);
    }

    public void navegarMenuPrincipal() {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
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

    public void agendar() {
        // busca objeto na tela
        Agendamento agendamento = helper.obterModelo();
        if (agendamento != null) {
            // salva objeto no Banco de Dados
            new AgendamentoDAO().insert(agendamento);

            // inserir elemento na tabela
            atualizarTabela();
            helper.limparTela();
        } else {
            JOptionPane.showMessageDialog(view, "Houve um problema ao criar o agendamento. Por favor, verifique os dados de entrada.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void preencherTabelaPedidos(List<Pedido> pedidos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTablePedidos().getModel();
        tableModel.setNumRows(0);

        for (Pedido pedido : pedidos) {
            tableModel.addRow(new Object[]{
                pedido.getNome(),
                pedido.getQuantidade(),
                pedido.getValorTotal()
            });
        }
    }
}
