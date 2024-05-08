import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button_Generator extends JFrame implements ActionListener {
    private JTextField numberInput;
    private JButton generateButton;
    private JPanel buttonContainer;

    public Button_Generator() {
        super("Button Generator");

        // Input field
        numberInput = new JTextField(10);
        numberInput.setToolTipText("Enter a number");

        // Generate button
        generateButton = new JButton("Generate Buttons");
        generateButton.addActionListener(this);

        // Container for generated buttons
        buttonContainer = new JPanel();
        buttonContainer.setLayout(new FlowLayout());

        // Layout
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Number of Buttons:"));
        inputPanel.add(numberInput);
        inputPanel.add(generateButton);

        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(buttonContainer, BorderLayout.CENTER);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

            buttonContainer.revalidate(); // Update the container
            buttonContainer.repaint();  // Redraw
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a number.");
        }
    }

    private Color getRandomColor() {
        return new Color((int) (Math.random() * 0x1000000));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ButtonGenerator());
    }
}