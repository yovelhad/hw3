public class Wall extends Tile{
    public Wall(Position p){
        tile = '#' ;
        position = p ;
    }
    public void accept(Unit unit){
        unit.visit(this);
    }

}
