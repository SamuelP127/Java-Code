import java.util.Scanner;
public class Betting {
    Scanner s = new Scanner(System.in);
    private double money;
    private double bet;
    public double gamble(){
        System.out.println("How much do you want to bet? You have:$" + money);
        bet = s.nextInt();
        return money = money - bet;
    }
    public void displayMoney(){
        System.out.print("You have $" + money + " remaining");
    }
    public double deposit(){
        System.out.println("How much do you want to deposit?");
        money = s.nextInt();
        return money;
    }

}
