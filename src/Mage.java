abstract public class Mage {
    protected String name;
    protected int level;
    protected int health;
    protected int currentMana;
    protected int spellCost;
    protected double money;
    protected Wand wand;

    Mage(String name, int level, int health, int currentMana, int spellCost, double money, Wand wand){
        this.name = name;
        this.level = level;
        this.health = health;
        this.currentMana = currentMana;
        this.spellCost = spellCost;
        this.money = money;
        this.wand = wand;
    }

    public void introduceMage(){
        System.out.println("Greetings, I am " + name + ", lvl " + level + " and here's my greatest wand " + wand.getName());
    }

    abstract public void drinkPotion();
    abstract public void eat();
    abstract public void castSpell();
    abstract public void earnMoney();

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMana() {
        return currentMana;
    }

    public int getHealth() {
        return health;
    }

    public int getSpellCost() {
        return spellCost;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public void setSpellCost(int spellCost) {
        this.spellCost = spellCost;
    }
}

