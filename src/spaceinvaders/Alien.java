/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

/**
 *
 * @author vantichelen
 */
public class Alien {
    //datamembers
    private int x;
    private int y;
    private boolean visible;
    private SpaceInvadersModel model;
    
    public boolean gaatNaarLinks;
    
    //constructor
    public Alien(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * wat is het x-Coördinaat van de Alien
     * @return het x-coördinaat
     */
    public int getX() {
        return x;
    }

    /**
     * verander het x-coördinaat
     * @param x het nieuwe x-coördinaat
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * wat is het y-coördinaat van de alien?
     * @return het y-coördinaat
     */
    public int getY() {
        return y;
    }

    /**
     * verander het y-coördinaat van de Alien
     * @param y nieuwe y-coördinaat
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
    /**
     * beweeg naar rechts
     */
    public void BeweegRechts(){
        x+=5;
    }
    /** 
     * beweeg naar links
     */
    public void BeweegLinks(){
        x-=5;
    }
    /**
     * beweeg omlaag
     */
    public void BeweegOmlaag(){
        y += 5;
    }
    public void Beweeg(double maxWidth) {
        if (x >= maxWidth) {
            gaatNaarLinks = true;
        }
        if (x <= 0) {
            gaatNaarLinks = false;
        }
        
        if (gaatNaarLinks) {
            BeweegLinks();
        } else {
            BeweegRechts();
        }
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    }
    
        
    
    
    
    
