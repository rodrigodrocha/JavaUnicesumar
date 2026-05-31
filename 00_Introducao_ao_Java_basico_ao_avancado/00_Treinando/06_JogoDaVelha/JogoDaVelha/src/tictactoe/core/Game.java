package tictactoe.core;

public class Game {

    private final Board board = new Board();
    private final Players player = new Players();

    public void start(){
        System.out.println("Jogo iniciado");
    }
}
