
package tratamentoexcecao_trycatch;

public class TratamentoExcecao_TryCatch {

    public static void main(String[] args) {
        try {
        int vet[] = new int[4];
        System.out.println("Msg antes da exceção: ");
        vet[4] = 1;
        System.out.println("Esta mensagem não vai ser exibida!");
    } catch(ArrayIndexOutOfBoundsException er){
            System.out.println("Ocorreu uma exceção ao tentar acessar uma posição inválidado vetor.");
    }
    }
    
}
