package Controller.Helper;

//import Model.Agendamento;
import Model.Agendamento;
import Model.Cliente;
import Model.Pedido;
import View.Comanda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

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

            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getPedido().getNome(),
                agendamento.getQuantidade(),
                agendamento.getValor(),
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
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxPedido().getModel();

        for (Pedido pedido : pedidos) {
            comboBoxModel.addElement(pedido);
        }
    }

    public Cliente obterCliente() {
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();
    }

    public Pedido obterPedido() {
        return (Pedido) view.getjComboBoxPedido().getSelectedItem();
    }

    public String obterFormaPagamento() {
        return (String) view.getjComboBoxPagamento().getSelectedItem();
    }

    public int obterQuantidade() {
        return (int) view.getjSpinnerQuantidade().getValue();
    }

    public void setarValor(double valor) {
        view.getTextValor().setText(valor + "");
    }

    // POLIMORFISMO
    @Override
    public Agendamento obterModelo() {

        Cliente cliente = obterCliente();
        Pedido pedido = obterPedido();
        String email = view.getTextAreaObservacao().getText();
        int quantidade = obterQuantidade();
        String valorString = view.getTextValor().getText();
        double valor = Double.parseDouble(valorString);
        String formaPagamento = obterFormaPagamento();
        String data = view.getTextData().getText();
        String hora = view.getTextHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getTextAreaObservacao().getText();

        Agendamento agendamento = new Agendamento(cliente, email, pedido, quantidade, valor, formaPagamento, dataHora, observacao);

        return agendamento;
    }

    @Override
    public void limparTela() {
       // view.getTextID().setText("0");
        view.getTextData().setText(" ");
        view.getTextHora().setText(" ");
        view.getTextAreaObservacao().setText(" ");
    }
    
    

}
