package poo_lista_polimorfismo_ex01;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
        public String emitirSom(){
        return "Latindo";
    }
        
    @Override
        public String locomover(){
            return "Correndo";
        }
}
