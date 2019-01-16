/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceinvaders;

/**
 *
 * @author Van Tichelen Myrthe, SSchreurs Femke, Maes Marie-Julie
 */

public class Kogel {
    //datamembers
    private int x;
    private int y, dy;

    
    //constructor
    public Kogel(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    /**
     * Wat is de x-coördinaat van de kogel? (getter)
     * @return de x-coördinaat
     */
    public int getX() {
        return x;
    }

    
    /**
     * Verander de x-coördinaat van de kogel (setter)
     * @param x de nieuwe x-coördinaat
     */
    public void setX(int x) {
        this.x = x;
    }

    
    /**
     * Wat is de y-coördinaat van de kogel? (getter)
     * @return de y-coördinaat
     */
    public int getY() {
        return y;
    }

    
    /**
     * Verander de y-coördinaat van de kogel (setter)
     * @param y de nieuwe y-Coördinaat
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
    /**
     * Methode beweeg de kogel naar boven
     */
    public void beweegNaarBoven(){
            y -= 15;
    }    
}
