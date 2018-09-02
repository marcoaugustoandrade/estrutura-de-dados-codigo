package de.marcoandra;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Lista lista = new Lista();
        char opcao;
        int valor, pos;

        do{
            System.out.println("## Listas Duplamente Encadeadas Circulares ##");
            System.out.println("1 - Inserir no início da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Inserir em alguma posição da lista");
            System.out.println("4 - Remover de alguma posição da lista");
            System.out.println("5 - Imprimir a lista");
            System.out.println("6 - Tamanho da lista");
            System.out.println("s - Sair");

            Scanner entrada = new Scanner(System.in);
            opcao = entrada.next().charAt(0);

            switch (opcao){
                case '1':
                    System.out.println("Informe o valor: ");
                    valor = entrada.nextInt();
                    lista.inserirNoInicio(new No(valor));
                    break;
                case '2':
                    System.out.println("Informe o valor: ");
                    valor = entrada.nextInt();
                    lista.inserirNoFim(new No(valor));
                    break;
                case '3':
                    System.out.println("Informe o valor: ");
                    valor = entrada.nextInt();
                    System.out.println("Informe a posição para inserção: ");
                    pos = entrada.nextInt();
                    lista.inserirNaPosicao(new No(valor), pos);
                    break;
                case '4':
                    System.out.println("Informe a posição para remoção: ");
                    pos = entrada.nextInt();
                    System.out.println("Valor removido: " + lista.remover(pos).getConteudo());
                    break;
                case '5':
                    lista.imprimir();
                    break;
                case '6':
                    System.out.println("Tamanho da lista: " + lista.tamanho());
                    break;
            }

        } while (opcao != 's');
    }

}
