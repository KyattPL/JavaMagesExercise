public class Necromancer extends Mage {

    private String ghoulName;
    private int summonedGhouls;

    Necromancer(String name, int level, int health, int currentMana, int spellCost, double money, Wand wand, String ghoulName){
        super(name, level, health, currentMana, spellCost, money, wand);
        this.ghoulName = ghoulName;
        this.summonedGhouls = 0;
    }

    @Override
    public void drinkPotion() {
        setMana(Math.min(100, getMana() + 50));
    }

    @Override
    public void eat() {
        setHealth(Math.min(100, getHealth() + 5));
    }

    @Override
    public void castSpell() {
        setMana(getMana() - getSpellCost());
        summonGhoul();
    }

    @Override
    public void earnMoney(){
        setMoney(getMoney() + 10);
    }

    public void summonGhoul(){
        setSummonedGhouls(getSummonedGhouls()+1);
    }

    public void killGhoul(){
        setSummonedGhouls(getSummonedGhouls()-1);
    }

    public int getSummonedGhouls() {
        return summonedGhouls;
    }

    public String getGhoulName() {
        return ghoulName;
    }

    public void setGhoulName(String ghoulName) {
        this.ghoulName = ghoulName;
    }

    public void setSummonedGhouls(int summonedGhouls) {
        this.summonedGhouls = summonedGhouls;
    }
}
