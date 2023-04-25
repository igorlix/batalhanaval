package upe.poli.games;

import java.util.Scanner;

import upe.poli.games.excecoes.EntradaInvalidaExcecao;

public class Jogador 
{
    private String nome;
    private Tabuleiro grelhaDeDefesa;
    private Tabuleiro grelhaDeAtaque;
    private Navio[] navios;
    private boolean[] naviosPosicionados;

    public Jogador(String nome, int size, Navio[] navios) {
        this.nome = nome;
        this.grelhaDeDefesa = new Tabuleiro(size);
        this.grelhaDeAtaque = new Tabuleiro(size);
        this.navios = navios;
        this.naviosPosicionados = new boolean[navios.length];
        
    }

    public String getNome() {
        return nome;
    }

    public Tabuleiro getGrelhaDeDefesa() {
        return grelhaDeDefesa;
    }
    
    public Tabuleiro getGrelhaDeAtaque() {
        return grelhaDeAtaque;
    }

    public Navio[] getNavios() {
        return navios;
    }

    public void posicionarNavios() throws EntradaInvalidaExcecao{
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < navios.length; i++) {
            Navio navio = navios[i];
            if (!naviosPosicionados[i]) {
                while (true) {
                	char z;
                    int x;
                    int y;
                    boolean vertical;
                    grelhaDeDefesa.printTabuleiro();
                    System.out.println("Insira a posição inicial para o navio " + navio.getTipo() + " (tamanho: " + navio.getTamanho() + ")");
                    
                    System.out.print("Linha: ");
                    if(scanner.hasNext("[a-zA-Z]")) {
                    	z =  scanner.next().charAt(0);
                    	x = Character.toLowerCase(z) -(int) 'a'; //Recebe char e transforma em int
                        x = x % 26; // Ignora o uso de letras Maiusculas
                    }else {
                    	throw new EntradaInvalidaExcecao();
                    }
                    
                    System.out.print("Coluna: ");
                    if(scanner.hasNextInt()) {
                    	y = scanner.nextInt();
                    }else {
                        	throw new EntradaInvalidaExcecao();
                          }
                    
                    System.out.print("Vertical? (true/false): ");
                    if(scanner.hasNextBoolean()) {
                    	vertical = scanner.nextBoolean();
                    }else {
                        	throw new EntradaInvalidaExcecao();
                          }
                    

                    if (verificarDisponibilidade(grelhaDeDefesa, x, y, navio.getTamanho(), vertical, navio.getTipo())) {
                        navio.colocarNoTabuleiro(grelhaDeDefesa, x, y, vertical);
                        naviosPosicionados[i] = true;
                        break;
                        
                    } else {
                        System.out.println("Posição inválida, tente novamente.");
                    }
                }
            }
        }
    }

    public boolean verificarDisponibilidade(Tabuleiro grelhaDeDefesa, int x, int y, int tamanho, boolean isVertical, String tipo) {
        if (isVertical) {
            if (x + tamanho > grelhaDeDefesa.getSize()) { 
            	// nao permite que o barco seja maior que o tabuleiro em x
                return false;
            }
            
            if (tipo.equals("Porta-Aviões")) { //"Porta-Aviões" possui regras de colocacao diferentes por conta de seu formato
                if (y + 1 > grelhaDeDefesa.getSize()) { // nao permite que o "Porta-Aviões" passe do tabuleiro
                    return false;
                }
                if (y - 1 < 0) { // nao permite que o "Porta-Aviões" passe do tabuleiro
                    return false;
                }
            }
            
            
            for (int i = x; i < x + tamanho; i++) { 
                if (grelhaDeDefesa.getGrelha()[i][y] != 0) { // varre a coordenada x + tamanho do navio verificando se há outro posicionado lá dado y
                    return false;
                }
            }
        } else {
            if (y + tamanho > grelhaDeDefesa.getSize()) { // nao permite que o barco seja maior que o tabuleiro em y
                return false;
            }
            if (tipo.equals("Porta-Aviões")) { //"Porta-Aviões" possui regras de colocacao diferentes por conta de seu formato
                if (x + 1 > grelhaDeDefesa.getSize()) { // nao permite que o "Porta-Aviões" passe do tabuleiro
                    return false;
                }
                if (x - 1 < 0) { // nao permite que o "Porta-Aviões" passe do tabuleiro
                    return false;
                }
           }
            for (int i = y; i < y + tamanho; i++) {
                if (grelhaDeDefesa.getGrelha()[x][i] != 0) { // varre a coordenada x + tamanho do navio verificando se há outro posicionado lá dado y
                    return false;
                }
            }
        }
        return true;
    }   
}

