package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMatch {
    //Coração do Xadrez, as regras ficam aqui. :D

    private Board board;

    public ChessMatch(){
        //A partida inicia aqui
        board =  new Board(8,8);
        initialSetup();

    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for(int i = 0; i<board.getRows(); i++){

            for(int j=0; j< board.getColumns(); j++){

                mat[i][j] = (ChessPiece) board.piece(i,j);

            }
        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece){
        //Define onde as novas peças irão ficar pelo metodo ChessPostion
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        //Onde as peças irão se localizar, e colocar as peças pelo metodo placeNewPiece
        placeNewPiece('b', 6 , new Rook(board, Color.WHITE));
        placeNewPiece('b', 7, new Rook(board, Color.BLACK));

    }
}
