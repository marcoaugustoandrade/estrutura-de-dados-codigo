package de.marcoandra;

public class Teste {

    public static void main(String[] args) {

        System.out.println("## Listas Simplesmente Encadeadas ##");
        Lista lista = new Lista();

        lista.imprimir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.inserirNoFim(new No(10));
        lista.inserirNoFim(new No(11));
        lista.inserirNoInicio(new No(9));
        lista.inserirNoInicio(new No(8));
        lista.inserirNaPosicao(new No(99), 5);

        //System.out.println("Removido: " + lista.remover(4).getConteudo());

        lista.imprimir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

    }
}
