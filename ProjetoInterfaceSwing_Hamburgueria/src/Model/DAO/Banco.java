package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Pedido;
import Model.Usuario;
import java.util.ArrayList;

public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Pedido> pedido;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        pedido = new ArrayList<Pedido>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario("chapeiro", "123");
        Usuario usuario2 = new Usuario("adm",  "123");
        Usuario usuario3 = new Usuario("recepcionista",  "administrador", "admin123");
         
        Cliente cliente1 = new Cliente("01", "Alan Figueiredo", "lud.carina@gmail.com", "5142487", "Rua jaboti 35 Canudos NH");
        Cliente cliente2 = new Cliente("02", "Judite Oliveira", "", "5142487", "Rua campo bom 78 Centro NH");
        Cliente cliente3 = new Cliente("03", "Paulo Ricado","",  "78451", "Rua Tres Irmaos 30 Vila Nova - NH");
        Cliente cliente4 = new Cliente("04", "Neymar Santos","", "2745487", "Rua Lombardi 40 Canudos NH");
        Cliente cliente5 = new Cliente("05", "Debruine Pipoqueiro","","4742487", "Rua pedro quaresma 784 Canudos Belgica");
        Cliente cliente6 = new Cliente("06", "Matuidi Pareira","", "302122324", "Rua champions 10 Kephas Franca");
        Cliente cliente7 = new Cliente("07", "Marta de Souza","", "46582314", "Rua tesla 215 Canudos NH");
        Cliente cliente10 = new Cliente("10", "Felipe Luis","", "84571364", "Rua marechal 1023 Canudos NH");
        
        Pedido pedido1 = new Pedido(1, "Big #710", "Pao brioche, hamburguer artesanal bovino, queijo cheddar cremoso, cebola roxa e picles",  45);
        Pedido pedido2 = new Pedido(2, "Big Bomb", "Pao brioche, hamburguer artesanal bovino, queijo cheddar cremoso, cebola roxa e picles",  45);
        Pedido pedido3 = new Pedido(3, "Big Chicken", "Pao brioche, hamburguer artesanal bovino, queijo cheddar cremoso, cebola roxa e picles",  45);
        Pedido pedido4 = new Pedido(4, "Burguer #710", "Pao brioche, hamburguer artesanal bovino, queijo cheddar cremoso, cebola roxa e picles",  35);

        Agendamento agendamento1 = new Agendamento( cliente1,"", pedido1, 3, 70, "Pix", "14/07/2018 09:30");
        Agendamento agendamento2 = new Agendamento( cliente3,"", pedido4, 1, 40, "Pix", "14/07/2018 10:00");
        Agendamento agendamento3 = new Agendamento( cliente4,"", pedido3, 2, 35, "Pix" ,"14/07/2018 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);

        
        pedido.add(pedido1);
        pedido.add(pedido2);
        pedido.add(pedido3);
        pedido.add(pedido4);

        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
