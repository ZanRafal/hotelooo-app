package controller;

import controller.ChangeStepController;

//interfejs odpowiadający za ustawianie parenta dla danego ekranu
//controlled screen
public interface ScreenController {

    void setScreenParent(ChangeStepController screenParent);
}
