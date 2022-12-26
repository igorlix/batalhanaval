package poli.games;

import java.util.Scanner;
//import poli.games.Tabuleiro;
//import poli.games.Tiros;

public class Logica 
{
	private static Scanner entrada;

	public static void logica () 
	{
		entrada = new Scanner(System.in);
		boolean sair = false;
		char [][] tabuleiro = Tabuleiro.tab();
		char[][] acertos = new char[5][5];
        int vezes =0;
        Tabuleiro.tab();
        while(sair==false)
        {
        	Tiros.tiros(acertos);
        	System.out.println("\nDigite as coordenadas x y do ataque.");
        	String tiro = entrada.nextLine();
        	vezes ++;
        	if(tiro.matches("\\d \\d") || tiro.matches("\\d{2} \\d{2}") || tiro.matches("\\d \\d{2}") || tiro.matches("\\d{2} \\d"))
        	{	
        		String[] coords = tiro.split(" ");
        		int coordY = Integer.parseInt(coords[0]);
        		int coordX = Integer.parseInt(coords[1]);
        		if(coordY > 0 && coordY < 6 && coordX > 0 && coordX < 6)
        		{
        			if(acertos[coordY-1][coordX-1] == 0)
        			{	
        				if(tabuleiro[coordY-1][coordX-1] != '~')
        				{
        					System.out.println("\n!Acertou um navio!"+tabuleiro[coordY-1][coordX-1]+"");
        				}
        			}
        		}
        	}
        	else
        	{
        		System.out.println("\n!Não acertou um navio!");
        	}
        	System.out.println("\nVocê atirou "+vezes+" vezes.");
        }	
	}	
}

