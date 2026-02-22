package CreationalDesignPattern.PrototypePattern.GoodCode;

public class GamePiece implements Prototype<GamePiece>{

    private String color;
    private int position;

    public void setColor(String color) {
        this.color = color;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public String getColour(){
        return color;
    }
    public int getPosition(){
        return position;
    }

    public GamePiece(String color, int position){
        this.color = color;
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" + "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public GamePiece clone() {
        //clone logic
        return new GamePiece(this.color, this.position);
    }
}
