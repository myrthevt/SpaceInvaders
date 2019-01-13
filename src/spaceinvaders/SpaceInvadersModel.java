/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author femke
 */
public class SpaceInvadersModel {
    private LaserKanon kanon;
    private Alien alien;
    private CopyOnWriteArrayList<Kogel> kogels; //thread safe variant of ArrayList (item removed from animationtimer thread)
    private Steen steen;
    
    public SpaceInvadersModel(){
        alien = new Alien(0,0);
        kanon = new LaserKanon(560,580);
        kogels = new CopyOnWriteArrayList<Kogel>();
    }
    
    public Alien getAlien(){
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
    
    public CopyOnWriteArrayList<Kogel> getKogels() { //https://stackoverflow.com/questions/31805873/mutli-threading-how-to-safely-remove-from-arraylist
        return kogels;
    }
    
    public void addKogel(Kogel kogel) {
        this.kogels.add(kogel);
    }
    
    public Steen getSteen(){
        return steen;
    }
    
    
}
