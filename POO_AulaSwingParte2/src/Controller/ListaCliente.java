package Controller;

import Model.Cliente;
import java.util.ArrayList;

public class ListaCliente {
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public ArrayList<Cliente> getListaclientes() {
        return listaClientes;
    }

    public void setListaclientes(ArrayList<Cliente> listaclientes) {
        this.listaClientes = listaclientes;
    }
    
    public void inserirCiente(Cliente c){
        listaClientes.add(c);
    }
    
    public void removerCliente(int indice){
        listaClientes.remove(indice);
    }
    
    public void inserirClientePos(int indice, Cliente c){
        listaClientes.add(indice, c);
    }
}
