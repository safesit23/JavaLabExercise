package int105.model;

public class Browser {

    private Tab[] tabs;
    private int numOfTab;
    private int activeTabPosition;

    public Browser(int maximumTab) {
        this.tabs = new Tab[maximumTab + 1];
        this.tabs[0] = new Tab("Default");  //Tabs 0 เป็น Default
        this.activeTabPosition = 0;
        this.numOfTab = 1;
    }

    public int newTab(Tab tab) {
        if(numOfTab<tabs.length){
            this.tabs[numOfTab]=tab;
            setActiveTabIndex(numOfTab);
            numOfTab++; //จำนวน Tabs ที่เปิดอยู่จริง
            return numOfTab;
        }else{
            return -1;
        }
    }

    public boolean setActiveTabIndex(int index) {
        boolean result = false;
        if (index < tabs.length && tabs[index] != null) {
            this.activeTabPosition = index;
            result = true;
        }
        return result;
    }

    public int getMaximumNoOfTab() {
        return this.tabs.length;
    }

    public int getNumOfTab() {
        return this.numOfTab;
    }

    public Tab getActiveTab() {             //ได้ Return เป็น Tab
        return this.tabs[activeTabPosition];
    }

    @Override
    public String toString() {
        String output = "Browser consists of " + this.numOfTab + " tabs:\n";
        for (Tab tempTab : this.tabs) {
            if (tempTab != null) {
                output += tempTab + "\n";
            }
        }
        output += "Active tab = "
                + this.tabs[activeTabPosition].toString();
        return output;
    }

}
