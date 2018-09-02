package de.marcoandra;

public class Teste {

    public static void main(String[] args) {

        System.out.println("## Listas Duplamente Encadeadas ##");
        Lista lista = new Lista();

        lista.imprimir();
        System.out.println("A lista possui " + lista.tamanho() + " elementos.");

        lista.inserirNoFim(new No(10));
        lista.inserirNoFim(new No(11));
        lista.inserirNoInicio(new No(9));
        lista.inserirNoInicio(new No(8));
        lista.inserirNaPosicao(new No(99), 5);
        lista.inserirNoFim(new No(100));

        //System.out.println("Removido: " + lista.remover(4).getConteudo());

        lista.imprimir();
        System.out.println("A lista possui " + lista.tamanho() + " elementos.");
    }



}
