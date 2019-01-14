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
public class Kogel {
    //datamembers
    public int x;
    public int y, dy;

    //constructor
    public Kogel(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * wat is het x-coördinaat van de kogel
     * @return het x-coördinaat
     */
    public int getX() {
        return x;
    }

    /**
     * Verander x-coördinaat van de kogel
     * @param x het nieuwe x-coördinaat
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * wat is het y-coördinaat van de kogel?
     * @return y-coördinaat
     */
    public int getY() {
        return y;
    }

    /**
     * verander het y-coördinaat van de kogel
     * @param y nieuwe y-Coördinaat
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * beweeg de kogel naar boven
     */
    public void beweegNaarBoven(){
            y -= 100;
    }

    
    
    //public void Verdwijn(){
        //if(IsGeraakt() == true){
        //Hide(FXMLSpaceInvadersViewController.Kogel);
        //}
    //}
    
    
    
}
