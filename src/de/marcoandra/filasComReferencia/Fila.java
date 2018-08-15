package de.marcoandra.filasComReferencia;

public class Fila {

    private No inicio, fim;
    private int quantidade;

    public Fila() {
        this.inicio = this.fim = null;
        this.quantidade = 0;
    }

    public void enfileirar(No no){
        if (isVazia()){
            this.inicio = this.fim = no;
        } else {
            this.fim.setAnterior(no);
            this.fim = no;
        }
    }

    public No desenfileirar(){
        No elemento = null;
        if (!isVazia()){
            elemento = this.inicio;
            this.inicio = this.inicio.getAnterior();
            elemento.setAnterior(null);
        }
        return elemento;
    }

    public boolean isVazia(){
        return this.quantidade == 0;
    }
}
