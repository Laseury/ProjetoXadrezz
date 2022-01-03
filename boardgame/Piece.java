package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //Peça para onde a peça irá iniciar
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
