public class Empty extends Tile{

    public Empty(Position p){
        super('.');
        this.position = p;
    }
    public void accept(Unit unit){
        unit.visit(this);
    }
}
