package Model.DAO;

import Model.Cliente;
import java.util.ArrayList;

public class ClienteDAO {

    /**
     * Insere um cliente dentro do banco de dados
     *
     * @param cliente exige que seja passado um objeto do tipo cliente
     */
    public void insert(Cliente cliente) {
        Banco.clientes.add(cliente);
    }

    /**
     * Atualiza um Objeto no banco de dados
     */
    public boolean update(Cliente cliente) {
        for (int i = 0; i < Banco.clientes.size(); i++) {
            if (idSaoIguais(Banco.clientes.get(i), cliente)) {
                Banco.clientes.set(i, cliente);
                return true;
            }
        }
        return false;

    }

    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     */
    public boolean delete(Cliente cliente) {
        for (Cliente clienteLista : Banco.clientes) {
            if (idSaoIguais(clienteLista, cliente)) {
                Banco.clientes.remove(clienteLista);
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     *
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Cliente> selectAll() {
        if (Banco.clientes != null) {
            return Banco.clientes;
        } else {
            return new ArrayList<Cliente>();
        }
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     *
     * @param cliente
     * @param clienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getId() == clienteAComparar.getId();
    }
}
