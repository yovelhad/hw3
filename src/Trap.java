public class Trap extends Enemy{
    Integer visibilityTime;
    Integer invisibilityTime;
    Integer ticksCount;
    boolean visible;
    public Trap(Character tile,String name, Integer health, Integer attack, Integer defence,Integer expVal,Integer visibilityTime, Integer invisibilityTime){
        super(tile);
        this.name = name;
        this.health = new Health(health);
        this.attackPoints = attack;
        this.defensePoints = defence;
        this.experienceValue = expVal;
        this.visibilityTime = visibilityTime;
        this.invisibilityTime = invisibilityTime;
    }

}
