/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author femke
 */
public class SpaceInvadersView extends Region {
    private SpaceInvaders model;
    
    public SpaceInvadersView (SpaceInvaders model){
        this.model = model;
        update ();
    }
    
 
    
    
           
    public void update(){
      getChildren().clear();
      Circle kogel = new Circle(Kogel.getX(), Kogel.getY(), 5, Color.VIOLET);
      getChildren().add(kogel);
      Rectangle steen = new Rectangle(295,1, 70, 200);
      getChildren().add(steen);
      
      }
     
          
    }
