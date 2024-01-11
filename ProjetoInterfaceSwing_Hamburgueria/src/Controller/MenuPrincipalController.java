package Controller;

import View.Cadastro;
import View.Comanda;
import View.MenuPrincipal;


public class MenuPrincipalController {
    private final MenuPrincipal view;
    
    public MenuPrincipalController (MenuPrincipal view){
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Comanda agenda = new Comanda();
        agenda.setVisible(true);
    }

    public void navegarParaCadastro() {
       Cadastro cadastro = new Cadastro();
       cadastro.setVisible(true);
    }

}
