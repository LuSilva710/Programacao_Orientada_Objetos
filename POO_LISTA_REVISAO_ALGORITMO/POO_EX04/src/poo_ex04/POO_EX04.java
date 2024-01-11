/*
Há exatamente 26 lâmpadas penduradas em uma parede, numeradas de 1 a 26 da esquerda para a direita. Além disso, há uma letra do alfabeto pintada na parede embaixo de cada lâmpada. 
Quando alguém quer enviar uma mensagem, a pessoa irá (misteriosamente)
piscar, uma a uma, as lâmpadas correspondentes a cada letra de sua mensagem. Por exemplo, se alguém quer enviar a mensagem HELP, ele irá piscar, nesta ordem, as lâmpadas acima das letras
H, E, L e P. 
Dada a letra associada a cada lâmpada e a ordem das lâmpadas que foram piscadas, decifre a mensagem enviada!
Entrada 
ABCDEFGHIJKLMNOPQRSTUVWXYZ
4
8 5 12 16
QWERTYUIOPASDFGHJKLZXCVBNM
10
16 3 19 19 9 2 9 4 19 13

Saída
HELP

HELLOWORLD
 */
package poo_ex04;

import java.util.Scanner;

public class POO_EX04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[] lampadas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

            System.out.println("Tamanho da mensagem:");
            int tamanhoMensagem = teclado.nextInt(); // Tamanho da mensagem
            
            System.out.println("Lamapadas acessas: ");
            int[] lampadasAcessas = new int[tamanhoMensagem]; // Array para armazenar as lâmpadas piscadas
            
            for (int i = 0; i < tamanhoMensagem; i++) {
                lampadasAcessas[i] = teclado.nextInt(); // Preenche o array com as lâmpadas piscadas
            }

            for (int i = 0; i < tamanhoMensagem; i++) {
                System.out.print(lampadas[lampadasAcessas[i] - 1]); // Subtrai 1 para obter o índice correto
            }
            System.out.println(); // Nova linha após imprimir a mensagem
        }
    }
