package smartphone;

import java.util.Objects;

public class Application extends Item{

    private String icon;

    public Application(String name, String icon) {
        super(name);
        this.icon=icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    
    
    @Override
    public String toString() {
        return "Application: "+this.getName();
    }

}
