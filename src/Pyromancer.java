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
        setMana(Math.min(100, getMana() + 10));
    }

    @Override
    public void eat() {
        setHealth(Math.min(100, getHealth() + 30));
    }

    @Override
    public void castSpell() {
        setMana(getMana() - getSpellCost());
        setOverheat(getOverheat() + 1);
    }

    @Override
    public void earnMoney(){
        setMoney(getMoney() + 20);
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
