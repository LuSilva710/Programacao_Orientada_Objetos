package funcionario;

import java.util.Scanner;

public class SistemaInterno {
    
    Scanner teclado = new Scanner(System.in);
    
    public void login (Autenticavel func){
        
        System.out.println("*****LOGIN*****");
        System.out.println("Informe sua senha: ");
        int senha = teclado.nextInt();
        
        boolean resultado = func.autentica(senha);
        
        if(resultado) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
        
        //func.autentica(senha);
        
    }
    
}
