package Basic_MVC.View; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class view extends JFrame {

    /**
     * The singular ICall2ModelAdapter that will be used by this View to remotely call methods on the Model.
     */
    ICall2ModelAdapter modelAdapter;
    
    /**
     * Basic content pane. Start placing items inside of this.
     */
    private JPanel content_pane;

    /**
     * Contructor, automatically initiallizes the GUI and the adapter to the model.
     * Add anything else here necessary for your system.
     */
    public view(ICall2ModelAdapter modelAdpt) {
        this.initGUI();
        this.modelAdapter = modelAdpt;
    }

    /**
     * Initialize your GUI. Beef this up to look how you want for the project.
     */
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

    /**
     * Here you can start anything that will be needed to have a singular intial spot. Ex. timers, etc.
     */
    public void start(){
    }
}
