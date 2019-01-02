/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;

/**
 *
 * @author femke
 */
public class LaserKanonView extends Region{
    private LaserKanon model;

    public LaserKanonView(LaserKanon model) {
        this.model = model;
        update();
    }
    public void update(){
        ImageView laserKanon = new ImageView("50074740_2000012966747758_4064027806437212160_n");
        getChildren().add(laserKanon);
    }
    
    
}
