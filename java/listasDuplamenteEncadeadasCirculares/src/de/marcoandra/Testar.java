package de.marcoandra;

public class Testar {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.imprimir();
        System.out.println("A lista possui " + lista.tamanho() + " elementos.");
        lista.inserirNoFim(new No(9));
        lista.inserirNoFim(new No(10));
        lista.inserirNoInicio(new No(8));
        lista.inserirNoInicio(new No(5));
        lista.inserirNoFim(new No(11));

        //5 8 9 10 11
        //lista.inserirNaPosicao(new No(99), 6);
        System.out.println("Removido: " + lista.remover(5).getConteudo());
        lista.inserirNoFim(new No(19));

        lista.imprimir();
        System.out.println("A lista possui " + lista.tamanho() + " elementos.");
    }
}
