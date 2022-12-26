package poli.games;

//import poli.games.Tabuleiro;

public class Tiros
{
	public static void tiros(char[][] acertos)
	{
		int i,j;
		System.out.println("   1 2 3 4 5");
		for(i=0; i<acertos.length; i++)
		{
			if((i+1)<5)
			{
				System.out.print(" "+(i+1)+" ");
			}
			else
			{
				System.out.print((i+1)+" ");
			}
			for(j=0; j<acertos[0].length; j++)
			{
				if(acertos[i][j] != 0)
				{
					System.out.print(acertos[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}

