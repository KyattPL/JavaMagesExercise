public class Trainer {

    public static void train(Mage mage){
        mage.setLevel(mage.getLevel() + 1);
        mage.setMoney(mage.getMoney() - 10*mage.level);
    }

    public static void sharpenWand(Mage mage){
        mage.wand.setAttackPower(mage.wand.getAttackPower() + 1);
        mage.setMoney(mage.getMoney() - 5*mage.wand.getAttackPower());
    }
}
