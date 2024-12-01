import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    int dimension1;
    int dimension2;

    // Abstract method to print area
    abstract void printArea();
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    Rectangle(int length, int width) {
        this.dimension1 = length;
        this.dimension2 = width;
    }

    // Override printArea method for Rectangle
    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class extends Shape
class Triangle extends Shape {
    Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    // Override printArea method for Triangle
    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class extends Shape
class Circle extends Shape {
    Circle(int radius) {
        this.dimension1 = radius;
        this.dimension2 = 0; // Circle only needs one dimension (radius)
    }

    // Override printArea method for Circle
    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class shapedit {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the shape and its dimensions
        System.out.println("Enter the shape type (rectangle, triangle, or circle): ");
        String shapeType = scanner.nextLine().toLowerCase();

        Shape shape = null;

        if (shapeType.equals("rectangle")) {
            System.out.print("Enter length of the rectangle: ");
            int length = scanner.nextInt();
            System.out.print("Enter width of the rectangle: ");
            int width = scanner.nextInt();
            shape = new Rectangle(length, width);
        } else if (shapeType.equals("triangle")) {
            System.out.print("Enter base of the triangle: ");
            int base = scanner.nextInt();
            System.out.print("Enter height of the triangle: ");
            int height = scanner.nextInt();
            shape = new Triangle(base, height);
        } else if (shapeType.equals("circle")) {
            System.out.print("Enter radius of the circle: ");
            int radius = scanner.nextInt();
            shape = new Circle(radius);
        } else {
            System.out.println("Invalid shape type entered.");
            return; // Exit if invalid input
        }

        // Call printArea() method to display the area
        shape.printArea();
    }
}

