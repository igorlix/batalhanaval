package upe.poli.games.navios;

import upe.poli.games.Navio;
import upe.poli.games.Tabuleiro;

public class Submarino extends Navio {
	 public Submarino() {
        super("Submarino", 2);
    }

    public void colocarNoTabuleiro(Tabuleiro tabuleiro, int x, int y, boolean isVertical) {
        int tamanho = getTamanho();
        for (int i = 0; i < tamanho; i++) {
            if (isVertical) {
                tabuleiro.getFormato()[x + i][y] = 0;
            } else {
                tabuleiro.getFormato()[x][y + i] = 0;
            }
        }
    }
}
