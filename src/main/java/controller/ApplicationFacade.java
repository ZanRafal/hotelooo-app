package controller;

import controller.frontend.ScreensController;
import service.ApplicationModelInitializerService;

public class ApplicationFacade {
    private static final ScreensController screensController = new ScreensController();
    public static final ApplicationModelInitializerService application = ApplicationModelInitializerService.getInstance();

    public static void runApplication(String[] args) {
        application.initialize();
        screensController.run(args);
    }
}
