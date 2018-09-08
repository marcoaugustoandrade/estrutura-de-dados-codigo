package de.marcoandra.comEncadeamento;

public class Pilha {

    private No inicio;
    private int quantidade;

    public Pilha() {
        inicio = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void empilhar(No no){
        if (isVazia()){
            inicio = no;
        } else {
            no.setProximo(inicio);
            inicio = no;
        }
    }

    public No desempilhar(){
        No removido = null;

        if (!isVazia()){
            removido = inicio;
            inicio = inicio.getProximo();
            removido.setProximo(null);
        }

        return removido;
    }
}
