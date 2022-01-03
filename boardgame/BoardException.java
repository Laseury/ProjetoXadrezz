package boardgame;

public class BoardException extends RuntimeException{
    //Recebe as mensagens de erro do xadrez e repassar para o Runtime
    private static final long serialVersionUID = 1L;
    public BoardException(String msg){
        super(msg);
    }
}
