package de.marcoandra.pilhasComArranjo;

import java.util.Scanner;

public class Testar {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        char opcao = ' ';
        int valor = 0;

        do{
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("s - Sair");

            Scanner s = new Scanner(System.in);
            opcao = s.next().charAt(0);

            switch (opcao){
                case '1':
                    System.out.println("Informe um número inteiro para empilhar: ");
                    valor = s.nextInt();
                    pilha.push(valor);
                    break;
                case '2':
                    System.out.println(pilha.pop());
                    break;
            }

        } while (opcao != 's');

    }
}
