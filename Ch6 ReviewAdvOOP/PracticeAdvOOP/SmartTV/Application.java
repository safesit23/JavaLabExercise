package smarttvscreen;
public abstract class Application{
    private String name;
    private String image;
    private String description;

    public Application() {
    }

    public Application(String name) {
        this.name = name;
    }

    public Application(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public Application(String name, String image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "application{" + "name=" + name + ", image=" + image + ", description=" + description + '}';
    }
    
}
