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
    public int x;
    public int y;
    public boolean isVisible;
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
        x+=15;
    }
    /** 
     * beweeg naar links
     */
    public void BeweegLinks(){
        x-=15;
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
public void AlienDood(){
        for(Alien alien : model.getAliens()){
         for(Kogel kogel : model.getKogels()){
             if(alien.getX() == kogel.getX() && alien.getY() == kogel.getY()){
                alien.isVisible = false;
             }
         }
     }
    }
    }
    
        
    
    
    
    
