package upe.poli.games.navios;

import upe.poli.games.Navio;
import upe.poli.games.Tabuleiro;

public class PortaAvioes extends Navio {
    public PortaAvioes(String tipo, int tamanho) {
        super("Porta-Aviões", 3);
    }

    public void colocarNoTabuleiro(Tabuleiro tabuleiro, int x, int y, boolean isVertical) {
        int tamanho = getTamanho();
        for (int i = 0; i < tamanho; i++) {
            if (isVertical) {
            	tabuleiro.getGrelha()[x + i][y] = 1;
            	tabuleiro.getGrelha()[x][y-1] = 1;
            	tabuleiro.getGrelha()[x][y+1] = 1;
            } else {
                tabuleiro.getGrelha()[x][y + i] = 1;
                tabuleiro.getGrelha()[x-1][y] = 1;
            	tabuleiro.getGrelha()[x+1][y] = 1;
            }
        }
    }
}
