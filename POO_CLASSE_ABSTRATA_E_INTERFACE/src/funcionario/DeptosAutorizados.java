package funcionario;

public class DeptosAutorizados {

    public final static String DEPTOS[] = {"Compras", "Financeiro", "Cliente", "Produção", "RH"};

    public static boolean validaDepto(String dpto) {

        boolean saida = false;

        for (int i = 0; i < DEPTOS.length; i++) {

            if (DEPTOS[i].equals(dpto)) {
                saida = true;
            }
        }
        return saida;
    }
}
