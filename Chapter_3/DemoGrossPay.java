public class DemoGrossPay {
    // Method to calculate and display the gross pay
    public static void calculateGross(double hoursWorked) {
        final double HOURLY_RATE = 22.75;  // Fixed hourly rate
        double grossPay = hoursWorked * HOURLY_RATE;  // Calculate gross pay
        System.out.println(hoursWorked + " hours at $" + HOURLY_RATE + " per hour is $" + grossPay);
    }

    public static void main(String[] args) {
        // Test the calculateGross method with different hours worked
        calculateGross(10.0);  // 10 hours
        calculateGross(25.0);  // 25 hours
        calculateGross(37.5);  // 37.5 hours
    }
}