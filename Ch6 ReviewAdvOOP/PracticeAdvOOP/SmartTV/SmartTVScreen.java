package smarttvscreen;

import java.util.Scanner;

public class SmartTVScreen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfRows = 3;
        Cursor cursor = new Cursor(numOfRows);
        HorizontalGrid[] grid = initialization();

        char getKey;
        do {
            System.out.println();
            showMenu(grid, cursor);
            System.out.println("\nEnter a=left, w=top, d=right, s=down, q=exit ");
            System.out.print("Move menu: ");
            getKey = input.next().charAt(0);
            switch (getKey) {
                case 'a':
                    cursor.decreaseColumn();
                    break;
                case 'w':
                    cursor.decreaseRow();
                    break;
                case 'd':
                    cursor.increaseColumn();
                    break;
                case 's':
                    cursor.increaseRow();
                    break;
//3.	ปรับปรุง Method main ของ Class SmartTVScreen เมื่อเลือกปุ่มใด ๆ สามารถแสดงผลลัพธ์จากเมดธอด toString() ของ application ที่อยู่ ณ ตำแหน่งของ Cursor ได้ 
            }

        } while (getKey != 'q');
    }

    private static HorizontalGrid[] initialization() {
        HorizontalGrid[] menu = new HorizontalGrid[3];
        
        HorizontalGrid inputs = new HorizontalGrid("Inputs", 5);
        inputs.addApp(new SystemApp("Setting","Manage look and feel", "management"));
        inputs.addApp(new SystemApp("HDMI1", "input"));
        inputs.addApp(new SystemApp("HDMI2", "input"));
        inputs.addApp(new SystemApp("Video", "input"));

        HorizontalGrid apps = new HorizontalGrid("Featured apps", 10);
        apps.addApp(new InstalledApp("Youtube","Your time","Google Inc."));
        apps.addApp(new InstalledApp("NetFlix","Movie lover","NetFlix"));
        apps.addApp(new InstalledApp("Video","Play your memory","Sony"));
        apps.addApp(new InstalledApp("Kodi","See more","XBMC/Kodi"));
        apps.addApp(new InstalledApp("Music","Relax time","Sony"));
        apps.addApp(new InstalledApp("Album","Show your moment","Sony"));
        
        HorizontalGrid games = new HorizontalGrid("Games", 10);
        games.addApp(new SystemApp("Hub","utility"));
        games.addApp(new InstalledApp("Stickman Battlefields","Djinnworks GmbHs"));
        games.addApp(new InstalledApp("Minion Rush","Gameloft"));
        
        menu[0] = inputs;
        menu[1] = apps;
        menu[2] = games;
        return menu;
    }

    public static void showMenu(HorizontalGrid[] grid, Cursor cursor) {
        for (int i = 0; i < grid.length; i++) {
            if (i == cursor.getRow()) {
                System.out.print("O>");
                grid[i].setFocusIdx(cursor);
            } else {
                grid[i].clearFocusIdx();
            }
            System.out.println(grid[i]);
        }

    }

}
