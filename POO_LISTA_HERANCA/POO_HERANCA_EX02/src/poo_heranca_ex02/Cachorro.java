package poo_heranca_ex02;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }
    
    public String latir(){
        return "Au au au";
    }
}
