/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.util.ArrayList;

/**
 *
 * @author femke
 */
public class SpaceInvadersModel {
    private LaserKanon kanon;
    private ArrayList<Alien> alien;
    private Kogel kogel;
    private Steen steen;
    
    public SpaceInvadersModel(){
        this.alien = new ArrayList<>();
        kanon = new LaserKanon(560,580);
        kogel = new Kogel(300,580);
        steen = new Steen(400,150);
        
    }
    
    public ArrayList<Alien> getAlien(){
        return alien;
    }

    /**
     * @return the kanon
     */
    public LaserKanon getKanon() {
        return kanon;
    }
    
    /**
     * @return the kogel
     */
    
    public Kogel getKogel() {
        return kogel;
    }
    
    public Steen getSteen(){
        return steen;
    }
    
    
}
