public class Rogue extends Player {
    Integer cost;
    Integer currentEnergy;
    public Rogue(String name, Integer health, Integer attack, Integer defence, Integer cost){
        super(name,health,attack,defence);
        this.cost = cost;
        this.currentEnergy = 100;
    }
}
