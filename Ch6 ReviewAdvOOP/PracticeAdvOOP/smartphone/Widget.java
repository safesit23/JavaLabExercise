/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;

/**
 *
 * @author Praisan.pad
 */
public class Widget extends Item{
    private int nGrid;

    public Widget(String name,int nGrid) {
        super(name);
        this.nGrid = Math.min(nGrid, Screen.MAX_GRID);
    }

    public int getnGrid() {
        return nGrid;
    }

    @Override
    public String toString() {
        return "Widget "+this.getName()+" "+nGrid+" grids";
    }
    
    
}
