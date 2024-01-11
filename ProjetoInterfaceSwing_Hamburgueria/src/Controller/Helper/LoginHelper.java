package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper implements InterfaceHelper {

    private final Login View;

    public LoginHelper(Login View) {
        this.View = View;
    }

    @Override
    public Usuario obterModelo() {
        // Pegar dados de login
        // Pesquisar usuario
        // Verificar se dados estao corretos, e direcionar para menu
        String nome = View.getTextUsuario().getText();
        String senha = View.getTextSenha().getText();
        Usuario modelo = new Usuario(nome, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
    
        View.getTextUsuario().setText(nome);
        View.getTextSenha().setText(senha);
    }
    
    @Override
    public void limparTela(){
        View.getTextUsuario().setText(" ");
        View.getTextSenha().setText(" ");
    }
}
