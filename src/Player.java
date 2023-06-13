public class Player extends Unit{
    Integer experience;
    Integer playerLevel;

    public Player(Position p){
        tile = '@' ;
        position = p ;
        experience=0 ;
        playerLevel = 1 ;

    }

    @Override
    public void combat(Unit unit) {
        System.out.println("enemy attacking.");
    }

    @Override
    public void onDeath(Unit unit) {

    }

    public void accept(Unit unit){
        unit.visit(this);
    }

}
