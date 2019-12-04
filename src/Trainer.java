public class Trainer {

    public static void train(Mage mage){
        if(mage.getMoney() - 10*mage.getLevel() >= 0) {
            mage.setMoney(mage.getMoney() - 10 * mage.getLevel());
            mage.setLevel(mage.getLevel() + 1);
            System.out.println("Your level is now " + mage.getLevel());
        } else {
            System.out.println("I don't have enough money! Required: " + 10 * mage.getLevel() + " and I have " + mage.getMoney());
        }
    }

    public static void sharpenWand(Mage mage){
        if((mage.getMoney() - 5*mage.wand.getAttackPower()) >= 0) {
            mage.setMoney(mage.getMoney() - 5 * mage.wand.getAttackPower());
            mage.wand.setAttackPower(mage.wand.getAttackPower() + 1);
            System.out.println("Your wands power is now " + mage.wand.getAttackPower());
        } else {
            System.out.println("I don't have enough money! Required: " + 5*mage.wand.getAttackPower() + " and I have " + mage.getMoney());
        }
    }

    public static void increaseProtection(Mage mage){
        if(mage instanceof Necromancer){
            if(mage.getMoney() - 10*((Necromancer) mage).getTerrorProtection() >= 0){
                mage.setMoney(mage.getMoney() - 10*((Necromancer) mage).getTerrorProtection());
                ((Necromancer) mage).setTerrorProtection(((Necromancer) mage).getTerrorProtection() + 1);
                System.out.println("My terror protection is now " + ((Necromancer) mage).getTerrorProtection());
            } else {
                System.out.println("I don't have enough money! Required: " + 10*((Necromancer) mage).getTerrorProtection() + " and I have " + mage.getMoney());
            }
        } else if(mage instanceof Pyromancer) {
            if(mage.getMoney() - 10*((Pyromancer) mage).getFireProtection() >= 0){
                mage.setMoney(mage.getMoney() - 10*((Pyromancer) mage).getFireProtection());
                ((Pyromancer) mage).setFireProtection(((Pyromancer) mage).getFireProtection() + 1);
                System.out.println("My fire protection is now " + ((Pyromancer) mage).getFireProtection());
            } else {
                System.out.println("I don't have enough money! Required: " + 10*((Pyromancer) mage).getFireProtection() + " and I have " + mage.getMoney());
            }
        }
    }
}
