/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

/**
 *
 * @author Van Tichelen Myrthe, Schreurs Femke, Maes Marie-Julie
 */

public class LaserKanon {
    // datamembers
    private int x;
    private int y;

    
    // constructor
    public LaserKanon(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    /**
     * Wat is de x-coördinaat van het LaserKanon? (getter)
     * @return de x-coördinaat 
     */
    public int getX() {
        return x;
    }

    
    /**
     * Verander de x-coördinaat van het LaserKanon (setter)
     * @param x de nieuwe x-coördinaat
     */
    public void setX(int x) {
        this.x = x;
    }

    
    /**
     * Wat is de y-coördinaat van het LaserKanon? (getter)
     * @return de y-coördinaat
     */
    public int getY() {
        return y;
    }
    

    /**
     * Verander de y-coördinaat (setter)
     * @param y de nieuwe y-coördinaat
     */
    public void setY(int y) {
        this.y = y;
    }
    
   
    // Methode beweeg naar rechts
    public void beweegNaarRechts(){
        x = (x+5);
    }
    
    
    // Methode beweeg naar links
    public void beweegNaarLinks(){
        x = (x-5);
    }   
}
