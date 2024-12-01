import javax.swing.*;

public class SimpleMessageSwingApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Message App");

        JLabel messageLabel = new JLabel("Hello, welcome to the Java Swing Application!");

        frame.add(messageLabel); 

        frame.setSize(400, 200); 

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        frame.setVisible(true);

    }

}
