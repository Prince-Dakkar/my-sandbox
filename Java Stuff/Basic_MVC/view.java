package Basic_MVC;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class view extends JFrame {
    
    private JPanel content_pane;

    public view() {
        this.initGUI();
    }

    public void initGUI(){
        setTitle("Basic MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        content_pane = new JPanel();
        content_pane.setToolTipText("This pane contains all the content of the display.");
		content_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		content_pane.setLayout(new BorderLayout(0, 0));
		setContentPane(content_pane);
        setVisible(true);
    }

    public void start(){
        
    }
}
