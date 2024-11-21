import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    // Constructor to initialize location and size
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height); // Call to Rectangle constructor
    }

    // Method to calculate area
    public int getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public int getPerimeter() {
        return 2 * (width + height);
    }
}

