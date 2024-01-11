package Model.DAO;

import Model.Pedido;
import java.util.ArrayList;


public class PedidoDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param servico exige que seja passado um objeto do tipo servico
     */
    public void insert(Pedido pedido){
        Banco.pedido.add(pedido);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param servico
     * @return 
     */
    public boolean update(Pedido pedido){
        
        for (int i = 0; i < Banco.pedido.size(); i++) {
            if(idSaoIguais(Banco.pedido.get(i),pedido)){
                Banco.pedido.set(i, pedido);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servico
     * @return 
     */
    public boolean delete(Pedido pedido){
        for (Pedido pedidoLista : Banco.pedido) {
            if(idSaoIguais(pedidoLista,pedido)){
                Banco.pedido.remove(pedidoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Pedido> selectAll(){
        return Banco.pedido;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Pedido pedido, Pedido pedidoAComparar) {
        return pedido.getId() ==  pedidoAComparar.getId();
    }
    
}
