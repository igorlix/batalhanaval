package upe.poli.games;

import java.util.Scanner;

import upe.poli.games.excecoes.EntradaInvalidaExcecao;

public class Game {
    private Jogador[] jogadores;

    Game(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public  void start() throws EntradaInvalidaExcecao{ 
        Scanner scanner = new Scanner(System.in);

        for (Jogador jogador : jogadores) {
            System.out.println("Jogador " + jogador.getNome() + " posicione seus barcos.");
 
            jogador.posicionarNavios();
            
        }

        boolean gameOver = false;
        Jogador jogador1 = jogadores[0];
        Jogador jogador2 = jogadores[1];

        while (!gameOver) {
            System.out.println("Turno de ataque de: " +jogador1.getNome());
            System.out.println("Grelha de Defesa:");
            jogador1.getGrelhaDeDefesa().printTabuleiro();
            System.out.println("Grelha de Ataque:");
            jogador1.getGrelhaDeAtaque().printTabuleiro();        
            
            int x, y;
            char z;
            
            do {
                System.out.print("Escolha uma linha: ");
                z = scanner.next().charAt(0);
                System.out.print("Escolha uma coluna: ");
                y = scanner.nextInt();
                x = Character.toLowerCase(z)-(int) 'a'; 
                
                if (jogador2.getGrelhaDeDefesa().getGrelha()[x][y] == 2) {
                    System.out.println("Posição já acertada, escolha uma nova posição.");
                }
            } while (jogador2.getGrelhaDeDefesa().getGrelha()[x][y] == 2);
          
            if (jogador2.getGrelhaDeDefesa().getGrelha()[x][y] == 1) { // '1' indica um navio ja posicionado
                System.out.println("Acertou!");
                jogador1.getGrelhaDeAtaque().setAcerto(x,y);
                jogador2.getGrelhaDeDefesa().setAcerto(x, y);
                if (jogador2.getGrelhaDeDefesa().naviosDestruidos()) {
                    System.out.println(jogador1.getNome() + " Vitória!");
                    gameOver = true;
                }
            } else {
                System.out.println("Errou!");
                jogador1.getGrelhaDeAtaque().setErro(x,y);
                jogador2.getGrelhaDeDefesa().setErro(x,y);           
            }

            // troca os jogadores
            Jogador atual = jogador1;
            jogador1 = jogador2;
            jogador2 = atual;
        }
        
    }
}