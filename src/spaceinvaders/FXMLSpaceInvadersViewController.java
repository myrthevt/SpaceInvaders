/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceinvaders;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
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
        achtergrond.setOnKeyPressed(this::beweegKanon);
    }
    
    public void setModel(SpaceInvadersModel model){
        this.model = model;
        view = new SpaceInvadersView (model);
        achtergrond.getChildren().add(view);
    }
     public void beweegKanon (javafx.scene.input.KeyEvent e){
        switch(e.getCode()){
                case RIGHT:
                    LaserKanon.beweegNaarRechts();
                //case KP_UP:
                //case SPACE:
                //case Z:    
                    //model.boven();
                    //update();
                    //break;
    }
    
    //public void beweegNaarRechts(KeyEvent event){
        
        
        
        
    }
    public void BeweegNaarBoven(){
    
    }
    
    
    public void doeIets(){
    
    }
} 
    

