package smarttvscreen;

public class SystemApp extends Application{

    private String type;

    public SystemApp(String name, String type) {
        super(name);
        this.type = type;
    }

    public SystemApp(String name, String description, String type) {
        super(name,description);
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getName() + "\n - SystemApp " + "type: " + type + "\n" + this.getDescription();
    }
}
