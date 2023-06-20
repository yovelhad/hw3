import java.util.Random;

public abstract class Unit extends Tile {
    String name;
    Integer attackPoints;
    Integer defensePoints;
    Health health;
    public Unit(Character tile){
        super(tile);
    }

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
    public Integer attackRole(){
        Random rand = new Random();
        Integer attackValue = rand.nextInt(attackPoints+1);
        return attackValue;
    }
    public Integer defenseRole(){
        Random rand = new Random();
        Integer defenceValue = rand.nextInt(defensePoints+1);
        return defenceValue;
    }
    public String toString(){
        String ans = name+ "        " + "Health: " + health.toString() + "      " + "Attack: " + attackPoints + "       " + "Defence: " + defensePoints ;
        return  ans ;
    }

    public abstract void combat(Unit unit);
    public abstract void onDeath(Unit unit);


}


