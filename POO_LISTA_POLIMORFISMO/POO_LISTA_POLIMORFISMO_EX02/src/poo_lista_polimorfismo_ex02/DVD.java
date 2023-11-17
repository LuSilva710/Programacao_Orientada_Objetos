package poo_lista_polimorfismo_ex02;

import java.util.Scanner;

public class DVD extends Midia {
    private int nFaixas;
    
    public DVD(){
    }
    
    public DVD(int c , double p, String s, int f){
       super(c, p, s);
        this.nFaixas = f;
    }
    
    @Override
    public String getTipo(){
        return "DVD";
    }
    
    @Override
    public String getDetalhes(){
        return "Números de faixas: " + nFaixas;
    }
    
    public void setNumeroFaixas(int f){
        this.nFaixas = f;
    }
    
    @Override
    public void inserirDados(){
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número de faixas: ");
        this.nFaixas = scanner.nextInt();
    }
    
}
