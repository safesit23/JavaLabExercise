package smartphone;

public class Folder extends Item {

    private static int maxApp = 4;
    private Application[] apps;
    private int appCount;

    public Folder(String name) {
        super(name);
        this.apps= new Application[maxApp];
        appCount=0;
    }

    public boolean addItem(Application app){
        if(appCount<maxApp){
            for(int i=0;i<appCount;i++){
                if(this.apps[i].equals(app)){
                    return false;
                }
            }
            this.apps[appCount]=app;
            this.appCount++;
            return true;
        }else{
            return false;
        }
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
