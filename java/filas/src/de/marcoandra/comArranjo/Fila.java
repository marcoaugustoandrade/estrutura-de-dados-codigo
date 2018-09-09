package de.marcoandra.comArranjo;

public class Fila {

    private int elementos[];
    private int inicio;
    private int fim;
    private int quantidade;

    public Fila() {
        elementos = new int[5];
        inicio = 0;
        fim = 0;
        quantidade = 0;
    }

    public boolean isVazia(){
        return quantidade == 0;
    }

    public boolean isCheia(){
        return quantidade == 5;
    }

    public void enfileirar(int elemento){
        if (!isCheia()){
            elementos[fim] = elemento;
            fim = (fim + 1) % 10;
            /*fim = fim + 1;
            if (fim == 4){
                fim = 0;
            }*/
            quantidade++;
        } else {
            System.out.println("A pilha está cheia!");
        }
    }

    public int desinfileirar(){
        int elemento = elementos[inicio];
        inicio = (inicio + 1) % 10;
        quantidade--;
        return elemento;
    }


}
