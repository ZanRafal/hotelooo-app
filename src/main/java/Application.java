import controller.ApplicationFacade;
import util.DatabaseBuilder;

public class Application  {

    public static void main(String[] args) {
        ApplicationFacade.runApplication(args);
//        DatabaseBuilder.initializeDatabase();
    }
}
