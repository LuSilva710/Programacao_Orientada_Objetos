package Model.DAO;

import Model.Cardapio;
import Model.Cliente;
import Model.Funcionario;
import Model.Pedido;
import Model.Usuario;
import java.util.ArrayList;

public class Banco {
    
     public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Cardapio> produto;
    public static ArrayList<Pedido> pedido;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        produto = new ArrayList<Cardapio>();
        pedido = new ArrayList<Pedido>();
        
        //instanciando elementos
        // Funcionario(String nome, int senha, String telefone, String nivelAcesso) 
        Funcionario funcionario1 = new Funcionario("João", 123, "31990801030", "atendente");
        Funcionario funcionario2 = new Funcionario("Claudio", 123, "3199887766", "adm");
         
        //Cliente (String nome, int senha, String telefone, String endereco, String bairro)
        Cliente cliente1 = new Cliente("Alan Figueiredo",123, "3193300012","Rua jaboti 35 ", "Capelinha");
        Cliente cliente2 = new Cliente("Judite Oliveira", 123, "3193300045", "Rua campo bom 78", "Jardim do Lago");
        Cliente cliente3 = new Cliente("Paulo Ricado", 123, "31933007496",  "Rua Tres Irmaos 30", "Centro");
        Cliente cliente4 = new Cliente("Neymar Santos", 123, "31999816991","Rua Lombardi 40", "Canadá");
        Cliente cliente5 = new Cliente("Debruine Pipoqueiro", 123, "Lourdes", "31933000847","Rua pedro quaresma 784");
        Cliente cliente6 = new Cliente("Matuidi Pareira", 123,  "31933000782",  "Rua champions 10", "Franca");
        Cliente cliente7 = new Cliente("Marta de Souza", 123, "31998826909",  "Rua tesla 215",  "Horto");
        Cliente cliente8 = new Cliente("Aline Ferrari",123,  "318475123687", "Rua hyrule 32", "Prado");
        Cliente cliente9 = new Cliente("Samuel Coltinho", 123, "319330046364", "Rua floresta 12", " Dom Bosco");
        Cliente cliente10 = new Cliente("Felipe Luis", 123, "31933000874",  "Rua marechal 1023", "Praia");

        
        //Adiciona Elementos na lista
        usuario.add(funcionario1);
        usuario.add(funcionario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
   
    }
}
