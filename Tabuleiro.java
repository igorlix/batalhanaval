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

    }
    public static void alterarTabuleiro () {

    }
}