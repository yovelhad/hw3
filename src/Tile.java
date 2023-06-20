public abstract class Tile{
    Character tile;
    Position position;
    public Tile(Character tile){
        this.tile = tile;
    }
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

    public char getSymbol() {
        return tile;
    }
}
