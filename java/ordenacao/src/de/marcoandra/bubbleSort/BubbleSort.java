package de.marcoandra.bubbleSort;

public class BubbleSort {

    private int elementos[] = new int[]{10, 6, 4, 2, 5};

    public void ordenar(){

        int aux;

        for(int i = 0; i < elementos.length - 1; i++){
            System.out.println("Iteração: " + i);

            for (int j = 0; j < elementos.length - i - 1; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    aux = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;
                }
                imprimir();
            }
        }
    }

    public void imprimir(){
        for (int elemento: elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
