public class Wall extends Tile{
    public Wall(Position p){
        super('#');
        this.position = p;
    }
    public void accept(Unit unit){
        unit.visit(this);
    }

}
