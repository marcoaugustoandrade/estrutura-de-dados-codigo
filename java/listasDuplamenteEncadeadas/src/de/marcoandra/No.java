package de.marcoandra;

public class No {

    private int conteudo;
    private No proximo;
    private No anterior;

    public No(int conteudo) {
        this.conteudo = conteudo;
        proximo = null;
        anterior = null;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
