import java.util.Scanner;

public class DoublyLinkedList {
    // Node class for doubly linked list
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head = null;

    // Method to add an element to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Method to delete a given element from the list
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element " + data + " not found in the list.");
            return;
        }

        if (temp == head) { // Deleting the head node
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp.next == null) { // Deleting the last node
            temp.prev.next = null;
        } else { // Deleting a middle node
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Element " + data + " deleted from the list.");
    }

    // Method to display the contents of the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add element");
            System.out.println("2. Delete element");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int dataToAdd = scanner.nextInt();
                    list.add(dataToAdd);
                    break;

                case 2:
                    System.out.print("Enter the element to delete: ");
                    int dataToDelete = scanner.nextInt();
                    list.delete(dataToDelete);
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
