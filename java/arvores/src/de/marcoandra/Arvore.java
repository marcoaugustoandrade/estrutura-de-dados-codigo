package de.marcoandra;

public class Arvore {

    private No no;
    private Arvore direita;
    private Arvore esquerda;

    public Arvore() {
        this.no = null;
        this.direita = null;
        this.esquerda = null;
    }

    public Arvore(No no) {
        this.no = no;
        this.direita = null;
        this.esquerda = null;
    }


    // Verifica se a árvore está vazia
    public boolean isVazia(){
        return no == null;
    }

    // Inserção de elementos
    public void inserir(No no){
       if (isVazia()){
           this.no = no;
       } else {

           Arvore novaArvore = new Arvore(no);

           // Inserir na esquerda
           if (no.getConteudo() < this.no.getConteudo()){
               if (this.esquerda == null){
                   this.esquerda = novaArvore;
               } else {
                   this.esquerda.inserir(no);
               }
           } else if (no.getConteudo() > this.no.getConteudo()) { // Inserir na direita
            if (this.direita == null){
                this.direita = novaArvore;
            } else {
                this.direita.inserir(no);
            }
           }
       }
    }

    // Percorrer uma árvore
    // Pre-ordem

    // In-ordem

    // Pós-ordem


    // getters e setters
    public No getNo() {
        return no;
    }

    public void setNo(No no) {
        this.no = no;
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
