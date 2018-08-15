package de.marcoandra.pilhasComReferencia;

import java.util.Scanner;

public class Testar {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        char opcao = ' ';
        int valor = 0;

        do{
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Tamanho da pilha");
            System.out.println("s - Sair");

            Scanner s = new Scanner(System.in);
            opcao = s.next().charAt(0);

            switch (opcao){
                case '1':
                    System.out.println("Informe um número inteiro para empilhar: ");
                    valor = s.nextInt();
                    pilha.push(new No(valor));
                    break;
                case '2':
                    Object pop = pilha.pop();
                    if (pop != null) System.out.println(pop.toString());
                    else System.out.println("Pilha vazia!");
                    break;
                case '3':
                    System.out.println(pilha.tamanho());
                    break;
            }

        } while (opcao != 's');
    }
}
