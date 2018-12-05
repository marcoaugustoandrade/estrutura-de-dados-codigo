package de.marcoandra;

public class Main {

    public static void main(String[] args) {

        Arvore arvore = new Arvore(4);
        arvore.inserir(2);
        arvore.inserir(1);
        arvore.inserir(3);
        arvore.inserir(6);
        arvore.inserir(5);
        arvore.inserir(7);

        System.out.println(arvore.buscar(2));

        System.out.println("Pré-ordem:");
        arvore.preOrdem();
        System.out.println("\nIn-ordem:");
        arvore.inOrdem();
        System.out.println("\nPós-ordem:");
        arvore.posOrdem();
        System.out.println("\nIn-ordem inversa:");
        arvore.inOrdemInvertida();


        // Implementação de índices com árvore binária

    }
}
