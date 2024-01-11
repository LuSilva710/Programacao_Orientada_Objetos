package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Pedido;
import View.Comanda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ComandaHelper implements InterfaceHelper {

    private final Comanda view;

    public ComandaHelper(Comanda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {

        DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
        tableModel.setNumRows(0);

        //Percorrer lista preenchendo tableModel
        for (Agendamento agendamento : agendamentos) {
            Cliente cliente = agendamento.getCliente();
            String pedido = agendamento.getPedido();

            tableModel.addRow(new Object[]{
                agendamento.getId(),
                cliente.getNome(),
                agendamento.getPedido(),
                agendamento.getQuantidade(),
                agendamento.getValorTotal(),
                agendamento.getFormaPagamento(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencherCliente(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();

        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherPedido(ArrayList<Pedido> pedidos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTablePedidos().getModel();
        tableModel.setNumRows(0);

        for (Pedido pedido : pedidos) {
            Object[] rowData = {pedido.getNome(), pedido.getQuantidade(), pedido.getValorTotal()};
            tableModel.addRow(rowData);
        }
    }

    public Cliente obterCliente() {
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();
    }

    public Pedido obterPedidoBebida() {
        return (Pedido) view.getjComboBoxPedido().getSelectedItem();
    }

    public String obterPedido() {
        JTable table = view.getjTablePedidos();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        StringBuilder pedidosString = new StringBuilder();

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String nomePedido = (String) tableModel.getValueAt(i, 0);
            int quantidade = (int) tableModel.getValueAt(i, 1);

            // Concatena os dados em uma string
            pedidosString.append(nomePedido)
                    .append(" (")
                    .append(quantidade)
                    .append(") <br>");
        }

        return "<html>" + pedidosString.toString() + "</html>";
    }

    public String obterFormaPagamento() {
        return (String) view.getjComboBoxPagamento().getSelectedItem();
    }

    public int obterQuantidade() {
        JTable table = view.getjTablePedidos();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        int quantidadeTotal = 0;
        for (int row = 0; row < tableModel.getRowCount(); row++) {
            quantidadeTotal += (int) tableModel.getValueAt(row, 1);
        }

        return quantidadeTotal;
    }

    public double obterValor() {
        JTable table = view.getjTablePedidos();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        double valorTotal = 0.0;

        for (int row = 0; row < tableModel.getRowCount(); row++) {
            valorTotal += (double) tableModel.getValueAt(row, 2);
        }

        return valorTotal;
    }

    // POLIMORFISMO
    @Override
    public Agendamento obterModelo() {

        try {
            Cliente cliente = obterCliente();
            String pedido = obterPedido();
            int quantidade = obterQuantidade();
            double valor = obterValor();
            String formaPagamento = obterFormaPagamento();
            String data = view.getTextData().getText();
            String hora = view.getTextHora().getText();
            //String dataHora = data + " " + hora;
            String observacao = view.getTextAreaObservacao().getText();

            // Verifica se a data ou a hora não estão preenchidas
            if (data.trim().isEmpty() || hora.trim().isEmpty()) {
                // Tratar a falta de data ou hora

                data = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
                hora = "20:00";
            }
            String dataHora = data + " " + hora;

            Agendamento agendamento = new Agendamento(cliente, pedido, quantidade, valor, formaPagamento, dataHora, observacao);

            return agendamento;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Formato de data/hora inválidos", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Formato de data/hora inválidos", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void limparTela() {
        view.getTextData().setText(" ");
        view.getTextHora().setText(" ");
        view.getTextAreaObservacao().setText(" ");
    }
}
