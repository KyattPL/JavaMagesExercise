import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Wand w1 = new Wand(getInputString(scan), getInputDouble(scan));
        Necromancer necro = new Necromancer("Laurentius", 1, 100,50, 15,0, w1, "Larl");
        Wand w2 = new Wand("Flammen", 7.5);
        Pyromancer pyro = new Pyromancer("Quelan", 1, 100, 100, 20, 0, w2, 5);

        if (necro.getMana() > necro.getSpellCost()){
            necro.castSpell();
        }

        Trainer.train(necro);
        Trainer.sharpenWand(necro);
        Trainer.train(pyro);
        Trainer.sharpenWand(pyro);
    }

    public static String getInputString(Scanner scan){
        String str = "";
        try{
            str = scan.nextLine();
            //scan.next();
        } catch (Exception e){
            System.out.println("Provide a valid string");
            str = getInputString(scan);
            //scan.next();
        }
        return str;
    }

    public static double getInputDouble(Scanner scan){
        double doub = 0;
        try{
            doub = scan.nextDouble();
            //scan.next();
        } catch (Exception e){
            System.out.println("Provide a valid double");
            doub = getInputDouble(scan);
            //scan.next();
        }
        return doub;
    }

    public static int getInputInt(Scanner scan){
        int in = 0;
        try {
            in = scan.nextInt();
            //scan.next();
        } catch (Exception e){
            System.out.println("Provide a valid integer");
            in = getInputInt(scan);
        }
        return in;
    }
}
