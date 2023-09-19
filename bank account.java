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

public class Bankaccount{
    public static void main(String[]args)
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
            
            String option = "";
            while (!option.equals("Deposit") && !option.equals("Withdrawal")) {
                System.out.println("Would you like to make a deposit or withdrawal today? ");
                scanner = new Scanner(System.in);
                option = scanner.nextLine().toUpperCase();
                option = option.substring(0, 1).toUpperCase() + option.substring(1).toLowerCase();

                if(!option.equals("Deposit") && !option.equals("Withdrawal")){
                    System.out.println("Invalid input, please enter 'Deposit' or 'Withdrawal'");
                }
            }

            if(option.equals("Deposit")){
                System.out.println("How much would you like to deposit today?");
                double deposit = Double.parseDouble(scanner.nextLine());
                money += deposit;
                System.out.println("You now have $" + money);
                System.out.println();
            } 
            else if (option.equals("Withdrawal")){ 
                System.out.println("How much would you like to withdraw today?");
                double withdrawal = Double.parseDouble(scanner.nextLine());
                money -= withdrawal;
                System.out.println("You now have $" + money);
                System.out.println();
            }
            boolean deal;
                if(money > 1000){
                    deal = true;
                    if(deal){
                    System.out.println("Because you're such a valued customer here, we can offer you 2% interest rate compounded monthly!");
                    System.out.println("This means that next month you will have $" + money * 1.02);
                    System.out.println();
                
                    System.out.println("Have a great day valued customer!");
                    }
                }
        }
       
        else if(account.equals("No")){
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
                System.out.println();
                System.out.println("New accounts get a special deal of 3% interest rate compounded monthly!");
                System.out.println("If you stay with us, next month you will have $" + newAccount.getBalance() * 1.03);
                System.out.println();
                System.out.println("Have a great day, valued customer!");
            } else {
                System.out.println("Thank you for considering us. Have a great day!");
            }
        }

        scanner.close();
    }
}
