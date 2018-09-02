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
        novo->proximo = lista->inicio;
    } else {

        novo->proximo = lista->inicio;

        T_NO *aux = lista->inicio;
        while (aux->proximo != lista->inicio){
            aux = aux->proximo;
        }

        aux->proximo = novo;
        lista->inicio = novo;
    }
    lista->quantidade++;
}

void inserirNoFim(T_LISTA *lista, int conteudo){

    T_NO *novo;
    novo = malloc(sizeof(T_NO));
    novo->conteudo = conteudo;
    novo->proximo = NULL;

    if (isVazia(lista) == 1){
        novo->proximo = novo;
        lista->inicio = novo;
    } else {

        T_NO *aux = lista->inicio;
        while (aux->proximo != lista->inicio){
            aux = aux->proximo;
        }
        aux->proximo = novo;
        novo->proximo = lista->inicio;

    }
    lista->quantidade++;
}

void inserirNaPosicao(T_LISTA *lista, int conteudo, int posicao){

    if (posicao == 1){
        inserirNoInicio(lista, conteudo);
    } else {
        T_NO *aux = lista->inicio;
        for (int i = 1; i < posicao - 1; i++){
            aux = aux->proximo;
        }

        T_NO *novo;
        novo = malloc(sizeof(T_NO));
        novo->conteudo = conteudo;

        novo->proximo = aux->proximo;
        aux->proximo = novo;
        lista->quantidade++;
    }
}

// Para remoção considere uma posição válida
T_NO* remover(T_LISTA *lista, int posicao){

    T_NO *removido = NULL;

    if (posicao == 1){
        removido = lista->inicio;
        T_NO *aux = lista->inicio;
        while (aux->proximo != lista->inicio){
            aux = aux->proximo;
        }

        //Caso a lista tenha somente um único elemento
        if (aux != lista->inicio){
            aux->proximo = lista->inicio->proximo;
            lista->inicio = lista->inicio->proximo;
        } else {
            lista->inicio = NULL;
        }
    } else {
        T_NO *aux = lista->inicio;
        for (int i = 1; i < posicao - 1; i++){
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
        do {
            printf("%d\n", aux->conteudo);
            aux = aux->proximo;
        } while (aux != lista->inicio);
    } else {
        printf("A lista está vazia!");
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
    inserirNoFim(&l1, 11);
    inserirNaPosicao(&l1, 99, 6);
    // 7 8 9 10 11
    //printf("Removido (início): %d\n", remover(&l1, 5)->conteudo);

    imprimir(&l1);
    printf("A lista possui %d elementos.\n", tamanho(&l1));

    return 0;
}