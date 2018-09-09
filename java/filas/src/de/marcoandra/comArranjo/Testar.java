package de.marcoandra.comArranjo;

public class Testar {

    public static void main(String[] args) {

        Fila fila = new Fila();

        System.out.println("A fila está cheia? " + fila.isCheia());
        System.out.println("A fila está vazia? " + fila.isVazia());

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.enfileirar(6);

        System.out.println("Foi atendido: " + fila.desinfileirar());
        System.out.println("Foi atendido: " + fila.desinfileirar());
        System.out.println("Foi atendido: " + fila.desinfileirar());
        System.out.println("Foi atendido: " + fila.desinfileirar());
        System.out.println("Foi atendido: " + fila.desinfileirar());

    }
}
