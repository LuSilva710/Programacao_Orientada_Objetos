package poo_lista_polimorfismo_ex01;

public class Animal {
    private String nome;
    private int idade;

    public String emitirSom(){
        return "";
    }
    
    public String locomover(){
        return "";
    }
   
    // METODO CONSTRUTOR
       public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

       //METODOS GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
   
}
