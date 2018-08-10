package de.marcoandra.listasDuplamenteEncadeadas;

public class Lista {

    private No primeiro, ultimo;
    private int quantidade;

    public Lista() {
        this.primeiro = this.ultimo = null;
        this.quantidade = 0;
    }

    public void inserirInicio(No no){
        if (isVazia())
            this.primeiro = this.ultimo = no;
        else {
            no.setProximo(this.primeiro);
            this.primeiro.setAnterior(no);
            this.primeiro = no;
        }
        this.quantidade++;
    }

    public void inserirFim(No no){
        if (isVazia())
            this.primeiro = this.ultimo = no;
        else {
            this.ultimo.setProximo(no);
            no.setAnterior(this.ultimo);
            this.ultimo = no;
        }
        this.quantidade++;
    }

    public void inserir(No no, int posicao){
        if (isVazia() || posicao <= 1)
            inserirInicio(no);
        else if (posicao > this.quantidade)
            inserirFim(no);
        else {

            No aux = this.primeiro;
            No anterior = null;

            for (int i = 1; i < posicao; i++){
                anterior = aux;
                aux = aux.getProximo();
            }

            anterior.setProximo(no);
            no.setAnterior(anterior);
            no.setProximo(aux);
            aux.setAnterior(no);
        }
        this.quantidade++;
    }

    public No remover(int posicao){

        No aux = null;

        if (!isVazia() && posicao <= this.quantidade){

            aux = this.primeiro;
            No anterior = null;

            if (posicao == 1){
                this.primeiro.getProximo().setAnterior(null);
                this.primeiro = this.primeiro.getProximo();
            } else {
                for (int i = 1; i < posicao; i++){
                    anterior = aux;
                    aux = aux.getProximo();
                }
                anterior.setProximo(aux.getProximo());
                if (aux.getProximo() != null)
                    aux.getProximo().setAnterior(anterior);
            }
            this.quantidade--;

        } else {
            System.out.println("Tentativa de remover uma posição inexistente!");
        }

        return aux;
    }

    public boolean isVazia(){
        return this.primeiro == null;
    }

    public void imprimir(){
        if (isVazia())
            System.out.println("Lista vazia!");
        else {
            No aux = this.primeiro;
            while (aux != null){
                System.out.print(aux.getElemento() + " ");
                aux = aux.getProximo();
            }
            System.out.print("\n");
        }
    }
}
