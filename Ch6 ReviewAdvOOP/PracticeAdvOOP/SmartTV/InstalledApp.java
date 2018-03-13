package smarttvscreen;

public class InstalledApp extends Application{
    
    private String company;

    public InstalledApp(String name, String company) {
        super(name);
        this.company = company;
    }

    public InstalledApp(String name, String description, String company) {
        super(name,description);
        this.company = company;
    }

    @Override
    public String toString() {
        return this.getName() + "\n- Installed App " + " company:  " + company + "\n" + this.getDescription();
    }

}
