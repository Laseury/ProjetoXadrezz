package application;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        //Programa onde o Xadrez funcionar, Tetse
        Scanner sc = new Scanner (System.in);
        ChessMatch chessMatch = new ChessMatch();
        while(true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Origem: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Destino: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);

        }
    }
}
