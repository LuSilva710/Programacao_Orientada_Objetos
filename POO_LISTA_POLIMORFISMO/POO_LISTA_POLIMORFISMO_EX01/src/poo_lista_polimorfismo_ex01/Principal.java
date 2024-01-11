
package poo_lista_polimorfismo_ex01;


public class Principal {

    public static void main(String[] args) {
        Cachorro yoko = new Cachorro("Yoko", 8);
        Cavalo pangare = new Cavalo("Pangare", 9);
        Preguica preguicinha = new Preguica("Preguicinha", 4);
        
        
        //POLIMORFISMO (METODOS  AGINDO EM 3 OBJETOS DISTINTOS)
        System.out.println("Som: " + yoko.emitirSom());
        System.out.println("Locomoção: " + yoko.locomover());
        
        System.out.println("Som: " + pangare.emitirSom());
        System.out.println("Locomoção: " + pangare.locomover());
        
        System.out.println("Som: " + preguicinha.emitirSom());
        System.out.println("Locomoção: " + preguicinha.locomover());
    }
    
}
