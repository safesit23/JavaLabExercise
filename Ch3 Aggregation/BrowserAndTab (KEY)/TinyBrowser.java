/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browsertabproject;

import int105.model.Browser;
import int105.model.Tab;
public class TinyBrowser {
    
    public static void main(String[] args) {
        Browser browser = new Browser(5);
        Tab t1 = new Tab("www.sit.kmutt.ac.th");
        browser.newTab(t1);
        
        Tab t2 = new Tab("www.kmutt.ac.th");
        browser.newTab(t2);
        System.out.println("Output #01\n" + browser);
        
        browser.setActiveTabIndex(0);           //เปลี่ยน default 0 ให้เป็น ActiveTab
        Tab currentTab = browser.getActiveTab();
        currentTab.setUrl("www.kmutt.ac.th");
        //อีกวิธี
        browser.setActiveTabIndex(0);           //เปลี่ยน default 0 ให้เป็น ActiveTab
        browser.getActiveTab().setUrl("www.kmutt.ac.th");   //เข้าไปแก้ Url ของ ActiveTab

        System.out.println("Output #02\n" + browser);
    }
}
