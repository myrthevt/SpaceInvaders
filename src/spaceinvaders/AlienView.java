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

/**
 *
 * @author vantichelen
 */
public class AlienView extends Region {
    private Alien model;

    public AlienView(Alien model) {
        this.model = model;
        update();
    }
    public void update(){
        ImageView alien = new ImageView("alienFoto.png[R/-]");
        getChildren().add(alien);
    }
    
    
    
}

