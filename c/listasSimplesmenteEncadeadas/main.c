#include <stdio.h>
#include <stdlib.h>

typedef struct No{
    int conteudo;
    struct No *proximo;
} T_NO;

typedef struct Lista{
    T_NO *inicio;
    int quantidade;
} T_LISTA;

void criar(T_LISTA *lista){
    lista->inicio = NULL;
    lista->quantidade = 0;
}

int isVazia(T_LISTA *lista){
    return lista->inicio == NULL;
}

int tamanho(T_LISTA *lista){
    return lista->quantidade;
}

void inserirNoInicio(T_LISTA *lista, int conteudo){

    T_NO *novo;
    novo = malloc(sizeof(T_NO));
    novo->conteudo = conteudo;
    novo->proximo = NULL;

    if (isVazia(lista) == 1){
        lista->inicio = novo;
    } else {
        novo->proximo = lista->inicio;
        lista->inicio = novo;
    }
    lista->quantidade++;
}

void inserirNoFim(T_LISTA * lista, int conteudo){

    T_NO *no;
    no = malloc(sizeof(T_NO));
    no->conteudo = conteudo;
    no->proximo = NULL;

    if (isVazia(lista) == 1){
        lista->inicio = no;
    } else {
        T_NO *aux = lista->inicio;
        while (aux->proximo != NULL){
            aux = aux->proximo;
        }
        aux->proximo = no;
    }
    lista->quantidade++;
}

void inserirNaPosicao(T_LISTA *lista, int conteudo, int posicao){

    T_NO *novo;
    novo = malloc(sizeof(T_NO));
    novo->conteudo = conteudo;
    novo->proximo = NULL;

    if (posicao == 1){
        novo->proximo = lista->inicio;
        lista->inicio = novo;
    } else {
        T_NO *aux = lista->inicio;
        for (int i = 1; i < posicao - 1; i++){
            aux = aux->proximo;
        }
        novo->proximo = aux->proximo;
        aux->proximo = novo;
    }
    lista->quantidade++;
}

T_NO* remover(T_LISTA *lista, int posicao){

    T_NO *removido = NULL;

    if (posicao == 1){
        removido = lista->inicio;
        lista->inicio = removido->proximo;
    } else {
        T_NO *aux = lista->inicio;
        for(int i = 1; i < posicao - 1; i++){
            aux = aux->proximo;
        }
        removido = aux->proximo;
        aux->proximo = removido->proximo;
    }

    lista->quantidade--;
    removido->proximo = NULL;
    return removido;
}

void imprimir(T_LISTA *lista){
    if (isVazia(lista) == 0){
        T_NO *aux = lista->inicio;
        while (aux != NULL){
            printf("%d\n", aux->conteudo);
            aux = aux->proximo;
        }
    } else {
        printf("A lista está vazia!\n");
    }
}

int main() {

    T_LISTA l1;
    criar(&l1);
    imprimir(&l1);
    printf("A lista possui %d elementos.\n", tamanho(&l1));

    inserirNoFim(&l1, 9);
    inserirNoFim(&l1, 10);
    inserirNoInicio(&l1, 8);
    inserirNoInicio(&l1, 7);
    inserirNaPosicao(&l1, 99, 5);

    imprimir(&l1);
    printf("A lista possui %d elementos.\n", tamanho(&l1));

    //printf("Removido: %d\n", remover(&l1, 1)->conteudo);
    imprimir(&l1);
    printf("A lista possui %d elementos.\n", tamanho(&l1));

    return 0;
}