import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionCalculator extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public DivisionCalculator() {
        // Frame settings
        setTitle("Integer Division Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        // Labels and Text Fields
        add(new JLabel("Num1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Num2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Divide Button
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(new JLabel()); // Empty label for layout spacing
        add(divideButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse input fields as integers
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            // Perform division and display result
            int result = num1 / num2;
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            // Handle non-integer input
            JOptionPane.showMessageDialog(this, "Please enter valid integers for both numbers.", "Number Format Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            // Handle division by zero
            JOptionPane.showMessageDialog(this, "Cannot divide by zero.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DivisionCalculator calculator = new DivisionCalculator();
            calculator.setVisible(true);
        });
    }
}
