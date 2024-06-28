public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        reset();
    }

    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
}