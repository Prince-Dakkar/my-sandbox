package Button_Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonGenerator extends JFrame implements ActionListener {
    private JTextField numberInput;
    private JButton generateButton;
    private JPanel buttonContainer;

    public ButtonGenerator() {
        setTitle("Button Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Input field and button
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter a number:"));
        numberInput = new JTextField(10);
        inputPanel.add(numberInput);
        generateButton = new JButton("Generate Buttons");
        inputPanel.add(generateButton);

        // Container for generated buttons
        buttonContainer = new JPanel();
        buttonContainer.setLayout(new FlowLayout());

        // Add components to the frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonContainer, BorderLayout.CENTER);

        generateButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int numberOfButtons = Integer.parseInt(numberInput.getText());

            buttonContainer.removeAll(); // Clear existing buttons

            for (int i = 1; i <= numberOfButtons; i++) {
                JButton newButton = new JButton(String.valueOf(i));
                newButton.setBackground(getRandomColor());
                buttonContainer.add(newButton);
            }

            buttonContainer.revalidate(); // Update the layout
            buttonContainer.repaint();  
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a number.");
        }
    }

    private Color getRandomColor() {
        return new Color((int) (Math.random() * 0x1000000)); 
    }

    public static void main(String[] args) {
        new ButtonGenerator();
    }
}