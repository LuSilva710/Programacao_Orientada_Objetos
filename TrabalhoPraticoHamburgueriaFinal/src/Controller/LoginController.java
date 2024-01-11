package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.FuncionarioDAO;
import Model.Funcionario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login View;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.View = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Pegar usuario da View
        Funcionario funcionario = helper.obterModelo();
        
        //Pesquisar usuário no Banco
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionarioAutenticado = funcionarioDAO.selectPorNomeESenha(funcionario);
        
        
        if(funcionarioAutenticado != null){
            //Navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.View.dispose();
        } else {
            // Usuario inválido
            View.exibirMensagem("Usuário ou senha inválidos");
        }   
    }
}
