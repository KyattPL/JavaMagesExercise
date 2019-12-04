import java.util.Scanner;
import java.util.Random;

public class Lista4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Mage mage;

        System.out.println("Choose your mage (1. Necromancer, != 1 . Pyromancer): ");
        int inputInt = getInputInt(scan);

        if(inputInt == 1){
            System.out.println("Your name: ");
            String name = getInputString(scan);
            System.out.println("Your zombies name: ");
            String zombieName = getInputString(scan);
            System.out.println("Your wands name: ");
            String wandName = getInputString(scan);
            mage = new Necromancer(name, 1, 100, 50, 20, 0,new Wand(wandName, 1), zombieName, 1);
        } else {
            System.out.println("Your name: ");
            String name = getInputString(scan);
            System.out.println("Your wands name: ");
            String wandName = getInputString(scan);
            mage = new Pyromancer(name, 1, 100, 50, 10, 0, new Wand(wandName, 1), 1);
        }
        String gameInput = "";
        while (!gameInput.equals("q")){
            System.out.println("Choose training type: wand, level, none:");
            gameInput = getInputString(scan);
            trainingTime(gameInput, mage);
            System.out.println("Choose resting activity: eat, drink, earn, none:");
            gameInput = getInputString(scan);
            restTime(gameInput, mage);
            fightTime(scan, mage);
            System.out.println("Do you want to quit? ( Press 'q' to quit): ");
            gameInput = getInputString(scan);
        }
    }

    public static void trainingTime(String gameInput, Mage mage){
        switch(gameInput){
            case "wand": Trainer.sharpenWand(mage); break;
            case "level": Trainer.train(mage); break;
            default: ;
        }
    }

    public static void restTime(String gameInput, Mage mage){
        switch(gameInput){
            case "eat": mage.eat(); break;
            case "drink": mage.drinkPotion(); break;
            case "earn": mage.earnMoney(); break;
            default: ;
        }
    }

    public static void fightTime(Scanner scan, Mage mage){
        Random rand = new Random();
        int randomizedInt = rand.nextInt(5) + 1;
        System.out.println("Choose your lucky number:");
        int inputRand = getInputInt(scan);
        if (inputRand == randomizedInt){
            System.out.println("I have won! I got " + randomizedInt*10 + " coins");
            mage.setMoney(mage.getMoney() + randomizedInt*10);
            mage.setHealth(100);
        } else {
            System.out.println("I have lost, my wounds are pretty bad, I now have " + (mage.getHealth() - randomizedInt*10) + " health.");
            mage.setHealth(mage.getHealth() - randomizedInt*10);
            if (mage.getHealth() <= 0){
                System.out.println("Long live " + mage.getName() + " who died today");
                System.exit(0);
            }
        }
    }

    public static String getInputString(Scanner scan){
        String str = "";
        try{
            str = scan.nextLine();
            //scan.nextLine();
        } catch (Exception e){
            System.out.println("Provide a valid string");
            str = getInputString(scan);
            //scan.nextLine();
        }
        return str;
    }

    public static double getInputDouble(Scanner scan){
        double doub = 0;
        try{
            doub = scan.nextDouble();
            scan.nextLine();
        } catch (Exception e){
            System.out.println("Provide a valid double");
            doub = getInputDouble(scan);
            scan.nextLine();
        }
        return doub;
    }

    public static int getInputInt(Scanner scan){
        int in = 0;
        try {
            in = scan.nextInt();
            scan.nextLine();
        } catch (Exception e){
            System.out.println("Provide a valid integer");
            in = getInputInt(scan);
            scan.nextLine();
        }
        return in;
    }
}
