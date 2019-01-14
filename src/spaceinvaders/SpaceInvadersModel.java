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
    private CopyOnWriteArrayList<Alien> aliens;
    private CopyOnWriteArrayList<Kogel> kogels; //thread safe variant of ArrayList (item removed from animationtimer thread)
    private CopyOnWriteArrayList<Steen> stenen;
    private int aantalAliens;
    
    public SpaceInvadersModel(){
        aliens = new CopyOnWriteArrayList<Alien>();
        kanon = new LaserKanon(560,580);
        kogels = new CopyOnWriteArrayList<Kogel>();
        stenen = new CopyOnWriteArrayList<Steen>();
    }
    
    public CopyOnWriteArrayList<Alien> getAliens(){
        return aliens;
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
      public CopyOnWriteArrayList<Steen> getStenen() { 
        return stenen;
      }
    public void addKogel(Kogel kogel) {
        this.kogels.add(kogel);
    }
    
    public void addSteen(Steen steen) {
        this.stenen.add(steen);
    }
    public void NieuweAlien(){ 
        for(int i = 0; i < 5; i++){
            this.addAlien(new Alien(i*70, 0));
        for (int a = 0; a < 5; a++){
            this.addAlien(new Alien(a*70, 70));
        }  
        for (int b = 0; b < 5; b++){
            this.addAlien(new Alien(b*70, 140));
        }
        }
    }
    public void addAlien(Alien alien){
        this.aliens.add(alien);
    }
    
    
}
