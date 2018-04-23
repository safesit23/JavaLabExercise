package browsertabproject;

import int105.model.Browser;
import int105.model.Tab;
public class TinyBrowser {
    
    public static void main(String[] args) {
        Browser browser = new Browser(5);
        Tab t1 = new Tab("www.sit.kmutt.ac.th");
        browser.newTab(t1);
        
        Tab t2 = new Tab("www.facebook.com");
        browser.newTab(t2);
        System.out.println("Output #01\n" + browser);
        browser.setActiveTabIndex(0);           //เปลี่ยน default 0 ให้เป็น ActiveTab
        Tab currentTab = browser.getActiveTab();    //ดึง Tab นั้นออกมาจาก Array
        currentTab.setUrl("www.kmutt.ac.th");   //แก้ไข url
        //อีกวิธี
        browser.setActiveTabIndex(0);           //เปลี่ยน default 0 ให้เป็น ActiveTab
        browser.getActiveTab().setUrl("www.kmutt.ac.th");   //เข้าไปแก้ Url ของ ActiveTab
        
        System.out.println("----------------");
        System.out.println("Output #02\n" + browser);
        
        //ต้องการ Page Content ที่ active
        System.out.println("----------------");
        Tab content = browser.getActiveTab();
        System.out.println("ActiveTab\n"+content.getPageContent());
        
        //ต้องการ url ของ Tab แรก
        System.out.println("----------------");
        System.out.println("First Tab\n"+browser.getFirstTab().getUrl());
        
        //ต้องการ url ของ Tab สุดท้าย
        System.out.println("----------------");
        System.out.println("Last Tab\n"+browser.getLastTab().getUrl());
    }
}
