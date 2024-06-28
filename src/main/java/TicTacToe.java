public class TicTacToe {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;

    //Konstruktor
    public TicTacToe() {
        board = new Board();
        players = new Player[2];
        players[0] = new Player('X');
        players[1] = new Player('O');
        currentPlayerIndex = 0;
    }
}