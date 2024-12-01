import java.util.Random;

class NumberGenerator extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        int num = random.nextInt(100); // Generate a single number between 0 and 99
        System.out.println("Generated Number: " + num);
        
        if (num % 2 == 0) {
            new SquareCalculator(num).start();
        } else {
            new CubeCalculator(num).start();
        }
    }
}

class SquareCalculator extends Thread {
    private final int number;

    SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class CubeCalculator extends Thread {
    private final int number;

    CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class MultiThreadApplication {
    public static void main(String[] args) {
        new NumberGenerator().start(); // Generate and process one number
    }
}