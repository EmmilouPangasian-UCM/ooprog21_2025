public class MyPen {
    private String color;
    private String point;

    // Default constructor
    public MyPen() {
        this.color = "black";
        this.point = "medium";
    }

    // Constructor with arguments
    public MyPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }
}
