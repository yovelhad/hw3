public abstract class Unit extends Tile {
    Integer attackPoints;
    Integer defensePoints;

    public void interact(Tile tile) {
        tile.accept(this);
    }

    public void visit(Wall wall) {
        System.out.println("wall");
    }

    public void visit(Empty empty) {
        empty.swapPositions(this);
    }
    public void visit(Unit unit){
        unit.combat(this);
    }
    public void accept(Unit unit){
        unit.visit(this);
    }

    public abstract void combat(Unit unit);
    public abstract void onDeath(Unit unit);


}


