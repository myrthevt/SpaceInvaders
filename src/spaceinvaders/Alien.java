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
    public static int x;
    public static int y;

    public Alien(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    public void BeweegRechts(){
        x++;
    }
    public void BeweegLinks(){
        x--;
    }
    public void BeweegOmlaag(){
        y++;
    }
    public boolean IsGeraakt(){
        if (Kogel.x == this.x && Kogel.y == this.y){
            return true;
        }
        else {
            return false;
        }
        }
        
    }
    
    
    
