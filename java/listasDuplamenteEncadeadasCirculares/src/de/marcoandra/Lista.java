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
            no.setAnterior(fim);
            no.setProximo(inicio);
        } else {
            no.setProximo(inicio);
            inicio.setAnterior(no);
            inicio = no;
            no.setAnterior(fim);
            fim.setProximo(no);
        }
        quantidade++;
    }

    public void inserirNoFim(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
            no.setAnterior(fim);
            no.setProximo(inicio);
        } else {
            fim.setProximo(no);
            no.setAnterior(fim);
            fim = no;
            no.setProximo(inicio);
            inicio.setAnterior(no);
        }
        quantidade++;
    }

    public void inserirNaPosicao(No no, int posicao){

        if (posicao == 1){
            inserirNoInicio(no);
        } else {
            No aux = inicio;
            for (int i = 1; i < posicao - 1; i++){
                aux = aux.getProximo();
            }
            no.setProximo(aux.getProximo());
            no.setAnterior(aux);
            aux.getProximo().setAnterior(no);
            aux.setProximo(no);

            //Ajustando o fim da lista
            No auxFim = inicio;
            while (auxFim.getProximo() != inicio){
                auxFim = auxFim.getProximo();
            }
            fim = auxFim;

            quantidade++;
        }
    }

    public No remover(int posicao){

        No removido = null;

        if (posicao == 1){
            removido = inicio;
            No aux = inicio;
            while (aux.getProximo() != inicio){
                aux = aux.getProximo();
            }
            aux.setProximo(inicio.getProximo());
            inicio.getProximo().setAnterior(aux);
            inicio = removido.getProximo();
        } else {
            No aux = inicio;
            for (int i = 1; i < posicao - 1; i++){
                aux = aux.getProximo();
            }
            removido = aux.getProximo();
            aux.setProximo(removido.getProximo());
            removido.getProximo().setAnterior(aux);

        }

        //Ajustando o fim da lista
        No auxFim = inicio;
        while (auxFim.getProximo() != inicio){
            auxFim = auxFim.getProximo();
        }
        fim = auxFim;

        quantidade--;
        removido.setAnterior(null);
        removido.setProximo(null);
        return removido;
    }

    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            do{
                System.out.println(aux.getConteudo());
                aux = aux.getProximo();
            } while (aux != inicio);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
