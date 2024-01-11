package Controller.Helper;

import Model.Funcionario;
import View.Login;

public class LoginHelper implements InterfaceHelper {

    private final Login View;

    public LoginHelper(Login View) {
        this.View = View;
    }

    @Override
    public Funcionario obterModelo() {
        // Pegar dados de login
        // Pesquisar usuario
        // Verificar se dados estao corretos, e direcionar para menu
        
        String nome = View.getTextUsuario().getText();
        String senha = View.getTextSenha().getText();
        Funcionario modelo = new Funcionario(nome, senha);
        return modelo;
    }
    
    public void setarModelo(Funcionario modelo){
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
