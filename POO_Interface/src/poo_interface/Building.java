package poo_interface;

public  abstract class Building {
    private int numPessoas;
    private boolean energiaRenovavel;
    private int numLampadas;
    private boolean usaArCondicionado;

    public Building(int numPessoas, boolean energiaRenovavel, int numLampadas, boolean usaArCondicionado) {
        this.numPessoas = numPessoas;
        this.energiaRenovavel = energiaRenovavel;
        this.numLampadas = numLampadas;
        this.usaArCondicionado = usaArCondicionado;
    }
  
}
