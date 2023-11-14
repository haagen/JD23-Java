import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    // Declare globally since we will have to update it as buttons are pressed
    private JTextField output;

    // These are the buttons we want to create in the calculator
    private String[] buttons = { "7", "8", "9", "/", "4", "5", "6", "*",
                                 "1", "2", "3", "-", "0", "C", "=", "+",
                                 "." };

    Calculator() {
        // Setup the frame
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLayout(new BorderLayout());  // BorderLayout - North for total, Center for all the buttons

        // Add the totals field to the frame
        output = new JTextField();
        output.setPreferredSize(new Dimension(400, 80));    // Set the prefered size so that we can have a field that is taller
        Font font = new Font(Font.SERIF, Font.PLAIN,  40);          // Make the font size bigger
        output.setFont(font);
        output.setEditable(false);
        add(output, BorderLayout.NORTH);    // Add the TextField to the form

        JPanel buttonPanel = new JPanel();  // We will place the buttons on a gridlayout in center
        buttonPanel.setLayout(new GridLayout(5, 4));
        add(buttonPanel, BorderLayout.CENTER);

        // Create all the buttons
        for(String title: buttons) {
            JButton button = new JButton(title);
            buttonPanel.add(button);
            button.addActionListener(this); // Add the event listener to the button
        }

        setVisible(true);   // Show the form

        operand1 = operand2 = operator = ""; // Initiate the working variables
    }

    // operand1 operator operand 2 (5 + 5)
    private String operand1, operand2, operator;

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();  // Grap the actionCommand - by default the text on the button
        System.out.println(btn);

        // If button 0,1,2,3,4,5,6,7,8,9 or . was pressed
        if(btn.charAt(0) >= '0' && btn.charAt(0) <= '9' || btn.charAt(0) == '.') {
            // If we have an operator we should update operand2
            if(operator.isEmpty()) {
                operand1 += btn;
            } else {
                operand2 += btn;
            }
            // Update the text on the TextField
            output.setText(operand1 + operator + operand2);

        // If button C was pressed
        } else if(btn.charAt(0) == 'C') {
            operand1 = operand2 = operator = "";        // Clear working variables
            output.setText(operand1 + operator + operand2); // Update the text
        // If button = was pressed
        } else if(btn.charAt(0) == '=') {
            double total = calculate(); // Calculate the result
            output.setText(operand1 + operator + operand2 + "=" + total);
            operand1 = Double.toString(total); // Set operand1 to the total
            operator = operand2 = ""; // Clean-up
        // Otherwise if +, -, /, * was pressed
        } else {
            // If we do not have an operator or if operand2 is empty we should only update the operator
            if (operator.isEmpty() || operand2.isEmpty()) {
                operator = btn;
            // Otherwise we need to calculate and update the value
            } else {
                double total = calculate();// Calculate the sum
                operand1 = Double.toString(total); // Update the total
                operator = btn;
                operand2 = "";
            }
            output.setText(operand1 + operator + operand2);
        }
    }

    // This method calculate the new result
    private double calculate() {
        double total = 0;

        if (operator.equals("+")) {
            total = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
        }
        if (operator.equals("-")) {
            total = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
        }
        if (operator.equals("/")) {
            total = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
        }
        if (operator.equals("*")) {
            total = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
        }
        return total;
    }
}
