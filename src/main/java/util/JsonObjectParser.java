package util;

import java.io.File;
import java.util.Objects;

public abstract class JsonObjectParser {
        protected static final File FILE = new File(Objects.requireNonNull(JsonObjectParser.class.getClassLoader().getResource("hotele.json")).getPath());
}
