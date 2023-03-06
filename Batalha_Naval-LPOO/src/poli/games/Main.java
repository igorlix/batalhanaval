package upe.poli.games;
import java.util.Scanner;

import upe.poli.games.navios.Contratorpedeiro;
import upe.poli.games.navios.Encouracado;
import upe.poli.games.navios.PortaAvioes;
import upe.poli.games.navios.Submarino;


public class Main 
{
    	public static void main(String[] args) 
    	{
    	Scanner scanner = new Scanner(System.in);

    	    System.out.print("Escolha o tamanho do tabuleiro: ");
    	    int size = scanner.nextInt();
    	    
    	    Navio[] navios = new Navio[4];
            navios[0] = new PortaAvioes();
            navios[1] = new Encouracado();
            navios[2] = new Contratorpedeiro();
            navios[3] = new Submarino();

    	    Jogador[] Jogadors = new Jogador[2];
    	    for (int i = 0; i < 2; i++) 
    	    {
    	        System.out.print("Digite o nome do Jogador " + (i+1) + ": ");
    	        String name = scanner.next();
    	        Jogadors[i] = new Jogador(name, size, navios);
    	        
    	    }

    	    Game game = new Game(Jogadors);
    	    game.start();
    	}
}
