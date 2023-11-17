package poo_lista_polimorfismo_ex06;

public class Principal {

    public static void main(String[] args) {
       ContaCorrente contaNormal = new ContaCorrente(1000.0);
       ClienteEspecial contaEspecial = new ClienteEspecial(1000.0);
       
       contaNormal.sacar(200);
       contaNormal.depositar(200);
       contaNormal.obterSaldo();
       
       contaEspecial.sacar(200);
       contaEspecial.sacar(200);
       contaEspecial.depositar(400);
       contaEspecial.obterSaldo();
       
    }
    
}
