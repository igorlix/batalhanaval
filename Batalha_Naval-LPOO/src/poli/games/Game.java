package upe.poli.games;

import java.util.Scanner;

public class Game {
    private Jogador[] jogadores;

    Game(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    
    //
    public  void start() {   //Estou tendo um problema com esse metodo apos incluir diferentes tipos de navios, para pular para a parte do jogo apos a selecao de posicao das embarcacoes apague-o//
        Scanner scanner = new Scanner(System.in);

        for (Jogador jogador : jogadores) {
            System.out.println("Jogador " + jogador.getName() + " posicione seus barcos.");
            int size = jogador.getFormato().getSize();

            for (int i = 0; i < size; i++) {
                System.out.print("Escolha uma coordenada x seu barco " + (i + 1) + ": ");
                int x = scanner.nextInt();
                System.out.print("Escolha uma coordenada y seu barco " + (i + 1) + ": ");
                int y = scanner.nextInt();
                System.out.print("Escolha sua naçao: ");
                String tipo = scanner.next();
                jogador.setShip(tipo);
            }
        }
        //

        boolean gameOver = false;
        Jogador currentJogador = jogadores[0];
        Jogador otherJogador = jogadores[1];

        while (!gameOver) {
            System.out.println(currentJogador.getName() + " turno");
            currentJogador.getFormato().printTabuleiro();

            int x, y;
            do {
                System.out.print("Escolha uma coordenada x para acertar: ");
                x = scanner.nextInt();
                System.out.print("Escolha uma coordenada y para acertar: ");
                y = scanner.nextInt();
            } while (currentJogador.getFormato().getFormato()[x][y] != -1);

            if (otherJogador.getFormato().getFormato()[x][y] == 0) {
                System.out.println("Hit!");
                otherJogador.getFormato().setHit(x, y);
                if (otherJogador.getFormato().allShipsDestroyed()) {
                    System.out.println(currentJogador.getName() + " Vitória!");
                    gameOver = true;
                }
            } else {
                System.out.println("Errou!");
                otherJogador.getFormato().getFormato()[x][y] = 2;
            }

            // troca os jog adores
            Jogador temp = currentJogador;
            currentJogador = otherJogador;
            otherJogador = temp;
        }
    }
}