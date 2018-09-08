package de.marcoandra.comArranjo;

public class Testar {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        System.out.println("A pilha está cheia? " + pilha.isCheia());
        System.out.println("A pilha está vazia? " + pilha.isVazia());

        pilha.empilhar(10);
        pilha.empilhar(4);
        pilha.empilhar(3);
        pilha.empilhar(2);
        pilha.empilhar(6);
        System.out.println("A pilha está cheia? " + pilha.isCheia());

        System.out.println("Elemento desempilhado: " + pilha.desempilhar());
        System.out.println("Elemento desempilhado: " + pilha.desempilhar());
        System.out.println("Elemento desempilhado: " + pilha.desempilhar());
        System.out.println("Elemento desempilhado: " + pilha.desempilhar());
        System.out.println("Elemento desempilhado: " + pilha.desempilhar());
        System.out.println("A pilha está vazia? " + pilha.isVazia());

    }

}
