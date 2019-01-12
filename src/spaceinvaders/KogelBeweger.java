/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.util.TimerTask;
import javafx.application.Platform;

/**
 *
 * @author femke
 */
public class KogelBeweger extends TimerTask {
    private SpaceInvadersModel model;
    private SpaceInvadersView view;
    
    public KogelBeweger(SpaceInvadersModel model, SpaceInvadersView view){
        this.model = model;
        this.view = view;
    }
    
    public void run(){
        model.getKogel().beweegNaarBoven();
        Platform.runLater(()-> view.update());
    }
            
}
