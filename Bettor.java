import java.util.Scanner;
public class Bettor {
    Scanner s = new Scanner(System.in);
    private double balance;
    private double bet;
    public double gamble(){
        System.out.println("How much do you want to bet? You have:$" + balance);
        bet = s.nextInt();
        return balance = balance - bet;
    }
    public void displayBalance(){
        System.out.println("You have $" + balance);
    }
    public double deposit(){
        System.out.println("How much do you want to deposit?");
        balance = s.nextInt();
        return balance;
    }

}
