public abstract class Tile{
    char tile;
    Position position;
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position p){
        position = p;
    }
    public void swapPositions(Unit u){
        Position tempPosition = u.getPosition();
        u.setPosition(position);
        position = tempPosition;
        System.out.println("position swapped");
    }
    public abstract void accept(Unit unit);
}
