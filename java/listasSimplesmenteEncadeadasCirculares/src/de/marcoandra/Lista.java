package de.marcoandra;

public class Lista {

    private No inicio;
    private int quantidade;

    public Lista() {
        inicio = null;
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
           no.setProximo(inicio);
        } else {
            no.setProximo(inicio);
            No aux = inicio;
            while (aux.getProximo() != inicio){
                aux = aux.getProximo();
            }
            aux.setProximo(no);
            inicio = no;
        }
        quantidade++;
    }

    public void inserirNoFim(No no){
        if(isVazia()){
            no.setProximo(no);
            inicio = no;
        } else {
            No aux = inicio;
            while (aux.getProximo() != inicio){
                aux = aux.getProximo();
            }
            aux.setProximo(no);
            no.setProximo(inicio);
        }
        quantidade++;
    }

    public void inserirNaPosicao(No no, int posicao){

        if (posicao == 1){
            inserirNoInicio(no);
        } else {
            No aux = inicio;
            for(int i = 1; i < posicao - 1; i++){
                aux = aux.getProximo();
            }
            no.setProximo(aux.getProximo());
            aux.setProximo(no);
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
            //Caso a lista tenha somente um único elemento
            if (aux != inicio) {
                aux.setProximo(inicio.getProximo());
                inicio = inicio.getProximo();
            } else {
                inicio = null;
            }

        } else {
            No aux = inicio;
            for (int i = 1; i < posicao - 1; i++){
                aux = aux.getProximo();
            }
            removido = aux.getProximo();
            aux.setProximo(removido.getProximo());
        }

        quantidade--;
        removido.setProximo(null);
        return removido;
    }

    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            do {
                System.out.println(aux.getConteudo());
                aux = aux.getProximo();
            } while(aux != inicio);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

}
