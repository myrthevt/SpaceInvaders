/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceinvaders;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
 

public class FXMLSpaceInvadersViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane achtergrond;

    
    private SpaceInvadersModel model; // controller moet eigenschappen van het model kunnen veranderen
    private SpaceInvadersView view;   // controller moet eigenschappen van de view kunnen veranderen  
    
    @FXML
    void initialize() {
    }
    
    
    /**
     * Wat is het aangepaste model van het spel? (getter)
     * @param model 
     */
    public void setModel(SpaceInvadersModel model){
        this.model = model;
        view = new SpaceInvadersView (model);
        achtergrond.getChildren().add(view);
        view.setFocusTraversable(true);
        view.requestFocus();
                
        view.setOnKeyPressed(this::beweegKanon);
        this.animate();
        model.NieuweAlien();
    }
    
    
    // Methode om de het LaserKanon en de Kogel te laten bewegen met Keyevents
    public void beweegKanon (javafx.scene.input.KeyEvent e){
        switch(e.getCode()){
                case RIGHT:
                    if(model.getKanon().getX() < 1100){
                        model.getKanon().beweegNaarRechts();
                        update();
                        break;}
                    else{
                    }
                case LEFT:
                    if(model.getKanon().getX() > 0){
                        model.getKanon().beweegNaarLinks();
                        update();
                        break;}
                
                case SPACE:
                     
                    this.vuurKogel();
                    break;
                    
         }
        }
     
    
    // Methode om de view te updaten
    public void update() {
        view.update();
    }
    
    
    // AnimationTimer voor de bewegeing en dood van de Alien, idem Kogel
    private void animate() {
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                model.alienDood();
                update();
                System.out.println("Handle");
                for(Alien alien : model.getAliens()){
                    alien.beweeg(1240);
                }
                
                for(Kogel kogel : model.getKogels()) {
                    if (kogel.getY() <= 0) {
                        model.getKogels().remove(kogel);
                    }
                }
                
                for(Kogel kogel : model.getKogels()) {
                    kogel.beweegNaarBoven();
                }
                update();
            }
        }.start();
        




 // We hebben deze AnimationTimer voor de stenen geprobeerd, maar deze verliep veel te snel
        //new AnimationTimer() {
            //private long vorigeKeer = 0;
            //private long minimumTijd = 1999_999_999;
            
            //@Override            
            //public void handle(long now) {
                //long diff = now - vorigeKeer;
                //if(diff >= minimumTijd){
                    //vorigeKeer = now;
                    //for(Steen steen : model.getStenen()){
                        //if (steen.getY() >= 800) {
                            //model.getStenen().remove(steen);
                        //}
                    //}
                    //for(Steen steen : model.getStenen()){
                        //steen.BeweegNaarOnder();
                    //}
                    //for(Alien alien : model.getAliens()){
                    //model.addSteen(new Steen(alien.getX(), alien.getY()));
                    //}
                //}
        //}
    //}.start();
                }
    
    
    // Methode om een Kogel af te vuren
    public void vuurKogel(){
        model.addKogel(new Kogel(model.getKanon().getX() + 65, model.getKanon().getY()));
    }
} 
    

