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
public class Alien {
    //datamembers
    private int x, dx;
    private int y;
    private boolean visible;
    private SpaceInvadersModel model;    
    private boolean gaatNaarLinks;
    
    //constructor
    public Alien(int x, int y) {
        this.x = x;
        this.y = y;
        visible = true;
    }

    
    /**
     * Wat is de x-Coördinaat van de Alien? (getter)
     * @return de x-coördinaat
     */
    public int getX() {
        return x;
    }

    
    /**
     * Verander de x-coördinaat (setter)
     * @param x de nieuwe x-coördinaat
     */
    public void setX(int x) {
        this.x = x;
    }

    
    /**
     * Wat is de y-coördinaat van de Alien? (getter)
     * @return de y-coördinaat
     */
    public int getY() {
        return y;
    }

    
    /**
     * Verander de y-coördinaat van de Alien? (setter)
     * @param y de nieuwe y-coördinaat
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
    // Methode beweeg naar rechts
    public void beweegRechts(){
        x+=5;
    }
    
    
    //Methode beweeg naar links
    public void beweegLinks(){
        x-=5;
    }
    

    /**
     * Methode voor de limiet van de beweging van de ALien
     * @param maximale breedte
     */
    public void beweeg(double maxWidth) {
        if (x >= maxWidth) {
            gaatNaarLinks = true;
        }
        if (x <= 0) {
            gaatNaarLinks = false;
        }
        
        if (gaatNaarLinks) {
            beweegLinks();
        } 
        else {
            beweegRechts();
        }
    }

    
    /**
     * Is de Alien zichtbaar of niet? (getter)
     * @return de zichtbaarheid
     */
    public boolean isVisible() {
        return visible;
    }

    
    /**
     * Verander de zichtbaarheid (setter)
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    /*
    * tick methode van de Alien
    */
    public void tick(){
        x = x + dx;
    }
    
}
    
        
    
    
    
    
