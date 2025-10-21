package oprog;
import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
        final double INTEREST_RATE = 0.03;
        double balance;
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        choice = input.nextInt();

        while (choice == 1) {
            year++;
            balance = balance + balance * INTEREST_RATE;
            System.out.println("After year " + year + " at " + INTEREST_RATE + " interest rate, balance is $" + balance);

            System.out.print("\nDo you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
        }

        System.out.println("\nProgram complete.");
        input.close();
    }
}