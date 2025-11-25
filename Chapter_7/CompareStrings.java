import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String name = kb.nextLine();

        if (name.equals("Carmen")) {
            System.out.println("Names are equal.");
        } else {
            System.out.println("Names are not equal.");
        }
    }
}