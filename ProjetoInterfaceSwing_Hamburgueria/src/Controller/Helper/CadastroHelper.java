package Controller.Helper;

import Model.Cliente;
import View.Cadastro;
import java.util.ArrayList;
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
                cliente.getEndereco(),});
        }
    }

    // POLIMORFISMO
    @Override
    public Cliente obterModelo() {
        String nome = view.getjTextNome().getText();
        String endereco = view.getjTextEndereco().getText();
        String telefone = view.getjTextTelefone1().getText();

        Cliente cliente = new Cliente(nome, telefone, endereco);
        return cliente;

    }

    @Override
    public void limparTela() {
        //view.getjTextID().setText(" ");
        view.getjTextNome().setText(" ");
        view.getjTextEndereco().setText(" ");
        view.getjTextTelefone1().setText(" ");
        view.getjTextUsuario1().setText(" ");
        view.getjTextSenha().setText(" ");
    }
}
