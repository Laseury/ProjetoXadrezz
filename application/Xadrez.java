package application;

import boardgame.Board;
import chess.ChessMatch;

public class Xadrez {
    public static void main(String[] args) {
        //Programa onde o Xadrez funcionar
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}
