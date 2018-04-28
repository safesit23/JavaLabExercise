package smarttvscreen;

public class HorizontalGrid {

    private String name;
 //hint1
    private int focusIdx, insertedApps , numOfApps;

    public HorizontalGrid(String name, int i) {

    }

    public boolean addApp(Application app){    // hint 3

    }

    public Application[] getApps() {
        return apps;
    }

    public void setApps(Application[] apps) {
        this.apps = apps;
    }

    
    public void setFocusIdx(Cursor cursor) {
        
        if(cursor.getColumn()>=insertedApps){
            focusIdx=insertedApps-1;
            cursor.setColumn(focusIdx);
        }else{
            focusIdx=cursor.getColumn();
        }
    }
    public void clearFocusIdx() {
        focusIdx=-1;
    }


    public int getNumOfApps() {
        return numOfApps;
    }

    public void setNumOfApps(int numOfApps) {
        this.numOfApps = numOfApps;
    }

    @Override
    public String toString() {
        String str = "[ " + name + " ]\n";
        for (int i = 0; i < insertedApps; i++) {
            if (i == focusIdx) {
                str += "  ((" + apps[i].getName() + "))";
            } else {
                str += "  " + apps[i].getName();
            }
        }
        return str;
    }

}
