abstract class Tile implements Visited,Visitor{
    char Tile;
    Position position;
    @Override
    public abstract boolean accept(Visitor v);

    @Override
    public boolean visit(Empty empty) {
        return false;
    }

    @Override
    public boolean visit(Wall wall) {
        return false;
    }

    @Override
    public boolean visit(Enemy enemy) {
        return false;
    }

    @Override
    public boolean visit(Player player) {
        return false;
    }
}
