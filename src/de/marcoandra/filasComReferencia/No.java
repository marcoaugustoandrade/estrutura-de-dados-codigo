package de.marcoandra.filasComReferencia;

public class No {

    private int elemento;
    private No anterior;

    public No(int elemento) {
        this.elemento = elemento;
        this.anterior = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
