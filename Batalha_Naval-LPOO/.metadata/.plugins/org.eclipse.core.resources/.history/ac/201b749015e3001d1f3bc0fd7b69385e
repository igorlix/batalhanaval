package upe.poli.games;

public class Tabuleiro {
    private int[][] grelha;
    private int size;

    public Tabuleiro(int size) {
        this.size = size;
        grelha = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grelha[i][j] = 0;
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
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < size; j++) {
                if (grelha[i][j] == 0) { // indica um espaco vazio (mar)
                    System.out.print("~ "); 
                } else if (grelha[i][j] == 1) { // indica um navio
                    System.out.print("O "); 
                } else if (grelha[i][j] == 2) { // indica um navio acertado
                    System.out.print("X "); 
                }   else if (grelha[i][j] == 3) { // indica uma posicao vazia acertada  
                        System.out.print(". "); 
                }
            }
            System.out.println();
        }
    }

    public void setAcerto(int x, int y) {
        grelha[x][y] = 2;
    }
    public void setErro(int x, int y) {
        grelha[x][y] = 3;
    }
    

    public int getSize() {
        return size;
    }

    public int[][] getGrelha() {
        return grelha;
    }

    public boolean naviosDestruidos() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grelha[i][j] == 1 ) {
                    return false;
                }
            }
        }
        return true;
    }

}