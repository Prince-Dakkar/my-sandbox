package Basic_MVC;

import java.awt.EventQueue;

public class controller {
    private model model;
    private view view;

    public controller() {
        this.model = new model();
        this.view = new view();
    }

    public void start() {
        model.start();
        view.start();
    }

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
