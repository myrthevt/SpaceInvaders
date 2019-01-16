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
    private int y;

    
    //constructor
    public Kogel(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    /**
     * Wat is de x-coördinaat van de Kogel? (getter)
     * @return de x-coördinaat
     */
    public int getX() {
        return x;
    }

    
    /**
     * Wat is de y-coördinaat van de Kogel? (getter)
     * @return de y-coördinaat
     */
    public int getY() {
        return y;
    }

     
    // Methode beweeg de Kogel naar boven
    public void beweegNaarBoven(){
            y -= 15;
    }    
}
