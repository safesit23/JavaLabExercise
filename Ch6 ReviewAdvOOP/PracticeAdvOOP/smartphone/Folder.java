package smartphone;

public class Folder extends Item {

    private static int maxApp = 4;
    private Application[] apps;
    private int appCount;

    public Folder(String name) {
    }



    @Override
    public String toString() {
        String str = this.getName() + " - ";
        for (int i = 0; i < appCount; i++) {
            str += apps[i].getName() + ", ";
        }
        return str;
    }
}
