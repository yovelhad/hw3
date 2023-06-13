public class Enemy extends Unit{
    Integer experienceValue;


    public Enemy(Position p ){
        position = p ;

    }
    @Override
    public void combat(Unit unit) {
        Integer playerAttVal = unit.attackRole();
        Integer enemyDefVal = this.defenseRole();

        System.out.println("player attacking.");


    }

    @Override
    public void onDeath(Unit unit) {


    }

    public void accept(Unit unit){
        unit.visit(this);
    }
}
