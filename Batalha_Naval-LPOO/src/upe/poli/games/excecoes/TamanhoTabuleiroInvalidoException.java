package upe.poli.games.excecoes;

public class TamanhoTabuleiroInvalidoException extends Exception {
    public TamanhoTabuleiroInvalidoException() {
        super("Tamanho do tabuleiro deve ser entre 5 e 10.");
    }
}