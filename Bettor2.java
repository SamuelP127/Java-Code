import java.util.Scanner;
public class Bettor {
    Scanner s = new Scanner(System.in);
    private double balance;
    private double bet;

    public double giveMoney(){
        System.out.println("As a gift from the committee, here is $1000! If you gamble it all away you lose!");
        return balance = 1000;
    }
    public double getBet(){
        return bet;
    }
    public double getBalance(){
        return balance;
    }
    public double gamble(){
        System.out.println("How much do you want to bet? (HINT: The higher the bet, the greater return!)");
        bet = s.nextInt();
        return bet;
    }

    public double win(){
        return balance = balance + multiplier(getBet());
    }
    public double loss(){
        return balance = balance - getBet();
    }
    public double multiplier(double bet){
        if(bet >= 1000) return (bet * 1.5) - bet;
        if(bet >= 500) return (bet * 1.35) - bet;
        if(bet >= 100) return (bet * 1.25) - bet;
        else return (bet * 1.1) - bet;
    }
}
