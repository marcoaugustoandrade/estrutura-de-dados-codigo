package de.marcoandra.comEncadeamento;

public class Pilha {

    private No topo;
    private int quantidade;

    public Pilha() {
        topo = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return topo == null;
    }

    public void empilhar(No no){
        no.setProximo(topo);
        topo = no;
    }

    public No desempilhar(){
        No removido = null;

        if (!isVazia()){
            removido = topo;
            topo = topo.getProximo();
            removido.setProximo(null);
        }

        return removido;
    }
}
