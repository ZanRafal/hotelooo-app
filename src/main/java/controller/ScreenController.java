package controller;

//interfejs odpowiadający za ustawianie parenta dla danego ekranu
//controlled screen
public interface ScreenController {

    void setScreenParent(ChangeStepController screenParent);
}
