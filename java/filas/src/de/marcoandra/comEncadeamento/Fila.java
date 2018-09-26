package de.marcoandra.comEncadeamento;

public class Fila {

    private No inicio;
    private No fim;
    private int quantidade;

    public Fila() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void enfileirar(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
        } else {
            fim.setAnterior(no);
            fim = no;
        }
        quantidade++;
    }

    public No desinfileirar(){
        No remover = inicio;
        if (!isVazia()){
            inicio = inicio.getAnterior();
            remover.setAnterior(null);
            quantidade--;
            //Verificando se é o último elemento da fila
            if (isVazia()) fim = null;
        }
        return remover;
    }
}
