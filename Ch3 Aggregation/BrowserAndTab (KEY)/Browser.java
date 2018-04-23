package int105.model;

public class Browser {

    private Tab[] tabs;
    private int numOfTab;
    private int activeTabPosition;

    public Browser(int maximumTab) {
        this.tabs = new Tab[maximumTab + 1];
        this.tabs[0] = new Tab("Default");  //Tabs 0 เป็น Default
        this.activeTabPosition = 0; // ที่เปิดอยู่คือ Tabs 0
        this.numOfTab = 1; // มี Tab เปิดอยู่ 1 Tab
    }

    public int newTab(Tab tab) {
        if(numOfTab<getMaximumNoOfTab()){
            this.tabs[numOfTab]=tab;    //set tab ใน array tab
            setActiveTabIndex(numOfTab); // ให้ active tab เป็น tab ปัจจุบันที่พึ่งเปิด
            numOfTab++; //นับจำนวน tab เช่นเดิมมี 2 Tab พอเปิดเพิ่มจะมี 3 tab
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
    
    public Tab getFirstTab(){
        return this.tabs[0];
    }
    
    public Tab getLastTab(){
        return this.tabs[numOfTab-1];
    }
    
    

}
