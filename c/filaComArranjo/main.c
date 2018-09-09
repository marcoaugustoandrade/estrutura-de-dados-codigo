#include <stdio.h>

typedef struct Fila{
    int elementos[5];
    int inicio;
    int fim;
    int quantidade;
} T_FILA;

void criar(T_FILA *fila){
    fila->inicio = 0;
    fila->fim = 0;
    fila->quantidade = 0;
}

int isVazia(T_FILA *fila){
    return fila->quantidade == 0;
}

int isCheia(T_FILA *fila){
    return fila->quantidade == 5;
}

void enfileirar(T_FILA *fila, int elemento){
    if (!isCheia(fila)){
        fila->elementos[fila->fim] = elemento;
        fila->fim = (fila->fim + 1) % 10;
        fila->quantidade++;
    } else {
        printf("A fila está cheia!\n");
    }
}

int desinfileirar(T_FILA * fila){
   int elemento = fila->elementos[fila->inicio];
   fila->inicio = (fila->inicio + 1) % 10;
   fila->quantidade--;
   return elemento;
}

int main() {

    T_FILA fila;
    criar(&fila);

    printf("A fila está vazia? %d\n", isVazia(&fila));
    printf("A fila está cheia? %d\n", isCheia(&fila));

    enfileirar(&fila, 1);
    enfileirar(&fila, 2);
    enfileirar(&fila, 3);
    enfileirar(&fila, 4);
    enfileirar(&fila, 5);
    enfileirar(&fila, 6);

    printf("A fila está vazia? %d\n", isVazia(&fila));
    printf("A fila está cheia? %d\n", isCheia(&fila));

    printf("Atendido: %d\n", desinfileirar(&fila));
    printf("Atendido: %d\n", desinfileirar(&fila));
    printf("Atendido: %d\n", desinfileirar(&fila));
    printf("Atendido: %d\n", desinfileirar(&fila));
    printf("Atendido: %d\n", desinfileirar(&fila));

    return 0;
}