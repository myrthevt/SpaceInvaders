/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Rectangle;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author vantichelen
 */
public class KogelView extends Region {
    private Kogel model;

    public KogelView(Kogel model) {
        this.model = model;
        update();
    }
    public void update(){
        Circle kogel = new Circle(model.getX(), model.getY(), 5, Color.VIOLET);
        getChildren().add(kogel);
    }
    
}
