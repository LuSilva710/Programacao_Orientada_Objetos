/*
 *  Escreva uma classe Contador, que encapsule um valor usado
* para contagem de itens ou eventos. A classe deve oferecer métodos que devem:
* a) Zerar;
* b) Incrementar;
* c) Retornar o valor do contador.
 */
package listapoo_ex01;

    public class Contador {
        int contagem;

        //  MÉTODO ZERAR
        public void zerar() {
            contagem = 0;
        }

        //  MÉTODO INCREMENTAR
        public void incrementar() {
            contagem++;
        }
        //  MÉTODO RETORNAR VALOR

        public int retornarValor() {
            return contagem;
        }
    }

