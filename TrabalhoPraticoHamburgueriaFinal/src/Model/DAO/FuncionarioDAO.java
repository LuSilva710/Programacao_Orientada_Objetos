package Model.DAO;

import Model.Funcionario;
import java.util.ArrayList;


public class FuncionarioDAO {
    
    public void insert(Funcionario funcionario){
        Banco.funcionario.add(funcionario);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @return 
     */
    public boolean update(Funcionario funcionario){
        
        for (int i = 0; i < Banco.funcionario.size(); i++) {
            if(nomesSaoIguais(Banco.funcionario.get(i),funcionario)){
                Banco.funcionario.set(i, funcionario);
                return true;
            }
        }
        return false;      
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @return 
     */
    public boolean delete(Funcionario funcionario){
        for (Funcionario funcionarioLista : Banco.funcionario) {
            if(nomesSaoIguais(funcionarioLista,funcionario)){
                Banco.funcionario.remove(funcionarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os funcionarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Funcionario> selectAll(){
        return Banco.funcionario;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @return Usuario encontrado no banco de dados
     */
    
    public Funcionario selectPorNomeESenha(Funcionario funcionario){
        for (Funcionario funcionarioLista : Banco.funcionario) {
            if(nomeESenhaSaoIguais(funcionarioLista,funcionario)){
                return funcionarioLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(Funcionario funcionario, Funcionario funcionarioAPesquisar) {
        return funcionario.getNome().equals(funcionarioAPesquisar.getNome()) && funcionario.getSenha().equals(funcionarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean nomesSaoIguais(Funcionario funcionario, Funcionario funcionarioAComparar) {
        return funcionario.getNome() ==  funcionarioAComparar.getNome();
    }
     
}
