package boardgame;

public class Board {
    //Tabuleiro
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1){
            throw new BoardException("Erro criando tabuleiro, necessario ter pelo menos uma linha e uma coluna");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];

    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }


    public Piece piece(int row, int column){
        if(!positionExists(row, column)){
            throw new BoardException("Posição não existe no tabuleiro");
        }
        return pieces[row][column];
    }
    public Piece piece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Posição não existe no tabuleiro");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        //Colocar a peça na posição
        if(thereIsAPiece(position)){
            throw new BoardException("Tem uma peça aqui" + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;

    }

    public Piece removePiece(Position position){
        //Metodo para quando uma peça sair de lá, o sistema entende que não tem mais a peça
        if(!positionExists(position)){
            throw new BoardException("Posição não existe no tabuleiro");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    private boolean positionExists(int row,int column){
        //Ele ira verficar se tem lugar para a peça se mover comparando a coluna e a linha
        return row >= 0 && row < rows && column >= 0 && column < columns;

    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        //Verificar no metodo Piece se tem uma peça naquela matriz.
        if(!positionExists(position)){
            throw new BoardException("Posição não existe no tabuleiro");
        }
        return piece(position) != null;
    }
}
