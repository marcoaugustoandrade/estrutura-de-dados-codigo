package de.marcoandra.pilhasComArranjo;

public class Pilha {

    private int valores[];
    private int topo;

    public Pilha() {
        // Definindo o tamanho máximo da pilha
        this.valores = new int[10];
        this.topo = -1;
    }

    // Empilhando um elemento
    public void push(int elemento){
        if (!isCheia()){
            this.topo++;
            this.valores[this.topo] = elemento;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    // Desempilhando um elemento
    public Object pop(){

        Object elemento;

        if (!isVazia()){
            elemento = this.valores[this.topo];
            this.topo--;
        } else {
            elemento = "Pilha vazia!";
        }

        return elemento;
    }

    public boolean isVazia(){
        return this.topo == -1;
    }

    public boolean isCheia(){
        return this.topo == 9;
    }
}
