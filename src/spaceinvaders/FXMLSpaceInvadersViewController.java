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
                     
                    this.beweegNaarBoven(e);
                    update();
                    
         }
        }
     
    //public void schietKogel(javafx.scene.input.KeyEvent e){
        //switch(e.getCode()){ 
                //case ENTER:
                    //model.getKogel().tick();
                    //update(); 

    public void update() {
        view.update();
    }
    public void beweegNaarBoven(javafx.scene.input.KeyEvent e){
        KogelBeweger kogelBeweger = new KogelBeweger(model, view);
        Timer t = new Timer(true);
        t.scheduleAtFixedRate(kogelBeweger,1,30);
        
    
    }
    
    public void doeIets(){
    
    }
} 
    

