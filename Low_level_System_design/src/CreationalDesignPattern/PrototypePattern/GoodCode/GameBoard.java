package CreationalDesignPattern.PrototypePattern.GoodCode;

import CreationalDesignPattern.PrototypePattern.GoodCode.GamePiece;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {

    private List<GamePiece> pieces = new ArrayList<>();
    public void addPiece(GamePiece piece){
        pieces.add(piece);
    }

    public List<GamePiece> getPieces(){
        return pieces;
    }
    public void showBoardState(){
        System.out.println("Current board state");
        for(GamePiece piece: pieces){
            System.out.println(piece);
        }
    }

    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        //some people will say ki newBoard.addPiece(piece); ---> this is shallow copy
        for(GamePiece piece : pieces){
            //we are cloning each piece separately (deep copy)
            newBoard.addPiece(piece.clone());
        }
        return newBoard;
    }
}
