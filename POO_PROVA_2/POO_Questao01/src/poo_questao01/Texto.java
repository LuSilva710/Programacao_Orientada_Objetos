package poo_questao01;

public class Texto implements Renderizavel {

    private String conteudo;
    private int font;
    private int cor;

    public Texto(String conteudo, int font, int cor) {
        this.conteudo = conteudo;
        this.font = font;
        this.cor = cor;
    }
    
    public Texto() {
        this.conteudo = null;
        this.font = 0;
        this.cor = 0;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getFont() {
        return font;
    }

    public void setFont(int font) {
        this.font = font;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public void escrever() {
            System.out.println("Escrevi....");
    }

    @Override
    public void renderizar() {
        System.out.println("Objeto foi renderizado.");
    }
}
