package upe.poli.games.navios;

import upe.poli.games.Navio;
import upe.poli.games.Tabuleiro;

public class Encouracado extends Navio {
    public Encouracado(String tipo, int tamanho) {
        super(tipo, tamanho);
    }

    public void colocarNoTabuleiro(Tabuleiro tabuleiro, int x, int y, boolean isVertical) {
        int tamanho = getTamanho();
        for (int i = 0; i < tamanho; i++) {
            if (isVertical) {
                tabuleiro.getGrelha()[x + i][y] = 1;
            } else {
                tabuleiro.getGrelha()[x][y + i] = 1;
            }
        }
    }
}