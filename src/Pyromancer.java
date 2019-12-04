public class Pyromancer extends Mage{

    private int fireProtection;
    private int overheat;

    Pyromancer(String name, int level, int health, int currentMana, int spellCost, double money, Wand wand, int fireProtection){
        super(name, level, health, currentMana, spellCost, money, wand);
        this.fireProtection = fireProtection;
        this.overheat = 0;
    }

    @Override
    public void drinkPotion() {
        if(getMana() == 100){
            System.out.println("I don't want to drink!");
        } else {
            setMana(Math.min(100, getMana() + 15));
            System.out.println("I feel very powerful right now! I have " + getMana() + " mana!");
        }
    }

    @Override
    public void eat() {
        if(getHealth() == 100){
            System.out.println("Uhh... I'm full");
        } else {
            setHealth(Math.min(100, getHealth() + 25));
            System.out.println("Yummy! I have now " + getHealth() + " health!");
        }
    }

    @Override
    public void castSpell() {
        setMana(getMana() - getSpellCost());
        setOverheat(getOverheat() + 1);
    }

    @Override
    public void earnMoney(){
        setMoney(getMoney() + 20);
        System.out.println("I have now " + getMoney() + " money.");
    }

    public void checkOverheat(){
        if (overheat > 10){
            setHealth(getHealth() - 10);
            setOverheat(getOverheat() - 1);
        }
    }

    public int getFireProtection() {
        return fireProtection;
    }

    public int getOverheat() {
        return overheat;
    }

    public void setFireProtection(int fireProtection) {
        this.fireProtection = fireProtection;
    }

    public void setOverheat(int overheat) {
        this.overheat = overheat;
    }
}
