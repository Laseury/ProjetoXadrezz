package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Posições invalidas");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }


    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        //Defini que coemça selencionando a linha e depois a coluna
        return new Position(8-row, column-'a');
    }

    protected static ChessPosition fromPosition(Position position){
        /*Função para calcular onde a peça irá ficar verificando as localizações, sendo que ele diminui 'a' sendo a coluna
        e 8 as linhas*/
        return new ChessPosition ((char)('a'- position.getColumn()), 8- position.getRow());
    }
    @Override
    public String toString(){
        return "" + column + row;
    }
}
