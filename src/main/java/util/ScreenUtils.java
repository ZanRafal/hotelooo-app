package util;

import jdk.jfr.Description;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class ScreenUtils {

    //Screen URL's
    public static final String SEARCH_SCREEN = "/screens/hotel_search_screen.fxml";
    public static final String HOTEL_LIST_SCREEN = "/screens/hotels_list_screen.fxml";
    public static final String HOTEL_DETAILS_SCREEN = "screens/hotel_details_screen.fxml";
    @Description("Don't use for now")
    public static final String PARENT_SCREEN = "screens/MainAppContainter.fxml";

    //Screen ID's
    public static final String SEARCH_SCREEN_ID = "search_screen";
    public static final String HOTEL_LIST_SCREEN_ID = "hotels_list";
    public static final String HOTEL_DETAILS_SCREEN_ID = "hotel_details";
    public static final String PARENT_SCREEN_ID = "parent_screen";
}
