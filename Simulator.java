import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Simulator {
    private final String RESET = "\u001B[0m";
    private final String RED_TEXT = "\u001B[31m";
    private final String GREEN_TEXT = "\u001B[32m";
    private final String YELLOW_TEXT = "\u001B[33m";
    private final String BLACK_BG = "\u001B[40m";
    private final String WHITE_BG = "\u001B[47m";
    private ArrayList<String> possibleHorses;
    private Bettor bettor;
    public Simulator()
    {
        printHorse();
        possibleHorses = new ArrayList<String>();
        populate();
        bettor = new Bettor();
        bettor.giveMoney();
        ask();

    }
    public void printHorse()
    {
        System.out.println(BLACK_BG + "            .''");
        System.out.println(BLACK_BG + "  ._.-.___.' (`\\");
        System.out.println(BLACK_BG + " //(        ( `'");
        System.out.println(BLACK_BG + "'/ )\\ ).__. ) ");
        System.out.println(BLACK_BG + "' <' `\\ ._/'\\");
        System.out.println(BLACK_BG + "   `   \\     \\");
        System.out.print(RESET);
        System.out.println(RED_TEXT + "Welcome to the Horse Racing Simulator, America's Favorite Pass Time!" + RESET);
    }
    public void populate()
    {
        possibleHorses.add("Jodi");
        possibleHorses.add("Summer");
        possibleHorses.add("Raven");
        possibleHorses.add("Skye");
        possibleHorses.add("Pocaroo");
        possibleHorses.add("Domino");
        possibleHorses.add("Tempest");
        possibleHorses.add("Bits");
        possibleHorses.add("Phoenix");
        possibleHorses.add("Shamara");
        possibleHorses.add("Lightningbolt");
        possibleHorses.add("Wingstar");
        possibleHorses.add("Cameo");
        possibleHorses.add("Thunder");
        possibleHorses.add("Kez");
        possibleHorses.add("Rapid");
        possibleHorses.add("Arrow");
        possibleHorses.add("Kingston");
        System.out.println(possibleHorses);
    }
    public void ask()
    {
        Scanner s = new Scanner(System.in);
        String again = "";
        System.out.println("Would you like to play:");
        again = s.nextLine();
        again = again.substring(0,1).toUpperCase() + again.substring(1);
        if(again.equals("Yes")) race();
    }
    public void race()
    {
        System.out.print(YELLOW_TEXT + "The selected horses for this race are..." + RESET);
        ArrayList<String> horses = new ArrayList<String>();
        Random rand = new Random();
        int randNames = 3;
        for (int i = 0; i < randNames; i++) {
            int randomItem = rand.nextInt(possibleHorses.size());
            String randomElement = possibleHorses.get(randomItem);
            horses.add(randomElement);
            possibleHorses.remove(randomElement);
            System.out.print(randomElement + "! ");
        }
    }
}
