import java.util.Scanner;

public class labinternal_Q2 {

    interface Shape {
        void printArea();
    }

    static class Rectangle implements Shape {
        int length, width;

        Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public void printArea() {
            System.out.println("Rectangle Area: " + (length * width));
        }
    }

    static class Triangle implements Shape {
        int base, height;

        Triangle(int base, int height) {
            this.base = base;
            this.height = height;
        }

        public void printArea() {
            System.out.println("Triangle Area: " + (0.5 * base * height));
        }
    }

    static class Circle implements Shape {
        int radius;
        final double PI = 3.14159;

        Circle(int radius) {
            this.radius = radius;
        }

        public void printArea() {
            System.out.println("Circle Area: " + (PI * radius * radius));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length and width for Rectangle: ");
        int rectLength = scanner.nextInt();
        int rectWidth = scanner.nextInt();
        Shape rectangle = new Rectangle(rectLength, rectWidth);

        System.out.print("Enter base and height for Triangle: ");
        int triBase = scanner.nextInt();
        int triHeight = scanner.nextInt();
        Shape triangle = new Triangle(triBase, triHeight);

        System.out.print("Enter radius for Circle: ");
        int radius = scanner.nextInt();
        Shape circle = new Circle(radius);

        System.out.println();
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();

        scanner.close();
    }
}
