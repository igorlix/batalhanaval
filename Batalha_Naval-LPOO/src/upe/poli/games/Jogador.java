package upe.poli.games;

import java.util.Scanner;

public class Jogador 
{
    private String name;
    private Tabuleiro formato;
    private Navio[] navios;

    public Jogador(String name, int size, Navio[] navios) {
        this.name = name;
        this.formato = new Tabuleiro(size);
        this.navios = navios;
        
    }

    public String getName() {
        return name;
    }

    public Tabuleiro getFormato() {
        return formato;
    }

    public Navio[] getNavios() {
        return navios;
    }

    public void setShip(String tipoNavio) {
        Scanner scanner = new Scanner(System.in);
        for (Navio navio : navios) {
            
                while (true) {
                    formato.printTabuleiro();
                    System.out.println("Insira a posição inicial para o navio " + navio.getTipo() + " (tamanho: " + navio.getTamanho() + ")");
                    System.out.print("Linha: ");
                    int x = scanner.nextInt();
                    System.out.print("Coluna: ");
                    int y = scanner.nextInt();
                    System.out.print("Vertical? (true/false): ");
                    boolean isVertical = scanner.nextBoolean();

                    if (verificarDisponibilidade(formato, x, y, navio.getTamanho(), isVertical)) {
                        navio.colocarNoTabuleiro(formato, x, y, isVertical);
                        break;
                    } else 
                    {
                        System.out.println("Posição inválida, tente novamente.");
                    }
                }
            }
        }
    

    public boolean verificarDisponibilidade(Tabuleiro formato, int x, int y, int tamanho, boolean isVertical) {
        if (isVertical) {
            if (x + tamanho > formato.getSize()) {
                return false;
            }
            for (int i = x; i < x + tamanho; i++) {
                if (formato.getFormato()[i][y] != -1) {
                    return false;
                }
            }
        } else {
            if (y + tamanho > formato.getSize()) {
                return false;
            }
            for (int i = y; i < y + tamanho; i++) {
                if (formato.getFormato()[x][i] != -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public  void jogar(Jogador adversario) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            formato.printTabuleiro();
            System.out.println("Turno do jogador " + name);
            System.out.print("Linha: ");
            int x = scanner.nextInt();
            System.out.print("Coluna: ");
            int y = scanner.nextInt();

            if (adversario.getFormato().getFormato()[x][y] == -1) {
                System.out.println("Água!");
                adversario.getFormato().setHit(x, y);
                break;
            } else if (adversario.getFormato().getFormato()[x][y] == 0) {
                System.out.println("Acertou um navio!");
                adversario.getFormato().setHit(x, y);
                if (adversario.getFormato().allShipsDestroyed()) {
                    System.out.println("Parabéns, você venceu!");
                    System.exit(0);
                }
            } else {
                System.out.println("Já atirou nessa posição, tente novamente.");
            }
        }
    }
    
}

