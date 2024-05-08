package Basic_MVC.Controller;

import java.awt.EventQueue;
import Basic_MVC.Model.ICall2ViewAdapter;
import Basic_MVC.Model.model;
import Basic_MVC.View.ICall2ModelAdapter;
import Basic_MVC.View.view;

public class controller {

    /**
     * The Model for this system.
     */
    private model model;

    /**
     * The View for this system.
     */
    private view view;


    /**
     * Constructor of the controller, and where you will complete all the linking
     * of the system.
     */
    public controller() {
        this.model = new model(new ICall2ViewAdapter(){
            /* Fill out ICall2ViewAdapter methods here once you need them. */
        });

        this.view = new view(new ICall2ModelAdapter(){
            /* Fill out ICall2ModelAdapter methods here once you need them. */
        });
    }

    /**
     * Start the model and the view by way of starting the controller.
     */
    public void start() {
        model.start();
        view.start();
    }

    /**
     * The main method of the system. Make the controller and get it all up and running.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controller controller = new controller();
					controller.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
