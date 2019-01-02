/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author vantichelen
 */
public class SteenView extends Region {
    private Steen model;

    public SteenView(Steen model) {
        this.model = model;
        update();
    }
    public void update(){
        Rectangle steen = new Rectangle(3, 3, Color.YELLOW);
        getChildren().add(steen);
    }
    
}
