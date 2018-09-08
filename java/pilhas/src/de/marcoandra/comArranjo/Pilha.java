package de.marcoandra.comArranjo;

public class Pilha {

    private int elementos[];
    private int topo;

    public Pilha() {
        elementos = new int[5];
        topo = -1;
    }

    public boolean isVazia(){
        return topo == -1;
    }

    public boolean isCheia(){
        return topo == 4;
    }

    public void empilhar(int elemento){
        if (!isCheia()){
            topo++;
            elementos[topo] = elemento;
        } else {
            System.out.printf("A pilha está cheia!");
        }
    }

    public int desempilhar(){
        int elemento = elementos[topo];
        topo--;
        return elemento;
    }
}
