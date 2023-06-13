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
        Integer enemyAttVal = unit.attackRole();
        Integer playerDefVal = this.defenseRole();
        System.out.println("enemy attacking.");
    }

    @Override
    public void onDeath(Unit unit) {
        System.out.println("game over");
    }

    public void accept(Unit unit){
        unit.visit(this);
    }
    public void levelUp(){
        if(experience >= 50*playerLevel ) {
            experience = experience - (50 * playerLevel);
            playerLevel = playerLevel + 1;
            health.setPool(health.getPool() + (10 * playerLevel));
            health.setHealthAmount(health.getPool());
            attackPoints = attackPoints + (4 * playerLevel);
            defensePoints = defensePoints + (1 * playerLevel);
        }
    }

}
