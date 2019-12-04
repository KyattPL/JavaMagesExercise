public class Necromancer extends Mage {

    private String zombieName;
    private int summonedZombies;
    private int terrorProtection;

    Necromancer(String name, int level, int health, int currentMana, int spellCost, double money, Wand wand, String zombieName, int terrorProtection){
        super(name, level, health, currentMana, spellCost, money, wand);
        this.zombieName = zombieName;
        this.summonedZombies = 0;
        this.terrorProtection = terrorProtection;
    }

    @Override
    public void drinkPotion() {
        if(getMana() == 100){
            System.out.println("I don't want to drink!");
        } else {
            setMana(Math.min(100, getMana() + 50));
            System.out.println("I feel very powerful right now! I have " + getMana() + " mana!");
        }
    }

    @Override
    public void eat() {
        if(getHealth() == 100){
            System.out.println("Uhh... I'm full");
        } else {
            setHealth(Math.min(100, getHealth() + 5));
            System.out.println("Yummy! I have now " + getHealth() + " health!");
        }
    }

    @Override
    public void castSpell() {
        setMana(getMana() - getSpellCost());
        summonZombie();
    }

    @Override
    public void earnMoney(){
        setMoney(getMoney() + 10);
        System.out.println("I have now " + getMoney() + " money.");
    }

    public void summonZombie(){
        setSummonedZombies(getSummonedZombies()+1);
    }

    public void killZombie(){
        setSummonedZombies(getSummonedZombies()-1);
    }

    public int getSummonedZombies() {
        return summonedZombies;
    }

    public String getZombieName() {
        return zombieName;
    }

    public int getTerrorProtection() {
        return terrorProtection;
    }

    public void setZombieName(String zombieName) {
        this.zombieName = zombieName;
    }

    public void setSummonedZombies(int summonedZombies) {
        this.summonedZombies = summonedZombies;
    }

    public void setTerrorProtection(int terrorProtection) {
        this.terrorProtection = terrorProtection;
    }
}
