package poo_lista_polimorfismo_ex04;

import java.util.Scanner;

public class Carro extends Veiculo {
    private double km;
    
    public Carro(String modelo, double preco, double km){
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }
    
    public void setKm(double km){
        this.km =km;
    }
    
    @Override
    public double getPreco(){
        return super.getPreco();
    }
   
    public void inserirDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do veiculo: ");
        super.setModelo(scanner.next());
        System.out.println("Informe o preço do veiculo: ");
        super.setPreco(scanner.nextDouble());
        System.out.println("Informe a quilometragem do veiculo: ");
        km = scanner.nextDouble();
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quilometragem: " + km);
        System.out.println("-----------------------\n");
    }
    
}
