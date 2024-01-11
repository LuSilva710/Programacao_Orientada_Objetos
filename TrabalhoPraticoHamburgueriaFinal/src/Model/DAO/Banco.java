package Model.DAO;

import Model.Agendamento;
import Model.Bebida;
import Model.Cliente;
import Model.Fritas;
import Model.Funcionario;
import Model.Hamburguer;
import Model.Pedido;
import java.text.ParseException;
import java.util.ArrayList;

public class Banco {

    public static ArrayList<Cliente> clientes;
    public static ArrayList<Pedido> pedido;
    public static ArrayList<Agendamento> agendamento;
    public static ArrayList<Funcionario> funcionario;

    

    public static void inicia() throws ParseException {

        clientes = new ArrayList<Cliente>();
        pedido = new ArrayList<Pedido>();
        agendamento = new ArrayList<Agendamento>();
        funcionario = new ArrayList<Funcionario>();
       

        // Instanciando objetos
        // Funcionario
        Funcionario funcionario1 = new Funcionario("gerente", "123");
        Funcionario funcionario2 = new Funcionario("atendente", "123");
        Funcionario funcionario3 = new Funcionario("adm", "123");

        //Cliente 
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", "123", "3193300012", "Rua jaboti 35 ", "Capelinha");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", "123", "3193300045", "Rua campo bom 78", "Jardim do Lago");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", "123", "31933007496", "Rua Tres Irmaos 30", "Centro");
        Cliente cliente4 = new Cliente(4, "Neymar Santos", "123", "31999816991", "Rua Lombardi 40", "Canadá");
        Cliente cliente5 = new Cliente(5, "Debruine Pipoqueiro", "123", "31933000847", "Rua pedro quaresma 784", "Lourdes");
        Cliente cliente6 = new Cliente(6, "Matuidi Pareira", "123", "31933000782", "Rua champions 10", "Franca");
        Cliente cliente7 = new Cliente(7, "Marta Souza", "123", "31998826909", "Rua tesla 215", "Horto");
        Cliente cliente8 = new Cliente(8, "Aline Ferrari", "123", "318475123687", "Rua hyrule 32", "Prado");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho", "123", "319330046364", "Rua floresta 12", "Dom Bosco");
        Cliente cliente10 = new Cliente(10, "Felipe Luis", "123", "31933000874", "Rua marechal 1023", "Praia");

        // Produto 
        Hamburguer pedido0 = new Hamburguer(0);
        Hamburguer pedido1 = new Hamburguer(1, "CLÁSSICO", " (Pão, hambúrguer artesanal de carne bovina (130 g) e queijo cheddar).................", 30);
        Hamburguer pedido2 = new Hamburguer(2, "BOMB BACON", " (Pão, hambúrguer artesanal de carne bovina (130 g), queijo cheddar, bacon, ovo caipira, cebola roxa e picles)...........................", 35);
        Hamburguer pedido3 = new Hamburguer(3, "BURGUER #710", " (Pão, hambúrguer artesanal de carne bovina (130 g), queijo cheddar, cebola caramelizada e muito bacon)................................", 35);
        Hamburguer pedido4 = new Hamburguer(4, "MASTER CHICKEN", " (Pão, hambúrguer artesanal de frango (130 g), mussarela, bacon e salada ©710).......................................................", 35);
        Hamburguer pedido5 = new Hamburguer(5, "BIG BOMB", " (Pão, dois hambúrgueres artesanais de carne bovina (130 g/cada), dupla camada de queijo cheddar, cebola caramelizada e muito bacon).......", 45);
        Hamburguer pedido6 = new Hamburguer(6, "BIG #710", " (Pão, dois hambúrgueres artesanais de carne bovina (130 g/cada), dupla camada de queijo cheddar, bacon, ovo caipira, cebola roxa e picles)", 45);

        Fritas pedido9 = new Fritas(9, "Batata Suprema #710", "Porção de batata frita crocante, com cheddar e bacon ", "G", 45);
        Fritas pedido10 = new Fritas(10, "Batata Clássica  #710", "Porção de batata frita crocante", "G", 25);

        Bebida pedido11 = new Bebida(11, "Coca-Cola Zero", "2L", 12);
        Bebida pedido12 = new Bebida(12, "Coca-Cola ", "2L", 12);
        Bebida pedido13 = new Bebida(13, "Suco Del Valle", "lata", 12);


        Agendamento agendamento1 = new Agendamento(cliente1, "<html>CLÁSSICO (3) <br>BIG #710 (3) <br>BATATA FRITA #710 (3) <br></html>", 5, 35.0, "Pix", "11/01/2024 21:00", "");

        //Adiciona Elementos na lista
        funcionario.add(funcionario1);
        funcionario.add(funcionario2);
        funcionario.add(funcionario3);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);
        clientes.add(cliente8);
        clientes.add(cliente9);
        clientes.add(cliente10);

        pedido.add(pedido0);
        pedido.add(pedido1);
        pedido.add(pedido2);
        pedido.add(pedido3);
        pedido.add(pedido4);
        pedido.add(pedido5);
        pedido.add(pedido6);

        pedido.add(pedido9);
        pedido.add(pedido10);
        pedido.add(pedido11);
        pedido.add(pedido12);
        pedido.add(pedido13);

        agendamento.add(agendamento1);
    }
}
