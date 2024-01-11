/*
 Pedrinho é um garoto que adora festas em família, principalmente o Natal, quandoganha presente dos pais e dos avós. 
Esse ano, seu pai lhe prometeu um PS4, mas somente sePedrinho conseguir resolver alguns desafios ao longo do ano, sendo um deles, escrever umprograma que calcule quantos dias faltam para o Natal. 
Entretanto, Pedrinho tem somente 9 anos e não tem noção alguma de programação, mas sabeque você, primo dele, mexe com "coisas de computador", 
e dessa forma, pediu para vocêescrever o programa para ele. Não somente isso, mas prometeu que deixaria você jogar todofinal de semana e por quanto tempo quiser!
A entrada é composta por vários casos de teste. Cada linha contém o mês e o dia do ano de 2016(ano bissexto). A entrada termina com fim de arquivo. Se for Natal, imprima "E natal!"; se faltar
somente um dia, imprima "E véspera de natal!"; se já passou, imprima "Ja passou!". Casocontrário, imprima "Faltam X dias para o natal!", sendo X o número de dias que faltampara oNatal. 
 */
package poo_ex03;
import java.util.Scanner;
public class POO_EX03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        int restante;

        switch (mes) {
            case 1:
                restante =  (31 - dia) + 329;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 2:
                restante = (29 - dia) + 300;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 3:
                restante = (31 - dia) + 269;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 4:
                restante = (30 - dia) + 239;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 5:
                restante = (31 - dia) + 208;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 6:
                restante = (30 - dia) + 178;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 7:
                restante = (31 - dia) + 147;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 8:
                restante = (31 - dia) + 116;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 9:
                restante = (30 - dia) + 86;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 10:
                restante = (31 - dia) + 55;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 11:
                restante = (30 - dia) + 25;
                System.out.println("Faltam " + restante + " dias para o natal!");
                break;

            case 12:
                restante = (25 - dia);
                  if (restante == 1) {
                    System.out.println("E véspera de natal!");
                } else if (restante == 0) {
                    System.out.println("E natal!");
                } else if (restante > 0) {
                    System.out.println("Faltam " + restante + " dias para o natal!");
                } else {
                    System.out.println("Ja passou!");
                }
                break;
        }
    }
}

