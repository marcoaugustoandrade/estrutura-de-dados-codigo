#include <stdio.h>
#include <stdlib.h>

typedef struct No{
    int conteudo;
    struct No *proximo;
    struct No *anterior;
} T_NO;

typedef struct Lista{
    T_NO *inicio;
    T_NO *fim;
    int quantidade;
} T_LISTA;

void criar(T_LISTA *lista){
    lista->inicio = NULL;
    lista->fim = NULL;
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
    novo->anterior = NULL;

    if (isVazia(lista) == 1){
        lista->inicio = novo;
        lista->fim = novo;
    } else {
        novo->proximo = lista->inicio;
        lista->inicio->anterior = novo;
        lista->inicio = novo;
    }
    lista->quantidade++;
}

void inserirNoFim(T_LISTA *lista, int conteudo){

    T_NO *novo;
    novo = malloc(sizeof(T_NO));
    novo->conteudo = conteudo;
    novo->proximo = NULL;
    novo->anterior = NULL;

    if (isVazia(lista) == 1){
        lista->inicio = novo;
        lista->fim = novo;
    } else {
        novo->anterior = lista->fim;
        lista->fim->proximo = novo;
        lista->fim = novo;
    }
    lista->quantidade++;
}

void inserirNaPosicao(T_LISTA *lista, int conteudo, int posicao){

    T_NO *novo;
    novo = malloc(sizeof(T_NO));
    novo->conteudo = conteudo;
    novo->anterior = NULL;
    novo->proximo = NULL;

    if (posicao == 1){
        novo->proximo = lista->inicio;
        lista->inicio->anterior = novo;
        lista->inicio = novo;
    } else {
        T_NO *aux = lista->inicio;
        for (int i = 1; i < posicao - 1; i++){
            aux = aux->proximo;
        }
        novo->proximo = aux->proximo;
        novo->anterior = aux;
        aux->proximo = novo;
        if (aux->proximo != NULL)
            aux->proximo->anterior = novo;
    }

    //Ajustando o fim da lista
    T_NO *auxF = lista->inicio;
    while (auxF->proximo != NULL){
        auxF = auxF->proximo;
    }
    lista->fim = auxF;
    lista->quantidade++;

}

T_NO* remover(T_LISTA *lista, int posicao){

    T_NO *removido;

    if (posicao == 1){
        removido = lista->inicio;
        lista->inicio = removido->proximo;
    } else {
        T_NO *aux = lista->inicio;
        for (int i = 1; i < posicao - 1; i++){
            aux = aux->proximo;
        }
        removido = aux->proximo;
        if (removido->proximo != NULL)
            removido->proximo->anterior = aux;
        aux->proximo = removido->proximo;
    }

    //Ajustando o fim da lista
    T_NO *auxF = lista->inicio;
    while (auxF->proximo != NULL){
        auxF = auxF->proximo;
    }
    lista->fim = auxF;

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
    printf("## Listas Duplamente Encadeadas ##");
    imprimir(&l1);
    printf("A lista possui %d elementos.\n", tamanho(&l1));

    inserirNoFim(&l1, 9);
    inserirNoFim(&l1, 10);
    inserirNoInicio(&l1, 8);
    inserirNoInicio(&l1, 7);
    inserirNoFim(&l1, 11);
    inserirNaPosicao(&l1, 99, 2);

    imprimir(&l1);
    printf("A lista possui %d elementos.\n", tamanho(&l1));

    //printf("Removido: %d\n", remover(&l1, 5)->conteudo);
    //imprimir(&l1);
    //printf("A lista possui %d elementos.\n", tamanho(&l1));
    return 0;
}