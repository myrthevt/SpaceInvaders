/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package spaceinvaders;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class FXMLSpaceInvadersViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane achtergrond;

    @FXML
     ImageView alien;

    @FXML
    void initialize() {
            alien = new ImageView("https://www.google.com/search?q=space%20invader%20alien&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiDr5PF3cffAhWMZVAKHWLxAE0Q_AUIDigB&biw=1440&bih=692&fbclid=IwAR1ww0TVcY9Akai8c-G1JnuqjLt3BEBBagpptsyoa6hepN3otrcD_cFeWL8#imgrc=rKxVf3kxU2vSiM");
            
    }
}
