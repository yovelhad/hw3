public class Monster extends Enemy{
    Integer visionRange;

    public Monster(Character tile, String name, Integer health, Integer attack, Integer defence,Integer expVal, Integer visionRng) {
        super(tile);
        this.name = name;
        this.health = new Health(health);
        this.attackPoints = attack;
        this.defensePoints = defence;
        this.experienceValue = expVal;
        this.visionRange = visionRng;
    }
}
