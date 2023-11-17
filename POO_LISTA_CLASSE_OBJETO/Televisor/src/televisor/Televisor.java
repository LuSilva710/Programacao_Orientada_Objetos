/*
Crie uma classe Televisor. Essa classe deve possuir três atributos:
canal // inicia em 1 e vai até 16
volume // inicia em 0 e vai até 10
ligado // inicia em desligado ou false
e a seguinte lista de métodos:
aumentarVolume() // Aumenta em 1 o volume
reduzirVolume() // Diminui em 1 o volume
subirCanal() // Aumenta em 1 o canal
descerCanal() // Diminui em 1 o canal
ligarTelevisor() // Liga a televisão
desligarTelevisor() // Desliga a televisão
mostraStatus() // Dizer qual o canal, o volume eseotelevisor está ligado
Nos métodos informe se é possível realizar a operação, por exemplo, se o volume estiver no 10 e se for chamado o método aumentarVolume() novamente imprimauma mensagem de aviso, etc. 
Quando desligado, nosso televisor deve voltar o canal e o volume a seus valoresiniciais e não deve realizar nenhuma operação. Crie uma classe para testar a classe Televisao.
 */
package televisor;

public class Televisor {

    int canal = 0;
    int volume = 0;
    boolean ligado = false;

    public void aumentarVolume() {
        if (ligado) {
            if (volume < 10) {
                volume++;
                System.out.println("Volume Up: " + volume);
            } else {
                System.out.println("ERRO! Volume Máximo!");
            }
        } else {
            System.out.println("ERRO! Televisor desligado!");
        }
    }

    public void reduzirVolume() {
        if (ligado) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume: " + volume);
            } else {
                System.out.println("ERRO! Volume Mínimo!");
            }
        } else {
            System.out.println("ERRO! Televisor desligado!");
        }
    }

    public void subirCanal() {
         if (ligado) {
            if (canal < 16) {
                canal++;
                System.out.println("Canal Up: " + canal);
            } else {
                System.out.println("ERRO! Não é possível alterar!");
            }
        } else {
            System.out.println("ERRO! Televisor desligado!");
        }
    }

    public void descerCanal() {
        if (ligado) {
            if (canal > 1) {
                canal--;
                System.out.println("Canal Down: " + canal);
            } else {
                System.out.println("ERRO! Não é possível alterar!");
            }
        } else {
            System.out.println("ERRO! Televisor desligado!");
        }
    }

    public void ligarTelevisor() {
        ligado = true;
        System.out.println("Televisor ligado.");

    }

    public void desligarTelevisor() {
        ligado = false;
        volume = 0;
        canal = 0;
        System.out.println("Televisor desligado.");
    }

    public void mostrarStatus() {
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));

    }

}
