
package tratamentoexcecao_trycatch;

public class MultiplasExcecoesSimilares {
     public static void main(String[] args) {

        int num[] = {4, 8, 16, 32, 64, 128};
        int div[] = {2, 0, 4, 8, 0};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + div[i] + " = " + num[i] / div[i]);

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException er) {
                System.out.println("Ocorreu uma exceção");
                System.out.println("");
            }
        }
    }
}
