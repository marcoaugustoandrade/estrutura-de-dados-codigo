package de.marcoandra.comEncadeamento;

public class Testar {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        System.out.println("A pilha está vazia? " + pilha.isVazia());

        pilha.empilhar(new No(10));
        pilha.empilhar(new No(20));
        pilha.empilhar(new No(30));
        pilha.empilhar(new No(40));

        System.out.println("A pilha está vazia? " + pilha.isVazia());

        System.out.println("Nó removido: " + pilha.desempilhar().getConteudo());
        System.out.println("Nó removido: " + pilha.desempilhar().getConteudo());
        System.out.println("Nó removido: " + pilha.desempilhar().getConteudo());
        System.out.println("Nó removido: " + pilha.desempilhar().getConteudo());

        System.out.println("A pilha está vazia? " + pilha.isVazia());
    }
}
