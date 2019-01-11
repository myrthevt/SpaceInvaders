/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author femke
 */
public class SpaceInvadersView extends Region {
    private SpaceInvadersModel model;
    
    public SpaceInvadersView (SpaceInvadersModel model){
        this.model = model;
        update ();
    }
    
 
    
    
           
    public void update(){
      getChildren().clear();
      ImageView achtergrond = new ImageView("achtergrondSpelFoto.png");
      getChildren().add(achtergrond);
        achtergrond.setFitHeight(1080);
        achtergrond.setFitWidth(1920);
      
      ImageView laserKanon = new ImageView("laserKanonFoto.bmp");
        laserKanon.setFitHeight(140);
        laserKanon.setFitWidth(150);
        laserKanon.setLayoutX(model.getKanon().getX());
        laserKanon.setLayoutY(model.getKanon().getY());
      getChildren().add(laserKanon);
      
      Circle kogel = new Circle(Kogel.getX(), Kogel.getY(), 7, Color.VIOLET);
        kogel.setLayoutX(625);
        kogel.setLayoutY(550);
      getChildren().add(kogel);
      
      Rectangle steen = new Rectangle(127, 140, 5, 15);
        steen.setFill(Color.ORANGE);
      getChildren().add(steen);
      
      ImageView alien = new ImageView("alienFoto.png");
        alien.setFitHeight(50);
        alien.setFitWidth(60);
        alien.setLayoutX(100);
        alien.setLayoutY(80);

      getChildren().add(alien);
      }
     
          
    }
