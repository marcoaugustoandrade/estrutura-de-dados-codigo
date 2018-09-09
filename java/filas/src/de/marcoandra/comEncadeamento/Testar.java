package de.marcoandra.comEncadeamento;

public class Testar {

    public static void main(String[] args) {

        Fila fila = new Fila();

        System.out.println("A fila está vazia? " + fila.isVazia());

        fila.enfileirar(new No(1));
        fila.enfileirar(new No(2));
        fila.enfileirar(new No(3));
        fila.enfileirar(new No(4));

        System.out.println("A fila está vazia? " + fila.isVazia());

        System.out.println("Atendido: " + fila.desinfileirar().getConteudo());
        System.out.println("Atendido: " + fila.desinfileirar().getConteudo());
        System.out.println("Atendido: " + fila.desinfileirar().getConteudo());
        System.out.println("Atendido: " + fila.desinfileirar().getConteudo());
    }
}
