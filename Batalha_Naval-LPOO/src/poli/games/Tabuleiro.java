package poli.games;

public class Tabuleiro 
{
	public static char[][] tab ()
	{
	    char[][] tabuleiro = //X = navio, ~ = mar.
			   {
		    {'~', 'X', 'X', 'X', 'X', '~', '~', '~', '~', 'X'}, 
		    {'~', '~', '~', '~', '~', '~', '~', '~', '~', 'X'},
		    {'X', '~', '~', '~', 'X', 'X', '~', '~', '~', 'X'}, 
		    {'X', '~', '~', 'X', '~', '~', '~', '~', '~', '~'}, 
		    {'~', 'X', 'X', '~', 'X', 'X', 'X', '~', '~', '~'}, 
		    {'~', '~', '~', '~', '~', 'X', '~', '~', 'X', '~'},
		    {'~', '~', '~', '~', '~', 'X', '~', '~', '~', 'X'},
		    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
		    {'~', '~', '~', '~', 'X', '~','~', '~', '~', '~'},
		    {'X', 'X', 'X', '~', '~', '~', '~', '~', '~', '~'}, 
	    };
	    return tabuleiro;
	}
}
