package poo_lista_polimorfismo_ex01;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    
     @Override
        public String emitirSom(){
        return "Relinchando";
    }
        
    @Override
        public String locomover(){
            return "Trotando";
        }
}
