package controller;

public class ApplicationFacade {
    private static final ScreensController screensController = new ScreensController();

    public static void runApplication(String[] args) {
        screensController.run(args);
    }
}
