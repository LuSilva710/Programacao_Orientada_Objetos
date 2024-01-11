package Model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Usuario {

    static List<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getSenha() {
        return super.getSenha();
    }

}
