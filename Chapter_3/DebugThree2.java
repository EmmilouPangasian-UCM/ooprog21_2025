import java.util.Scanner;

class DebugThree2 {
    public static void main(String args[]) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter an integer >> ");
        a = input.nextInt();
        System.out.print("Enter a second integer >> ");
        b = input.nextInt();  
        System.out.print("Enter a third integer >> ");
        c = input.nextInt();  

        
        add(a, b);
        add(b, c);
        add(a, c);

        subtract(a, b);
        subtract(b, c);
        subtract(a, c);
    }

        static void add(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }

    
    static void subtract(int a, int b) {
        System.out.println("The difference between " + a + " and " + b + " is " + (a - b));
    }
}
