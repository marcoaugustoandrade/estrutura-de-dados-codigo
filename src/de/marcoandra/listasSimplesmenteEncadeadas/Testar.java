package de.marcoandra.listasSimplesmenteEncadeadas;

import java.util.Scanner;

public class Testar {

    public static void main(String[] args) {

        Lista lista = new Lista();
        char opcao = ' ';
        int valor = 0, posicao = 0;

        do{
            System.out.println("1 - Inserir no início da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Inserir em alguma posição da lista");
            System.out.println("4 - Remover um elemento da lista");
            System.out.println("5 - Imprimir a lista");
            System.out.println("s - Sair");

            Scanner s = new Scanner(System.in);
            opcao = s.next().charAt(0);

            switch (opcao){
                case '1':
                    System.out.println("Informe um número inteiro: ");
                    valor = s.nextInt();
                    lista.inserirInicio(new No(valor));
                    break;
                case '2':
                    System.out.println("Informe um número inteiro: ");
                    valor = s.nextInt();
                    lista.inserirFim(new No(valor));
                    break;
                case '3':
                    System.out.println("Informe um número inteiro: ");
                    valor = s.nextInt();
                    System.out.println("Informe a posição: ");
                    posicao = s.nextInt();
                    lista.inserir(new No(valor), posicao);
                    break;
                case '4':
                    System.out.println("Informe a posição a ser removida: ");
                    posicao = s.nextInt();
                    try{
                        System.out.println("Elemento removido: " + lista.remover(posicao).getElemento());
                    } catch (Exception e){
                        ;
                    }

                    break;
                case '5':
                    System.out.println("Imprimindo a lista: ");
                    lista.imprimir();
                    break;
            }

        } while (opcao != 's');

    }
}
