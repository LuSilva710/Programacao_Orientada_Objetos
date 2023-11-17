package poo_lista_polimorfismo_ex01;

public class Preguica extends Animal {
    
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }
    
     @Override
        public String emitirSom(){
        return "Ronronando";
    }
        
    @Override
        public String locomover(){
            return "Escalando árvore";
        }
}
