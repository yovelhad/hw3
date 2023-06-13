public class Empty extends Tile{

    public Empty(Position p){
        tile = '.' ;
        position = p ;
    }
    public void accept(Unit unit){
        unit.visit(this);
    }
}
