import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 100.00; // starting balance
        double interestRate = 0.03; // 3% interest
        int year = 1;
        int choice;

        do {
            // Calculate balance after a year
            balance = balance + (balance * interestRate);

            // Display balance for the year
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                    year, interestRate, balance);

            // Ask user if they want to continue
            System.out.print("\nDo you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

            year++;

            System.out.println();
        } while (choice == 1);

        System.out.println("----jGRASP: Operation complete.");
        input.close();
    }
}
