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
    
    public SpaceInvadersModel(){
        this.alien = new ArrayList<>();
        kanon = new LaserKanon(200,400);
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
    
    
}
