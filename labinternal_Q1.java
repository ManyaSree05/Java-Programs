/*1. Write a java program to read product details from customer like (product name, quantity,
and cost of the product), now display the product which is having highest value.*/
import java.util.Scanner;

public class labinternal_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline after reading n

        String highestProductName = "";
        int highestQuantity = 0;
        double highestCost = 0, highestValue = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));
            System.out.print("Product Name: ");
            String name = sc.nextLine();

            // Input validation for quantity
            int quantity = 0;
            while (true) {
                System.out.print("Quantity (in numbers): ");
                if (sc.hasNextInt()) {
                    quantity = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println("Please enter a valid number for quantity.");
                    sc.next(); // Discard invalid input
                }
            }

            // Input validation for cost
            double cost = 0;
            while (true) {
                System.out.print("Cost per product (in numbers): ");
                if (sc.hasNextDouble()) {
                    cost = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println("Please enter a valid number for cost.");
                    sc.next(); // Discard invalid input
                }
            }

            double totalValue = quantity * cost;

            if (totalValue > highestValue) {
                highestValue = totalValue;
                highestProductName = name;
                highestQuantity = quantity;
                highestCost = cost;
            }
        }

        sc.close();

        System.out.println("\nProduct with the highest value:");
        System.out.println("Product Name: " + highestProductName);
        System.out.println("Quantity: " + highestQuantity);
        System.out.println("Cost per product: " + highestCost);
        System.out.println("Total Value: " + highestValue);
    }
}
    

    

