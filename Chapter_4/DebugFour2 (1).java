// This class uses a MyPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values
import java.util.Scanner;

public class DebugFour2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String color;
        String point;

        MyPen pen1;
        MyPen pen2;

        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();
        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();

        pen1 = new MyPen();  // default pen
        pen2 = new MyPen(color, point); // user-supplied pen

        System.out.println("Default value pen:");
        display(pen1);

        System.out.println("User value pen:");
        display(pen2);
    }

    public static void display(MyPen p) {
        System.out.println(" The pen has ink color " + p.getColor());
        System.out.println(" and a " + p.getPoint() + " point.");
    }
}
