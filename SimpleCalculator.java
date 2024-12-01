import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operator = "";
    private double firstNumber = 0;
    
    public SimpleCalculator() {
        // Frame settings
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 18));
        add(display, BorderLayout.NORTH);
        
        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 2, 3));  // Adjust grid for additional row
        
        // Button texts
        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "%", "=", "/",
            "C" // Clear button
        };
        
        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        
        add(buttonPanel, BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        try {
            if ("0123456789".contains(command)) {
                // Append digit to display
                display.setText(display.getText() + command);
            } else if ("+-*/%".contains(command)) {
                // Save first number and operator
                firstNumber = Double.parseDouble(display.getText());
                operator = command;
                display.setText("");
            } else if ("=".equals(command)){
                // Perform calculation
                double secondNumber = Double.parseDouble(display.getText());
                double result = calculateResult(firstNumber, secondNumber, operator);
                display.setText(String.valueOf(result));
            } else if ("C".equals(command)) {
                // Clear the display and reset variables
                display.setText("");
                firstNumber = 0;
                operator = "";
            }
        } catch (ArithmeticException ex) {
            display.setText("Error: " + ex.getMessage());
        } catch (Exception ex) {
            display.setText("Error");   
        }
    }
    
    private double calculateResult(double num1, double num2, String op) throws ArithmeticException {
        switch (op) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": 
                if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                return num1 / num2;
            case "%": 
                if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                return num1 % num2;
            default: return 0;
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setVisible(true);
        });
    }
}
