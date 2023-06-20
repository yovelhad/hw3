public class Rogue extends Player {
    Integer cost;
    Integer currentEnergy;
    Integer energyPool;
    public Rogue(String name, Integer health, Integer attack, Integer defence, Integer cost){
        super(name,health,attack,defence);
        this.cost = cost;
        this.energyPool = 100;
        this.currentEnergy = energyPool;
    }
    public String energyToString(){
        return currentEnergy+"/"+energyPool;
    }
    public String toString(){
        String ans = super.toString() + "       " + "Energy: " + energyToString();
        return ans;
    }
}
