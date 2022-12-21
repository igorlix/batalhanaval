public class Tabuleiro {
    int tabuleiro [][] = new int [10][10];
    int navioQuatroCanos [][] = new int [4][1];
    int navioTresCanos [][] = new int [3][1];
    int navioDoisCanos [][] = new int [2][1];
    int navioUmCano [][] = new int [1][1];
    int portaAviao; 

    public static void inicializarTabuleiro (int [][] tabuleiro) {
        for (int linha = 0; linha < 10; linha++)
        for (int coluna = 0; coluna < 10; coluna ++ )
        tabuleiro[linha][coluna]=0; 
    }
    public static void mostrarTabuleiro (int [][] tabuleiro) {
        System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");
        for (int linha = 0; linha < 10; linha ++) {
            System.out.print((linha+1)+" "); 
            for (int coluna = 0; coluna < 10; coluna++) {
                if (tabuleiro[linha][coluna] == 0) {
                    System.out.print("\t" + "~");
                } else if (tabuleiro[linha][coluna] == -1) {
                    System.out.print("\t" + "•"); 
                } else if (tabuleiro[linha][coluna] == 1) {
                    System.out.print("\t" + "X"); 
                } 
            }
            System.out.println(); 
        }
    }
    public static void alterarTabuleiro () {

    }
}
