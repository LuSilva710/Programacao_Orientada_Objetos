package poo_classe_abstrata;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Empregado> listaEmpregado = new ArrayList<>();
        Empregado e1 = new Assalariado("Maria", "Marciana", "123", 1500.0);
        Assalariado e2 = new Assalariado("João", "Marciano", "3456", 1500.0);

        Empregado e3 = new Comissionado("José", "Marciano", "891", 100.000, 0.20);
        Empregado e4 = new Comissionado("Ana", "Marciana", "556", 1000.000, 0.15);

        Empregado e5 = new Horista("Paulo", "Marciano", "879", 10000, 160);
        Empregado e6 = new Horista("Sara", "Marciano", "332", 20000, 165);

        listaEmpregado.add(e1);
        listaEmpregado.add(e2);
        listaEmpregado.add(e3);
        listaEmpregado.add(e4);
        listaEmpregado.add(e5);
        listaEmpregado.add(e6);

        double soma = 0;
        /*
        ***ESTAGIARIO***
        for (int i = 0; i < listaEmpregado.size(); i++) {
            Empregado e = listaEmpregado.get(i);
            soma += e.vencimento();
            System.out.println(e.vencimento());
        }
        System.out.println("O valor gasto foi: R$" + soma);
        */
        
        /*
        ***JUNIOR***
        for(Empregado e : listaEmpregado){
            soma += e.vencimento();
            System.out.println(e.vencimento());
        }
        System.out.println("********Total************");
        System.out.println("R$: " + soma);
        */
        
        /* **** SENIOR*** */
        Iterator<Empregado> it = listaEmpregado.iterator();
        
        while(it.hasNext()){
            Empregado e = it.next();
            soma += e.vencimento();
            System.out.println(e.vencimento());
        }
        System.out.println("********Total************");
        System.out.println("R$: " + soma);
        
    }
}
