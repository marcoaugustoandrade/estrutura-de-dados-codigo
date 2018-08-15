package de.marcoandra.filasCircularComArranjo;

public class Fila {

    private int valores[];
    private int inicio;
    private int fim;
    private int quantidade;

    public Fila() {
        this.valores = new int[10];
        this.inicio = 0;
        this.fim = 0;
        this.quantidade = 0;
    }

    public void enfileirar(int elemento){
        if (!isCheia()){
            this.valores[this.fim] = elemento;
            this.fim++;
        }
    }

    public int desenfileirar(){
        return 0;
    }

    public boolean isVazia(){
        return this.quantidade == 0;
    }

    public boolean isCheia(){
        return this.quantidade == 10;
    }
}
