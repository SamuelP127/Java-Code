import java.util.Scanner;

public class BankAccount{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Do you bank with us? (Yes or No)");
        String account = scanner.nextLine();
        if(account.equals("Yes")){

        System.out.println("Thanks for banking with us! Please enter youur name: ");
        String name = scanner.nextLine();

        System.out.println("Hi! " + name);
        
        System.out.println("How much money do you currently have? ");
        String holder = scanner.nextLine();
        double money = Double.parseDouble(holder);
        
        System.out.println("Great! With $" + money + " you will be rich in no time!");
        
        } else if(account.equals("No")){
          System.out.println("You don't have an account with us");
        } else {
          System.out.println("Invalid input");
        }
    }
}
