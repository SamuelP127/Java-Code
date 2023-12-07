import java.util.*;
public class Main{
    public static void main(String[] args){

        String RESET = "\u001B[0m";
        String RED_TEXT = "\u001B[31m";
        String GREEN_TEXT = "\u001B[32m";
        String YELLOW_TEXT = "\u001B[33m";
        String BLACK_BG = "\u001B[40m";
        String WHITE_BG = "\u001B[47m";

        System.out.println(BLACK_BG + "            .''");
        System.out.println(BLACK_BG + "  ._.-.___.' (`\\");
        System.out.println(BLACK_BG + " //(        ( `'");
        System.out.println(BLACK_BG + "'/ )\\ ).__. ) ");
        System.out.println(BLACK_BG + "' <' `\\ ._/'\\");
        System.out.println(BLACK_BG + "   `   \\     \\");
        System.out.print(RESET);
        System.out.println(RED_TEXT + "Welcome to the Horse Racing Simulator, America's Favorite Pass Time!" + RESET);

        ArrayList<String> names = new ArrayList<String>();


        names.add("Jodi");
        names.add("Summer");
        names.add("Raven");
        names.add("Skye");
        names.add("Pocaroo");
        names.add("Domino");
        names.add("Tempest");
        names.add("Bits");
        names.add("Phoenix");
        names.add("Shamara");
        names.add("Lightningbolt");
        names.add("Wingstar");
        names.add("Cameo");
        names.add("Thunder");
        names.add("Kez");
        names.add("Rapid");
        names.add("Arrow");
        names.add("Kingston");

        System.out.println(YELLOW_TEXT + "The selected horses for this race are..." + RESET);

        ArrayList<String> horses = new ArrayList<String>();
        Random rand = new Random();
        int randNames = 3;
        for (int i = 0; i < randNames; i++) {
            int randomItem = rand.nextInt(names.size());
            String randomElement = names.get(randomItem);
            horses.add(randomElement);
            System.out.print(randomElement + "! ");
        }

        Scanner s = new Scanner(System.in);
        Bettor b = new Bettor();

        String y = "";
        while(!y.equals("Yes") && !y.equals("No")){
            System.out.print("Would you like to bet on this race? Yes or No:");
            y = s.nextLine().toUpperCase();
            y = y.substring(0,1).toUpperCase() + y.substring(1).toLowerCase();
            if(y.equals("Yes")){
                b.displayBalance();
                b.deposit();
                b.gamble();
                String horse = "";
                while (!horse.equals(horses.get(0)) && !horse.equals(horses.get(1)) && !horse.equals(horses.get(2))) {
                    System.out.println("What horse would you like to bet on?");
                    System.out.print(horses + "\n");
                    horse = s.nextLine();
                    if (horse.equals(horses.get(0))) {
                        System.out.println("You bet $" + b.getBet() + " on " + horses.get(0));
                    } else if (horse.equals(horses.get(1))) {
                        System.out.println("You bet $" + b.getBet() + " on " + horses.get(1));
                    } else if (horse.equals(horses.get(2))) {
                        System.out.println("You bet $" + b.getBet() + " on " + horses.get(2));
                    } else {
                        System.out.println("Error, wrong input. Must be '" + horses.get(0) + "', '" + horses.get(1) + "', or '" + horses.get(2) + "'");
                    }
                }

                

            } else if (y.equals("No")) {
                System.out.println("You're no fun");
            }
            else System.out.println("Invalid input");
        }

    }
}
