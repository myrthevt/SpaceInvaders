/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceinvaders;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
 

public class FXMLSpaceInvadersViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane achtergrond;

    
    private SpaceInvadersModel model; // controller moet eigenschappen van het model kunnen veranderen
    private SpaceInvadersView view; 
    
    @FXML
    void initialize() {
        System.out.println("ddjhgj");
    }
    
    public void setModel(SpaceInvadersModel model){
        this.model = model;
        view = new SpaceInvadersView (model);
        achtergrond.getChildren().add(view);
        view.setFocusTraversable(true);
        view.requestFocus();
                
        view.setOnKeyPressed(this::beweegKanon);
        this.animate();
    }
     public void beweegKanon (javafx.scene.input.KeyEvent e){
         switch(e.getCode()){
                case RIGHT:
                    
                    model.getKanon().beweegNaarRechts();
                    update();
                    break;
                case LEFT:
                    
                    model.getKanon().beweegNaarLinks();
                    update();
                    break;
                
                case SPACE:
                     
                    this.vuurKogel();
                    break;
                    
         }
        }
     
    public void update() {
        view.update();
    }
    private void animate() {
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                
                model.getAlien().Beweeg(1000);
                
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
        new AnimationTimer() {
            private long vorigeKeer = 0;
            private long minimumTijd = 1000_000_000;
            
            @Override            
            public void handle(long now) {
                long diff = now - vorigeKeer;
                if(diff >= minimumTijd){
                    vorigeKeer = now;
                    System.out.println("hey");
                    for(Steen steen : model.getStenen()){
                        if (steen.getY() >= 600) {
                            model.getStenen().remove(steen);
                        }
                    }
                    for(Steen steen : model.getStenen()){
                        steen.BeweegNaarOnder();
                    }
                    model.addSteen(new Steen(model.getAlien().getX(), model.getAlien().getY()));
                }
        }
    }.start();
                }
    
     public void vuurKogel(){
        model.addKogel(new Kogel(model.getKanon().getX() + 65, model.getKanon().getY()));
    }

} 
    

