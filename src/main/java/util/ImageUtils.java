package util;

import lombok.experimental.UtilityClass;
import java.util.HashMap;

@UtilityClass
public class ImageUtils {

    public static HashMap<String, String> values = new HashMap<>() {{
        put("Zielona dolina", "/images/Hooootuwa.jpg");
        put("Kubano", "/images/Kubano.jpg");
        put("Letnisko", "/images/Letnisko.jpg");
        put("Palmale", "/images/Palmale.jpg");
        put("Tropicana", "/images/Tropicana.jpg");
    }};

}
