
package poo_lista_polimorfismo_ex02;

import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;
    
    public CD() {
    }

    public CD(int c, double p, String s, int m) {
        super(c, p, s);
        this.nMusicas = m;
    }
    
    @Override
    public String getTipo(){
        return "CD";
    }
    
    @Override
    public String getDetalhes(){
        return "Número de músicas: " + nMusicas;
    }
    
    public void setNumeroMusica(int nMusica){
        this.nMusicas = nMusica;
    }
    
    @Override
    public void inserirDados(){
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o numero de músicas: ");
        this.nMusicas = scanner.nextInt();
    }
}
