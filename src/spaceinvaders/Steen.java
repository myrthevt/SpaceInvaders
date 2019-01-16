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

public class Steen {
    // datamembers
    private int x;
    private int y, dy;

    // constructor
    public Steen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    /**
     * Wat is de x-coördinaat van de Steen? (getter)
     * @return de x-coördinaat
     */
    public int getX() {
        return x;
    }

    
    /**
     * Verander de x-coördinaat van de Steen (setter)
     * @param x de nieuwe x-coördinaat
     */
    public void setX(int x) {
        this.x = x;
    }

    
    /**
     * Wat is de y-coördinaat van de Steen (getter)
     * @return de y-coördinaat
     */
    public int getY() {
        return y;
    }

    
    /**
     * Verander de y-coördinaat
     * @param de nieuwe y-coördinaat
     */
    public void setY(int y) {
        this.y = y;
    }
    
   // Methode om naar onder te bewegen
   public void beweegNaarOnder(){
       y = y + 15;
   }   
}
