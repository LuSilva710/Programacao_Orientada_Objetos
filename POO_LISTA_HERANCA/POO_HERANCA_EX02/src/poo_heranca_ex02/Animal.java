package poo_heranca_ex02;

public class Animal {
    private String nome;
    private String raca;

    public Animal() {
        this.nome = null;
        this.raca = null;
    }
    
    public Animal(String nome,String raca){
        this.nome = nome;
        this.raca = raca;
    }
    
    public String caminhar(){
        return "Caminhando...";
    }
}
