package Basic_MVC.Model;

public class model {

    /**
     * The singular ICall2ViewAdapter that will be used by this Model to remotely call methods on the View.
     */
    ICall2ViewAdapter viewAdapter;

    /**
     * Constructor for model, takes the viewAdapter from the controller's instantiation.
     */
    public model(ICall2ViewAdapter viewAdpt) {
        this.viewAdapter = viewAdpt;
    }

    /**
     * Method to initially start any processes required. You won't always need it.
     */
    public void start(){

    }
}
