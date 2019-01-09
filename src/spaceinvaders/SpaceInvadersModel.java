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
    private ArrayList<Alien> Alien;
    
    public SpaceInvadersModel(){
        this.Alien = new ArrayList<>();
    }
    
    public ArrayList<Alien> getAlien(){
        return Alien;
    }
    
}
