public class Player extends Unit{
    Integer experience;
    Integer playerLevel;
    Integer resources;
    public Player(String name,Integer health,Integer attack,Integer defence)
    {
        super('@');
        this.name = name;
        this.health = new Health(health);
        this.attackPoints = attack;
        this.defensePoints = defence;
    }
    @Override
    public void combat(Unit unit) {
        Integer enemyAttVal = unit.attackRole();
        Integer playerDefVal = this.defenseRole();
        Integer damageReceived = enemyAttVal - playerDefVal;
        if(damageReceived > 0){
            reduceLife(damageReceived);
        }
        levelUp();
        System.out.println("enemy attacking.");
    }
    public void reduceLife(Integer damage){
        health.setHealthAmount(health.getCurr() - damage);
        if(health.getCurr() <=0){
            onDeath(this);
        }
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
