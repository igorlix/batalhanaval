package upe.poli.games;

public abstract class Navio {
    private String tipo;
    private int tamanho;

    public Navio(String tipo, int tamanho) {
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public abstract void colocarNoTabuleiro(Tabuleiro tabuleiro, int x, int y, boolean isVertical);
}





