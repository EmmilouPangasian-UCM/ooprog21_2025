class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    int getRadius() {
        return radius;
    }

    int getDiameter() {
        return diameter;
    }

    double getArea() {
        return area;
    }
}

class TestDebugCircle {
    public static void main(String[] args) {
        DebugCircle circle = new DebugCircle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
    }
}