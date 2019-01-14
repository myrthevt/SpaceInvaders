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
      
      if(!model.getKogels().isEmpty()) {
          for(Kogel kogel : model.getKogels()) {
            Circle kogelView = new Circle(kogel.getX(), kogel.getY(), 7, Color.VIOLET);
            getChildren().add(kogelView);
          }
      }
      
      if(!model.getStenen().isEmpty()){
         for(Steen steen : model.getStenen()){
            Rectangle steenView = new Rectangle(steen.getX(),steen.getY(), 5, 15);
            steenView.setFill(Color.ORANGE);
            getChildren().add(steenView);  
        }
      }
      for(Alien alien : model.getAliens()){
            ImageView alienView = new ImageView("alienFoto.png");
            alienView.setFitHeight(50);
            alienView.setFitWidth(60);
            alienView.setLayoutX(alien.getX());
            alienView.setLayoutY(alien.getY());

        getChildren().add(alienView);
      }
    
     
          
    }
}

