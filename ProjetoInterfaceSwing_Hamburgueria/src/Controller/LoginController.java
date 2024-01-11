package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
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
        Usuario usuario = helper.obterModelo();
        
        //Pesquisar usuário no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        
        if(usuarioAutenticado != null){
            //Navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.View.dispose();
        } else {
            // Usuario inválido
            View.exibirMensagem("Usuário ou senha inválidos");
        }   
    }

    public void concluirTarefa() {
        System.out.println("Buscar cliente em BD!");
        this.View.exibirMensagem("Executado!");
    }
}
