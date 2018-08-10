package de.marcoandra.listasSimplesmenteEncadeadas;

public class Lista {

    private No inicio;
    private int quantidade;

    public Lista() {
        this.inicio = null;
        this.quantidade = 0;
    }

    public void inserirInicio(No no){
        if (isVazia())
            this.inicio = no;
        else{
            no.setProximo(this.inicio);
            this.inicio = no;
        }
        this.quantidade++;
    }

    public void inserirFim(No no){
        if (isVazia())
            this.inicio = no;
        else {
            No aux = this.inicio;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(no);
        }
        this.quantidade++;
    }

    public void inserir(No no, int posicao){
        if (isVazia() || posicao <= 1)
            inserirInicio(no);
        else if (posicao > this.quantidade)
            inserirFim(no);
        else {

            No aux = this.inicio;
            No anterior = null;

            for (int i = 1; i < posicao; i++){
                anterior = aux;
                aux = aux.getProximo();
            }

            anterior.setProximo(no);
            no.setProximo(aux);
        }
        this.quantidade++;
    }

    public No remover(int posicao){

        No aux = null;

        if (!isVazia() && posicao <= this.quantidade){

            aux = this.inicio;
            No anterior = null;

            if (posicao == 1)
                this.inicio = this.inicio.getProximo();
            else {
                for (int i = 1; i < posicao; i++){
                    anterior = aux;
                    aux = aux.getProximo();
                }
                anterior.setProximo(aux.getProximo());
            }
            this.quantidade--;

        } else {
            System.out.println("Tentativa de remover uma posição inexistente!");
        }

        return aux;
    }

    public boolean isVazia(){
        return this.inicio == null;
    }

    public void imprimir(){
        if (isVazia())
            System.out.println("Lista vazia!");
        else {
            No aux = this.inicio;
            while (aux != null){
                System.out.print(aux.getElemento() + " ");
                aux = aux.getProximo();
            }
            System.out.print("\n");
        }
    }
}
