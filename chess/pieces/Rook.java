package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
    //Peça torre
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "T";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        //return new boolean[0][];
        return mat;
    }
}
