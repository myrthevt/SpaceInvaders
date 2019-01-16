/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Van Tichelen Myrthe, Schreurs Femke, Maes Marie-Julie
 */

public class SpaceInvadersModel {
    // datamembers
    private LaserKanon kanon;
    private CopyOnWriteArrayList<Alien> aliens; // Een lijst om veilig een element (Alien) uit de ArrayList te verwijderen, tijdens een Animation Timer
    private CopyOnWriteArrayList<Kogel> kogels; //Een lijst om veilig een element (Kogel) uit de ArrayList te verwijderen, tijdens een AnimationTimer
    private CopyOnWriteArrayList<Steen> stenen; // Een lijst om veilig een element (Steen) uit de ArrayList te verijderen, tijdens een AnimationTimer
   
    
    public SpaceInvadersModel(){
        // constructor
        aliens = new CopyOnWriteArrayList<Alien>();
        kanon = new LaserKanon(560,580);
        kogels = new CopyOnWriteArrayList<Kogel>();
        stenen = new CopyOnWriteArrayList<Steen>();
    }
    
    
    /*
    * Wat is de lijst met Aliens? (getter)
    *@return de lijst
    */
    public CopyOnWriteArrayList<Alien> getAliens(){
        return aliens;
    }

    
    /**
     * Getter voor het LaserKanon
     * @return het kanon
     */
    public LaserKanon getKanon() {
        return kanon;
    }
    
    
    /**
     * Wat is de lijst met Kogels?
     * @return de lijst
     */
    public CopyOnWriteArrayList<Kogel> getKogels() { //https://stackoverflow.com/questions/31805873/mutli-threading-how-to-safely-remove-from-arraylist
        return kogels;
    }
    
    
    /**
     * Wat is de lijst met Stenen?
     * @return de lijst
     */
    public CopyOnWriteArrayList<Steen> getStenen() { 
        return stenen;
      }
      
    
    /**
     * Methode om Kogels toe te voegen aan de Lijst met Kogels
     * @param de kogel 
     */
    public void addKogel(Kogel kogel) {
        this.kogels.add(kogel);
    }
    
    
    /**
     * Methode om Stenen toe te voegen aan de Lijst met Stenen
     * @param de steen
     */
    public void addSteen(Steen steen) {
        this.stenen.add(steen);
    }
    
    
    //Methode om meerde Aliens op het scherm te hebben
    public void NieuweAlien(){ 
        //eerste rij Aliens
        for(int i = 0; i < 5; i++){
            this.addAlien(new Alien(i*70, 0));
        //tweede rij Aliens    
        for (int a = 0; a < 5; a++){
            this.addAlien(new Alien(a*70, 70));
        }  
        //derde rij Aliens
        for (int b = 0; b < 5; b++){
            this.addAlien(new Alien(b*70, 140));
        }
        }
    }
    
    
    /**
     * Methode om een Alien toe te voegen aan de lijst met Aliens
     * @param alien 
     */
    public void addAlien(Alien alien){
        this.aliens.add(alien);
    }
    
    
    //Methode om de Alien te doden
    public void alienDood(){
        for(Alien alien : this.aliens) {;
         for(Kogel kogel : this.kogels){
            if(kogel.getX() - 7 >= alien.getX() && kogel.getX() + 7 <= alien.getX() + 50){
                if(kogel.getY() -7 <= alien.getY() + 50){
                     
                    aliens.remove(alien); 
                    kogels.remove(kogel);
                }
            }
        }
    }
    }
  
    
    public void gedaan(){
        int i = 0;
        for(Alien alien : aliens){
            if(alien.isVisible() == true)  
                i++;
            
        }
            if(i == 1){
                System.exit(0);
            }
        }
    }
