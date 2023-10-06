import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Himuro";
        String accountType = "checking";
        double balance = 2500.00;

        System.out.println("***********************");
        System.out.println("Customer name: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.printf("Current balance: %.2f%n", balance);
        System.out.println("***********************");

        System.out.println();
        String menu = """
                 ** Enter your option **
                 1 - Check Balance
                 2 - Transfer Value
                 3 - Receive Value
                 4 - Exit
                """;

        int option = 0;
        while (option != 4){
            System.out.println(menu);
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.printf("Current balance: %.2f%n", balance);
                    break;
                case 2:
                    System.out.println("Enter the value to transfer");
                    double transferValue = sc.nextDouble();
                    if (balance < transferValue){
                        System.out.println("Insufficient balance!");
                    }
                    else {
                        balance -= transferValue;
                        System.out.printf("Current balance: %.2f%n", balance);
                    }
                    break;
                case 3:
                    System.out.println("Enter the value to receive");
                    double receiveValue = sc.nextDouble();
                    if (receiveValue <= 0){
                        System.out.println("The value needs to be greater than 0!");
                    }
                    else{
                        balance += receiveValue;
                        System.out.printf("Current balance: %.2f%n", balance);
                    }
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
