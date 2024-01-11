package Controller;

import Controller.Helper.CadastroHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import View.Cadastro;
import View.MenuPrincipal;

import java.util.ArrayList;

public class CadastroController {

    private final Cadastro view;
    private final CadastroHelper helper;

    public CadastroController(Cadastro view) {
        this.view = view;
        this.helper = new CadastroHelper(view);
    }

    public void atualizarTabela() {
        // buscar lista de agendamento em Banco
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();

        // exibir lista
        helper.preencherTabela(clientes);

    }

    public void atualizaCliente() {
        // Buscar cliente no Banco
        // Exibir cliente no ComboBox
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
    }

    public void cadastrar() {
        Cliente cliente = helper.obterModelo();
        new ClienteDAO().insert(cliente);
        atualizarTabela();
        helper.limparTela();

    }

    public void navegarMenuPrincipal() {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
}
