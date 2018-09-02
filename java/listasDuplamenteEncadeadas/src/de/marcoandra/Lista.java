package de.marcoandra;

public class Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    public Lista() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public int tamanho(){
        return quantidade;
    }

    public void inserirNoInicio(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
        } else {
            no.setProximo(inicio);
            inicio.setAnterior(no);
            inicio = no;
        }
        quantidade++;
    }

    public void inserirNoFim(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
        } else {
            fim.setProximo(no);
            no.setAnterior(fim);
            fim = no;
        }
        quantidade++;
    }


    public void inserirNaPosicao(No no, int posicao){

        if (posicao == 1){
            no.setProximo(inicio);
            inicio.setAnterior(no);
            inicio = no;
        } else {
            No aux = inicio;
            for(int i = 1; i < posicao - 1; i++){
                aux = aux.getProximo();
            }
            no.setProximo(aux.getProximo());
            no.setAnterior(aux);
            aux.setProximo(no);
            if (aux.getProximo() != null)
                aux.getProximo().setAnterior(no);
        }

        //Ajustando o fim da lista:
        No aux = inicio;
        while (aux.getProximo() != null){
            aux = aux.getProximo();
        }
        fim = aux;

        quantidade++;
    }

    public No remover(int posicao){

        No removido = null;

        if (posicao == 1){
            removido = inicio;
            inicio = removido.getProximo();
        } else {
            No aux = inicio;
            for (int i = 1; i < posicao - 1; i++){
                aux = aux.getProximo();
            }
            removido = aux.getProximo();
            if (removido.getProximo() != null)
                removido.getProximo().setAnterior(aux);
            aux.setProximo(removido.getProximo());

        }

        //Ajustando o fim da lista:
        No aux = inicio;
        while (aux.getProximo() != null){
            aux = aux.getProximo();
        }
        fim = aux;

        quantidade--;
        removido.setProximo(null);
        return removido;
    }

    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            while (aux != null){
                System.out.println(aux.getConteudo());
                aux = aux.getProximo();
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
