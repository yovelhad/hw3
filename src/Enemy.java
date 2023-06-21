public abstract class Enemy extends Unit{
    Integer experienceValue;
    public Enemy(Character tile){
        super(tile);
    }
    @Override
    public void combat(Unit unit) {
        Integer playerAttVal = unit.attackRole();
        Integer enemyDefVal = this.defenseRole();
        Integer damageReceived = playerAttVal - enemyDefVal;
        if(damageReceived > 0){
            reduceLife(damageReceived);
        }
        System.out.println("player attacking.");
    }
    public void reduceLife(Integer damage){
        health.setHealthAmount(health.getCurr() - damage);
        if(health.getCurr() <=0){
            onDeath(this);
        }
    }

    @Override
    public void onDeath(Unit unit) {
        System.out.println("remove enemy");
    }

    public void accept(Unit unit){
        unit.visit(this);
    }
}
