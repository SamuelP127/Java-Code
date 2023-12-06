import java.util.Scanner;
public class Bettor {
    Scanner s = new Scanner(System.in);
    private double balance;
    private double bet;
    public double gamble() {
        System.out.println("How much do you want to bet? You have:$" + balance);
        bet = s.nextInt();
        if (bet > balance) {
            System.out.println("Error: Not enough money in account.");
            String t = "";
            while (!t.equals("Money") && !t.equals("Smaller")) {
                System.out.println("Do you want to deposit more money or bet smaller? 'Money' or 'Smaller':");
                t = s.nextLine();
                if (t.equals("Money")) {
                    System.out.println("How much do you want to deposit?");
                    balance = s.nextInt();
                    return balance;
                }
                if (t.equals("Smaller")) {
                    System.out.println("How much do you want to bet? You have:$" + balance);
                    bet = s.nextInt();
                }
            }
        }
        return balance = balance - bet;
    }
    public double getBet(){
        return bet;
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
