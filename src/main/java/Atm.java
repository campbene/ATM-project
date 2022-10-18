import java.util.Scanner;

public class Atm {
    Scanner input = new Scanner(System.in);
//    java.math.BigDecimal(2) balance = 1000.00;
    double balance = 1000.00;
    String requiredPin;
    public static Atm createPin(String pin){
        Atm p = new Atm();
        p.requiredPin = pin;
        return p;
    }

    public boolean allowAccess(String enteredPin){
        return enteredPin.equals(requiredPin);
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        while (amount > balance){
            System.out.println("You do not have the funds to withdraw that amount.");
            System.out.println("Please enter an amount less than " + balance);
            amount = input.nextDouble();
        }
            balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

}
