public class Wand {
    private String name;
    private double attackPower;

    Wand(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    Wand(){
        this.name = "Wooden Wand";
        this.attackPower = 1;
    }

    public String getName() {
        return name;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }
}
