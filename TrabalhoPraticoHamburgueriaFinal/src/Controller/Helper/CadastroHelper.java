package Controller.Helper;

import Model.Cliente;
import View.Cadastro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroHelper implements InterfaceHelper {

    private final Cadastro view;

    public CadastroHelper(Cadastro view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Cliente> clientes) {

        DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
        tableModel.setNumRows(0);

        //Percorrer lista preenchendo tableModel
        for (Cliente cliente : clientes) {

            tableModel.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getEndereco(),
                cliente.getBairro()
            });
        }
    }

    // POLIMORFISMO
    @Override
    public Cliente obterModelo() {
        try {
            String idTexto = view.getjTextID().getText();
            int id = Integer.parseInt(idTexto);
            String nome = view.getjTextNome().getText();
            String telefone = view.getjTextTelefone1().getText();
            String endereco = view.getjTextEndereco().getText();
            String bairro = view.getjTextBairro().getText();

            Cliente cliente = new Cliente(id, nome, telefone, endereco, bairro);
            return cliente;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "O ID inserido não é um número válido. Por favor, insira um número inteiro para o ID.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    @Override
    public void limparTela() {
        view.getjTextNome().setText(" ");
        view.getjTextEndereco().setText(" ");
        view.getjTextBairro().setText(" ");
        view.getjTextTelefone1().setText(" ");
    }
}
