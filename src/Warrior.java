public class Warrior extends Player{
    Integer cooldown;
    Integer remainingCooldown;
    public Warrior(String name,Integer health,Integer attack,Integer defence,Integer cooldown){
        super(name,health,attack,defence);
        this.cooldown = cooldown;
        this.remainingCooldown = 0;
    }
}