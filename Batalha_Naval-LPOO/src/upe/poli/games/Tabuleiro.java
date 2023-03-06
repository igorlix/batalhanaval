package upe.poli.games;

public class Tabuleiro {
    private int[][] formato;
    private int size;

    public Tabuleiro(int size) {
        this.size = size;
        formato = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                formato[i][j] = -1;
            }
        }
    }

    public void printTabuleiro() {
        System.out.print("  ");
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < size; j++) {
                if (formato[i][j] == -1) {
                    System.out.print(". ");
                } else if (formato[i][j] == 0) {
                    System.out.print("O ");
                } else if (formato[i][j] == 1) {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public void setShip(int x, int y, String tipo) {
        int size = 0;
        if (tipo.equals("Porta-Aviões")) {
            size = 5;
        } else if (tipo.equals("Encouraçado")) {
            size = 4;
        } else if (tipo.equals("Contratorpedeiro")) {
            size = 3;
        } else if (tipo.equals("Submarino")) {
            size = 2;
        }
        for (int i = 0; i < size; i++) {
            formato[x][y + i] = 0;
        }
    }

    public void setHit(int x, int y) {
        formato[x][y] = 1;
    }

    public int getSize() {
        return size;
    }

    public int[][] getFormato() {
        return formato;
    }

    public boolean allShipsDestroyed() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (formato[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}