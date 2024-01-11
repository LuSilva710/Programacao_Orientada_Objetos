package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pedido;
import Model.Usuario;


public class Main {
    public static void main(String[] args) {
        String nome = "Lud";
        System.out.println(nome);
        
        Pedido hamburguer = new Pedido(01, "Big Bomb", "(Pão, bife artesanal)",   35);
        System.out.println(hamburguer.getId() + " - " + hamburguer.getNome() +".......................................R$" + hamburguer.getValor());
        
        Cliente cliente = new Cliente( "01", "Lud", "16818618" );
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        
        Usuario usuario = new Usuario("usuario_123" , "adm", "12345");
        System.out.println( "Usuario: " + usuario.getNome() + "\n" + usuario.getNivelAcesso() +" | " + usuario.getSenha());
        
        //Agendamento agendamento = new Agendamento(01, cliente, hamburguer, 35, "10/11/2023 18:00");
        //System.out.println(agendamento.getCliente().getNome() + ": " + agendamento.getPedido().getNome() + " | " + agendamento.getData());
    }
}
