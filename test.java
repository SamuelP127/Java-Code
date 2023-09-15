import java.util.Scanner;

class Account {
    private String name;
    private double balance;

    public Account(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

public class bankAccount{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String account = "";
        while (!account.equals("Yes") && !account.equals("No")) {
            System.out.println("Do you bank with us? (Yes or No)");
            account = scanner.nextLine().toUpperCase();
            account = account.substring(0, 1).toUpperCase() + account.substring(1).toLowerCase();

            if (!account.equals("Yes") && !account.equals("No")) {
                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
            }
        }

        if(account.equals("Yes")){

            double min = 0;
            double max = 10000;
            double money = (double)Math.floor(Math.random() * (max - min + 1) + min);

            System.out.println("Thanks for banking with us! Please enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Hi! " + name + " you currently have $" + money);
            
            
            System.out.println("How much would you like to deposit today? ");
            double deposit = Double.parseDouble(scanner.nextLine());
            money += deposit;
            System.out.println("You now have $" + money);

        } else if(account.equals("No")){
            System.out.println("You don't have an account with us");
            System.out.println("Would you like to make an account (Yes or No)");
            String wantsIt = scanner.nextLine().toUpperCase();
            wantsIt = wantsIt.substring(0, 1).toUpperCase() + wantsIt.substring(1).toLowerCase();
            
            if(wantsIt.equals("Yes")){
                System.out.println("Please enter your name: ");
                String name = scanner.nextLine();

                System.out.println("Please enter your initial deposit amount: ");
                String initialDeposit = scanner.nextLine();
                double depositAmount = Double.parseDouble(initialDeposit);

                Account newAccount = new Account(name, depositAmount);

                System.out.println("Account created successfully!");
                System.out.println("Welcome, " + newAccount.getName() + "!");
                System.out.println("Your current balance is $" + newAccount.getBalance());
            } else {
                System.out.println("Thank you for considering us. Have a great day!");
            }
        }

        scanner.close();
    }
}
