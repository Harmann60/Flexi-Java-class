import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        System.out.println("Welcome to Simple Banking App");
        System.out.println("Your balance is: " + balance);
        try {
            System.out.print("Enter withdrawal divisor: ");
            int divisor = sc.nextInt();
            int result = balance / divisor;
            System.out.println("Result after division: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("❌ Cannot divide by zero. Please enter a non-zero value.");
        }
        catch (Exception e) {
            System.out.println("❌ Invalid input.");
        }
        System.out.println("Thank you for using banking app.");
        sc.close();
    }
}
