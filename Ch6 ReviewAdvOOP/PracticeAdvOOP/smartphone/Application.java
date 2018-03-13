package smartphone;

import java.util.Objects;

public class Application extends Item {

    private String icon;

    public Application(String name, String icon) {

    }

    @Override
    public String toString() {
        return "Application: "+this.getName();
    }

}
