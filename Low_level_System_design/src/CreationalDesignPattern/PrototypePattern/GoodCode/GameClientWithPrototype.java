package CreationalDesignPattern.PrototypePattern.GoodCode;

public class GameClientWithPrototype {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));
        gameBoard.showBoardState();

        //Checkpoint this state
        //decoupled --> no need to worry to client or adding new objects and clonning
        GameBoard copiedBoard = gameBoard.clone();
//        //we are iterating while copying....
//        for(GamePiece piece: gameBoard.getPieces()){
//            //copy of game piece
//            copiedBoard.addPiece(new GamePiece(piece.getColour(), piece.getPosition()));
//        }
        System.out.println("Copied Board");
        copiedBoard.showBoardState();
        //less flexible
        //manual copy
    }
}
