import java.util.Scanner;

public class ATMClientApp {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userEnteredPin;
        int userSelection;
        boolean accessAllowed;
        System.out.println("Please create your pin: ");
        Atm newUser = Atm.createPin(input.nextLine());

        System.out.println("Please enter your PIN: ");
        userEnteredPin = input.nextLine();
        
        accessAllowed = newUser.allowAccess(userEnteredPin);
        while (accessAllowed){
            System.out.println("Please select from the following options:");
            System.out.println("Enter 1 to make a deposit.");
            System.out.println("Enter 2 to withdraw funds.");
            System.out.println("Enter 3 to get the account balance.");
            System.out.println("Enter 4 to quit.");
            userSelection = input.nextInt();

            switch (userSelection){
                case 1:
                    System.out.println("Please enter the amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    newUser.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Please enter the amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    newUser.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println(newUser.getBalance());
                    break;
                case 4:
                    System.out.println("Goodbye.");
                    accessAllowed = false;
                    break;
                default:
                    System.out.println("that is not a valid entry please try again.");
                    break;
            }
        }
    }
}
