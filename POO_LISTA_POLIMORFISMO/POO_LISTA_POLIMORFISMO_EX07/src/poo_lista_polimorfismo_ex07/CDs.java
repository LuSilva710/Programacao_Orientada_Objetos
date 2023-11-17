package poo_lista_polimorfismo_ex07;

public class CDs extends Item {
    private int numeroFaixas;
    
    public CDs(String nome, double preco, String codigoBarras, int numeroFaixas) {
        super(nome, preco, codigoBarras);
        this.numeroFaixas = numeroFaixas;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Faixas: " + getNumeroFaixas();
    }
}
