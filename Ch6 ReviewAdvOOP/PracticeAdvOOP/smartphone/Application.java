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
    
    public boolean equals(Object obj){
        Application temp=null;
        if(obj !=null && obj instanceof Application){
            temp = (Application) obj;
            if(super.getName().equals(temp.getName())){
                if(icon.equals(temp.getIcon())){
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Application: "+this.getName();
    }

}
