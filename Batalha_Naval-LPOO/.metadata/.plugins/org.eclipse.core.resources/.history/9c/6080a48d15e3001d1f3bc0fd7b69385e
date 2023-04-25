package upe.poli.games;

public abstract class Navio {
    private String tipo;
    private int tamanho;
    private int naviosPosicionados = 0;

    public Navio(String tipo, int tamanho) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

	public int getNaviosPosicionados() {
		return naviosPosicionados;
	}

	public void setNaviosPosicionados(int naviosPosicionados) {
		this.naviosPosicionados = naviosPosicionados;
	}
	
	public abstract void colocarNoTabuleiro(Tabuleiro tabuleiro, int x, int y, boolean isVertical);
}





