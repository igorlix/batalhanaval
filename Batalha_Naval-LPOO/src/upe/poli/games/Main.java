package upe.poli.games;
import java.util.Scanner;

import upe.poli.games.excecoes.EntradaInvalidaExcecao;
import upe.poli.games.navios.Contratorpedeiro;
import upe.poli.games.navios.Encouracado;
import upe.poli.games.navios.PortaAvioes;
import upe.poli.games.navios.Submarino;


public class Main 
{
    	public static void main(String[] args) throws EntradaInvalidaExcecao{
    		Scanner scanner = new Scanner(System.in);
    	
    		Navio[] navios = new Navio[4];
    		navios[0] = new PortaAvioes("Porta-Aviões",3);
    		navios[1] = new Encouracado("Encouraçado",4);
    		navios[2] = new Contratorpedeiro("Contratorpedeiro",3);
    		navios[3] = new Submarino("Submarino",2);

    		System.out.println("Bem-vindo ao jogo Batalha Naval");

            System.out.print("Insira o tamanho do tabuleiro (valor inteiro entre 5 e 10): ");
            int size = scanner.nextInt();
			
            if (size < 5 || size > 10) {
               throw new EntradaInvalidaExcecao();
            }
			
    	    Jogador[] Jogadores = new Jogador[2];
    	    for (int i = 0; i < 2; i++) 
    	    {
    	        System.out.print("Digite o nome do Jogador " + (i+1) + ": ");
    	        String nome = scanner.next();
    	        Jogadores[i] = new Jogador(nome, size, navios);
    	        
    	        //try {
    	          //  Jogadores[i].posicionarNavios();
    	      //  } catch (EntradaInvalidaExcessao e) {
    	            //System.out.println("Entrada inválida. Por favor, digite novamente.");
    	           // scanner.next(); // consome a entrada inválida
    	            
    	        //}
    	    }
			

    	    Game game = new Game(Jogadores);
    	    game.start();
			
    	}
}
