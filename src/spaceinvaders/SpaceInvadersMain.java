/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author vantichelen
 */
public class SpaceInvadersMain extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
      //model
      SpaceInvadersModel model = new SpaceInvadersModel();
      Alien alien = new Alien(0,0);
      LaserKanon laserkanon = new LaserKanon(20,50);
      
      //view
      FXMLLoader lader = new FXMLLoader(getClass().getResource("FXMLSpaceInvadersView.fxml"));
      Parent view = lader.load();
      
      //controller
      FXMLSpaceInvadersViewController controller = lader.getController();
      
      //Alles aan elkaar linken
      controller.setModel(model);
      
      Scene scene = new Scene(view);
      
      stage.setScene(scene);
      stage.show();
      stage.setMinHeight(400);
      stage.setMinWidth(600);
      
    }
      
      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
