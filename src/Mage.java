public class Mage extends Player {
    Integer manaPool;
    Integer currentMana;
    Integer manaCost;
    Integer spellPower;
    Integer hitsCount;
    Integer abilityRange;

    public Mage(String name,Integer health,Integer attack,Integer defence,Integer manaPool,Integer manaCost,Integer spellPower,Integer hitCount,Integer range){
        super(name,health,attack,defence);
        this.manaPool = manaPool;
        this.currentMana = manaPool / 4;
        this.manaCost = manaCost;
        this.spellPower = spellPower;
        this.hitsCount = hitCount;
        this.abilityRange = range;
        }
    public String manaToString(){
        return currentMana+"/"+manaPool;
    }
    public String toString(){
        String ans = super.toString() + "       " + "Mana: " + manaToString() + "       " + "Spell Power:" + spellPower;
        return ans;
    }

}
