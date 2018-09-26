package de.marcoandra.comEncadeamento;

public class No {

    private int conteudo;
    private No anterior;

    public No(int conteudo) {
        this.conteudo = conteudo;
        anterior = null;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
