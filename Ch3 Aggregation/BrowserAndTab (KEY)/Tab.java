/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.model;

/**
 *
 * @author Tisanai.Cha
 */
public class Tab {

    private static int runningNo;
    private int tabId;
    private String url;
    private String pageContent;

    public Tab(String url) {
        this.url = url;
        this.tabId = Tab.runningNo;
        Tab.runningNo++;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPageContent() {
        this.pageContent = "This is the downloaded content from the URL: " + url;
        return this.pageContent;
    }

    @Override
    public String toString() {
        return "Tab Id: " + this.tabId + ", url=" + this.url;
    }

}
