package de.marcoandra.pilhasComReferencia;

public class Pilha {

    private No topo;
    private int quantidade;

    public Pilha() {
        this.topo = null;
        this.quantidade = 0;
    }

    public void push(No no){
        no.setProximo(this.topo);
        this.topo = no;
        this.quantidade++;
    }

    public No pop(){
        No elemento = null;
        if (!isVazia()){
            elemento = this.topo;
            this.topo = this.topo.getProximo();
            this.quantidade--;
        }
        return elemento;
    }

    public boolean isVazia(){
        return this.topo == null;
    }

    public int tamanho(){
        return this.quantidade;
    }
}
