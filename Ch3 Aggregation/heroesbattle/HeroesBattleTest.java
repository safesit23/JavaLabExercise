/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesbattle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Praisan.pad
 */
public class HeroesBattleTest {

    @Test
    public void armorPowerCanBeSetAndGet() {
        Armor batSuit = new Armor("Bat suit", 50);
        int expected = 50;
        assertEquals(expected, batSuit.getArmor());
    }

    @Test
    public void weaponPowerCanBeSetAndGet() {
        Weapon batarangs = new Weapon("Batarangs", 500);
        int expected = 500;
        assertEquals(expected, batarangs.getPower());
    }

    @Test
    public void heroCanBeAttacted() {
        Weapon batarangs = new Weapon("Batarangs", 500);
        Hero batman = new Hero("Batman", 1500, new Armor("Bat suit", 50), batarangs);
        batman.attacted(batarangs.getPower());
        
        int expected = 1050;
        assertEquals(expected, batman.getHealth());
    }
    
    @Test
    public void heroCanBeAttactedByHero() {
        Hero batman = new Hero("Batman", 1500, new Armor("Bat suit", 50), new Weapon("Batarangs", 500));
        Hero spiderman = new Hero("Spider-Man", 5000, new Armor("Spider suit", 30), new Weapon("Web-Shooters", 200));
        batman.attacted(spiderman);
        
        int expected = 1350;
        assertEquals(expected, batman.getHealth());

    }

    @Test
    public void weaponOfHeroCanBeChanged() {
        Weapon batarangs = new Weapon("Batarangs", 500);
        Hero batman = new Hero("Batman", 1500, new Armor("Bat suit", 50), new Weapon("Flash-Bang Grenades", 2000));
        batman.changeWeapon(batarangs);
        
        int expected = 500;
        assertEquals(expected, batman.getAttactPower());
    }

    @Test
    public void armorOfHeroCanBeChanged() {
        Armor batSuit = new Armor("Bat suit", 50);
        Hero batman = new Hero("Batman", 1500, new Armor("sweater", 5), new Weapon("Flash-Bang Grenades", 2000));
        batman.changeArmor(batSuit);
        batman.attacted(500);

        int expected = 1050;
        assertEquals(expected, batman.getHealth());
    }
}
