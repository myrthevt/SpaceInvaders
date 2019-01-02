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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class FXMLSpaceInvadersViewController{ 

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane achtergrond;

    @FXML
    private ImageView alien;

    @FXML
    private ImageView laserKanon;

    @FXML
    private Circle kogel;

 


    @FXML
    void initialize() {
        laserKanon.setOnKeyPressed(this::beweegNaarRechts);
        kogel.setOnKeyPressed(this::BeweegNaarBoven);
        alien.setOnAction(this::doeIets);
        
    }
    
    public void beweegNaarRechts(KeyEvent event){
        
        
        
        
    }
    public void BeweegNaarBoven(){
    
    }
    
    
    public void doeIets(){
    
    }
        
    } 
   
}
    

