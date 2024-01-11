package poo_heranca_ex02;

public class Gato extends Animal {
    
      public Gato(String nome, String raca) {
        super(nome, raca);
    }
      
      public String miar(){
          return "Miau miau miau";
      }
}
