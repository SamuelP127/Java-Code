import java.util.*;
public class Horse{
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
        names.add("Summer Breeze");
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
        names.add("Thunder Sparks");
        names.add("Kez");
        names.add("Rapid Step");
        names.add("Arrow");
        names.add("Kingston");

        Random rand = new Random();
        int randNames = 3;
        for (int i = 0; i < randNames; i++) {
            int randomitem = rand.nextInt(names.size());
            String randomElement = names.get(randomitem);
            System.out.print(randomElement);
        }



    }
}