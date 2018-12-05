package de.marcoandra;

public class Arvore {

    private int conteudo;
    private Arvore direita;
    private Arvore esquerda;


    public Arvore() {
        conteudo = 0;
        direita = esquerda = null;
    }

    public Arvore(int conteudo) {
        this.conteudo = conteudo;
        direita = null;
        esquerda = null;
    }


    // Verifica se a árvore está vazia
    public boolean isVazia(){
        return conteudo == 0;
    }

    // Inserção de elementos
    public void inserir(int conteudo){

        if (isVazia()){
           this.conteudo = conteudo;
        } else {

            Arvore novaArvore = new Arvore(conteudo);

            // Inserir na esquerda
            if (conteudo < this.conteudo){
               // Caso não tenha filhos na esquerda
               if (this.esquerda == null){
                   this.esquerda = novaArvore;
                   //System.out.println(conteudo + " à esquerda de " + this.conteudo);
               } else { //
                   this.esquerda.inserir(conteudo);
               }
            } else if (conteudo > this.conteudo) { // Inserir na direita
                // Caso não tenha filhos na direita
                if (this.direita == null){
                    this.direita = novaArvore;
                    //System.out.println(conteudo + " à direita de " + this.conteudo);
                } else {
                    this.direita.inserir(conteudo);
                }
            }
       }
    }

    public boolean buscar(int conteudo){
        if (isVazia()){
            return false;
        }
        if (this.conteudo == conteudo){
            return true;
        } else {
            if (conteudo < this.conteudo){
                if (esquerda == null){
                    return  false;
                } else {
                    return esquerda.buscar(conteudo);
                }
            } else if (conteudo > this.conteudo){
                if (direita == null){
                    return false;
                } else {
                    return direita.buscar(conteudo);
                }
            }
        }
        return false;
    }

    // Percorrer em pre-ordem
    public void preOrdem(){

        if (!isVazia()){

            System.out.print(conteudo + " ");

            if (esquerda != null){
                esquerda.preOrdem();
            }
            if (direita != null){
                direita.preOrdem();
            }
        }
    }

    // Percorrer em in-ordem
    public void inOrdem(){
        if (!isVazia()){

            if (esquerda != null){
                esquerda.inOrdem();
            }

            System.out.print(conteudo + " ");

            if (direita != null){
                direita.inOrdem();
            }
        }
    }

    // Percorrer em pós-ordem
    public void posOrdem(){
        if (!isVazia()){
            if (esquerda != null){
                esquerda.posOrdem();
            }
            if (direita != null){
                direita.posOrdem();
            }
            System.out.print(conteudo + " ");
        }
    }

    // Percorrer em in-ordem invertida
    public void inOrdemInvertida(){
        if (!isVazia()){

            if (direita != null){
                direita.inOrdemInvertida();
            }

            System.out.print(conteudo + " ");

            if (esquerda != null){
                esquerda.inOrdemInvertida();
            }
        }
    }


    // getters e setters
    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public Arvore getDireita() {
        return direita;
    }

    public void setDireita(Arvore direita) {
        this.direita = direita;
    }

    public Arvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Arvore esquerda) {
        this.esquerda = esquerda;
    }
}
